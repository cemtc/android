package com.qy.emt.fragment.main;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.qy.emt.R;
import com.qy.emt.aty.base.BaseAty;
import com.qy.emt.bean.other.database.WalletBean;
import com.qy.emt.utils.StatusBarUtil;
import com.qy.emt.utils.Utils;
import com.qy.emt.utils.blockchain.BlockChainUtils;
import com.qy.emt.utils.database.DatabaseWalletUtils;
import com.qy.emt.utils.function.ScreenUtils;
import com.qy.emt.utils.function.StringUtils;
import com.qy.emt.utils.function.safety.AES256;
import com.qy.emt.view.group.NavigationLucencyLayout;

import java.util.List;

import butterknife.BindView;

public class NonImportWalletInAty extends BaseAty {

    @BindView(R.id.nll_wallet_market)
    NavigationLucencyLayout nll_wallet_market;

    @Override
    public int initView() {
        return R.layout.aty_import_nonemic_in;
    }

    @BindView(R.id.nenemic_word_id)
    EditText nenemic_word_id;

    @BindView(R.id.wallet_name_id)
    EditText wallet_name_id;

    @BindView(R.id.create_wallet_buttom_id)
    Button create_wallet_buttom_id;

    private String coin;

    private Dialog dialog;

    @Override
    public void setListener() {
        create_wallet_buttom_id.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if ("".equals(nenemic_word_id.getText().toString().trim())) {
                    Utils.Toast("Mnemonic cannot be empty");
                    return;
                }

                if ("".equals(wallet_name_id.getText().toString().trim())) {
                    Utils.Toast("Wallet name cannot be empty");
                    return;
                }

                dialog = new Dialog(view.getContext(), R.style.DialogThemeHalfAlpa);
                View view1 = LayoutInflater.from(view.getContext()).inflate(R.layout.pow_dialog, null);
                dialog.setContentView(view1);
                dialog.setCanceledOnTouchOutside(true);
                Window dialogWindow = dialog.getWindow();

                WindowManager.LayoutParams p = dialogWindow.getAttributes(); // 获取对话框当前的参数值
//                                    p.height = DisplayUtil.dip2px(activity, 230f) // 高度设置为屏幕的0.6，根据实际情况调整
//                    p.width = DisplayUtil.dip2px(this.getActivity(), 300f); // 宽度设置为屏幕的0.65，根据实际情况调整
//                    dialogWindow.setAttributes(p);


                int hi = ScreenUtils.getScreenWidth(view.getContext());
//                p.width = DisplayUtil.dip2px(this, Float.valueOf(hi)); // 宽度设置为屏幕的0.65，根据实际情况调整
                p.width = hi; // 宽度设置为屏幕的0.65，根据实际情况调整
                dialogWindow.setAttributes(p);
                dialog.setCanceledOnTouchOutside(true);
                dialog.setCancelable(true);

                dialog.show();

                EditText pow = view1.findViewById(R.id.ppe_wallet_affirmpassword);
                Button pow_button = view1.findViewById(R.id.pow_button);
                ImageView powd_diss = view1.findViewById(R.id.powd_diss);

//                    pow.initStyle(R.drawable.edit_num_bg2, 6, 0.33f, R.color.black, R.color.black, 30);
                powd_diss.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dialog.dismiss();
                    }
                });
                //密码输入完后的回调
                pow_button.setOnClickListener(view3 -> {
                    String tradePwd = pow.getText().toString();
                    List<WalletBean> walletBeans = DatabaseWalletUtils.getLocalCoinList_CCM("EMTC");
                    String testPass = "";
                    if (walletBeans.size() > 0) {
                        testPass = AES256.SHA256Decrypt(walletBeans.get(0).getPrivateKey(), pow.getText().toString());
                    }
                    if (!StringUtils.isEmpty(testPass)) {

                        //手动收起软键盘
                        //手动收起软键盘
                        InputMethodManager imm = (InputMethodManager)
                                view.getContext().getSystemService(Context.INPUT_METHOD_SERVICE);
                        imm.hideSoftInputFromWindow(pow.getWindowToken(), 0);

                        dialog.dismiss();

                        new NonImportWalletInAty.MyAsyncTask().execute(nenemic_word_id.getText().toString(), wallet_name_id.getText().toString().trim(), coin, tradePwd);

                    } else {
                        Utils.Toast("The transaction password is wrong! please enter again");
                        return;
                    }
                });
            }
        });
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
            String name = strings[1];
            String coin = strings[2];
            String pow = strings[3];
            newAddress = BlockChainUtils.importTheWallet(mnemonicWord, pow, coin, name);
            if (newAddress == null) {
                return null;
            }

            Log.e("============", "newAddress:" + newAddress);

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
                Utils.Toast("Mnemonic is illegal");
            } else {
                Utils.Toast("Successfully imported");
                finish();
            }

        }

    }

    @Override
    public void fillData() {
        coin = getIntent().getStringExtra("coinName");
        nll_wallet_market.setTitle("");
        StatusBarUtil.setStatusColor(this, true, false, R.color.color_0692c2);
        StatusBarUtil.setStatusBarColor(this, R.color.color_0692c2);
    }
}
