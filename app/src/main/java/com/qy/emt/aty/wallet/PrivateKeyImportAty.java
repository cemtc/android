package com.qy.emt.aty.wallet;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.qy.emt.R;
import com.qy.emt.aty.MainAty;
import com.qy.emt.aty.base.BaseAty;
import com.qy.emt.bean.other.database.WalletBean;
import com.qy.emt.config.Config;
import com.qy.emt.utils.StatusBarUtil;
import com.qy.emt.utils.Utils;
import com.qy.emt.utils.blockchain.BlockChainUtils;
import com.qy.emt.utils.database.DatabaseWalletUtils;
import com.qy.emt.utils.function.StringUtils;
import com.qy.emt.view.group.NavigationLucencyLayout;

import java.util.List;
import java.util.regex.Pattern;

import butterknife.BindView;
import butterknife.OnClick;

public class PrivateKeyImportAty extends BaseAty {

    @BindView(R.id.nll_wallet_market)
    NavigationLucencyLayout nll_wallet_market;

    @BindView(R.id.private_key_id)
    EditText private_key_id;
    @BindView(R.id.wallet_name_id)
    EditText wallet_name_id;
    @BindView(R.id.wallet_pass_id)
    EditText wallet_pass_id;
    @BindView(R.id.wallet_pass_conf_id)
    EditText wallet_pass_conf_id;
    @BindView(R.id.is_show_pass_id)
    ImageView is_show_pass_id;
    @BindView(R.id.import_wallet_button_id)
    Button import_wallet_button_id;

    private Boolean isShowPass = false;
    private String state;
    private String coin;

    @OnClick({R.id.import_wallet_button_id,R.id.is_show_pass_id})
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.import_wallet_button_id:

                if (StringUtils.isEmpty(private_key_id.getText().toString())) {
                    Utils.Toast("Private key address cannot be empty");
                    return;
                }
                if (wallet_name_id.getText().toString().isEmpty()) {
                    Utils.Toast("Wallet name cannot be empty");
                    return;
                }

                if (wallet_pass_id.getText().toString().isEmpty()) {
                    Utils.Toast("password can not be blank");
                    return;
                }

                if (!Pattern.matches(Utils.passRegex, wallet_pass_id.getText().toString())) {
                    Utils.Toast("Password must be 8-32 alphanumeric combination");
                    return;
                }

                if (!wallet_pass_id.getText().toString().equals(wallet_pass_conf_id.getText().toString())) {
                    Utils.Toast("Inconsistent input password twice");
                    return;
                }

//                创建钱包
                InputMethodManager imm = (InputMethodManager)
                        getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(wallet_pass_id.getWindowToken(), 0);


                dialogUtils.showProgressDialog();

//                import   private key

                new PrivateKeyImportAty.MyAsyncTask().execute(private_key_id.getText().toString(), "12", wallet_pass_id.getText().toString(),wallet_name_id.getText().toString());

                break;
            case R.id.is_show_pass_id:
                if (!isShowPass) {
                    wallet_pass_id.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                    is_show_pass_id.setImageResource(R.mipmap.icon_found_eyes);
                    isShowPass = true;
                } else {
                    wallet_pass_id.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    is_show_pass_id.setImageResource(R.mipmap.icon_close);
                    isShowPass = false;
                }

                break;
            default:
                break;
        }
    }

    class MyAsyncTask extends AsyncTask<String, Void, Bitmap> {
        private String newAddress;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            //onPreExecute用于异步处理前的操作
            dialogUtils.showProgressDialog();


        }

        @Override
        protected Bitmap doInBackground(String... strings) {
            //在doInBackground方法中进行异步任务的处理.
            //获取传进来的参数
            String mnemonicWord = strings[0];
            String state = strings[1];
            String pow = strings[2];
            String walletName = strings[3];
            if ("11".equals(state)) {
                newAddress = BlockChainUtils.importTheWallet(mnemonicWord, "", coin,"");
                Log.e("============", "newAddress:" + newAddress);
                List<WalletBean> walletList2 = DatabaseWalletUtils.getLocalCoinList_CCM("EMTC");
                List<WalletBean> walletList = DatabaseWalletUtils.getLocalCreatedWalletList(newAddress, coin, Config.getMobleMapping());
                if (walletList == null || walletList.isEmpty()) {
                    BlockChainUtils.importTheWallet(mnemonicWord, pow, coin,"");
                } else {
                    newAddress = "existed";
                }
            } else if ("12".equals(state)) {
                newAddress = BlockChainUtils.imputPricate(mnemonicWord, "", coin,walletName);
                if (newAddress == null) {
                    return null;
                }
                Log.e("============", "newAddress:" + newAddress);
                List<WalletBean> walletList = DatabaseWalletUtils.getLocalCreatedWalletList(newAddress, coin, Config.getMobleMapping());
                if (walletList == null || walletList.isEmpty()) {
                    BlockChainUtils.imputPricate(mnemonicWord, pow, coin,walletName);
                } else {
                    newAddress = "existed";
                }
            }
            return null;
        }

        @Override
        protected void onPostExecute(Bitmap bitmap) {
            super.onPostExecute(bitmap);
            dialogUtils.dismissProgressDialog();
            Log.e("============", "newAddress:" + newAddress);
            if ("existed".equals(newAddress)) {
                Utils.Toast("The imported address already exists");
            } else if (newAddress == null) {
                Utils.Toast("Private key address is invalid");
                dialogUtils.dismissProgressDialog();
            } else {
//                Intent intent = new Intent();
                myStartActivity(MainAty.class);
                finish();
//                setResult(12, intent);
//                finish();
            }

        }
    }


    @Override
    public int initView() {
        return R.layout.aty_private_key_import;
    }


    @Override
    public void setListener() {
    }

    @Override
    public void fillData() {

        showStatusBar(true);
        StatusBarUtil.setStatusColor(this, true, true, R.color.color_0692c2);
        nll_wallet_market.setTitle("Private key import");
        state = "12";
        coin = "EMTC";
    }
}
