package com.qy.emt.aty;

import android.Manifest;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.alibaba.fastjson.JSONObject;
import com.qy.emt.R;
import com.qy.emt.aty.base.BaseAty;
import com.qy.emt.aty.wallet.CreateImportAty;
import com.qy.emt.bean.other.database.WalletBean;
import com.qy.emt.config.Config;
import com.qy.emt.config.EthConfig;
import com.qy.emt.retrofit.Constants;
import com.qy.emt.retrofit.HttpRequestCallback;
import com.qy.emt.retrofit.HttpUtils;
import com.qy.emt.utils.StatusBarUtil;
import com.qy.emt.utils.UpdateVersionController;
import com.qy.emt.utils.Utils;
import com.qy.emt.utils.blockchain.BlockChainUtils;
import com.qy.emt.utils.database.DatabaseWalletUtils;
import com.qy.emt.utils.database.WalletCoinUtils;
import com.qy.emt.utils.function.ScreenUtils;
import com.qy.emt.utils.function.StringUtils;
import com.qy.emt.utils.function.safety.AES256;
import com.qy.emt.utils.system.PermissionUtils;
import com.qy.emt.websocket.SocketClient;
import com.uuzuche.lib_zxing.DisplayUtil;

import org.litepal.LitePal;
import org.litepal.tablemanager.callback.DatabaseListener;

import java.math.BigDecimal;
import java.net.URISyntaxException;
import java.security.SecureRandom;
import java.util.List;
import java.util.TreeMap;

import io.github.novacrypto.bip39.MnemonicGenerator;
import io.github.novacrypto.bip39.Words;
import io.github.novacrypto.bip39.wordlists.English;

/**
 * Description:闪屏页
 * Data：2019/5/17-12:35 PM
 *
 * @author
 */
public class SplashAty extends BaseAty implements HttpRequestCallback<Object> {

    private Dialog dialogLicai;

    @Override
    public int initView() {
        return R.layout.aty_splash;
    }

    @Override
    public void setListener() {

        try {
            SocketClient.webMarket();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }

        LitePal.registerDatabaseListener(new DatabaseListener() {
            @Override
            public void onCreate() {

            }

            @Override
            public void onUpgrade(int oldVersion, int newVersion) {
                switch (oldVersion) {
                    case 28:

                    default:
                }
            }
        });

    }

    @Override
    public void fillData() {
        StatusBarUtil.setBarStatusIsTRANSPARENT(this);
        requestData(0);
    }

    private void requestData(int type) {
        TreeMap<String, Object> map;
        if (type == 0) {
            map = new TreeMap<>();
            map.put("versionName", Utils.getVersionName(this));
            map.put("type", 1);
            HttpUtils.getHttpUtils().executeGet(this, map, "getVersionInfo", type, this);
        }
    }

    /**
     * 接口请求成功
     */
    @Override
    public void onRequestSuccess(String result, int type) {

        try {
            if (!TextUtils.isEmpty(result)) {
                if (type == 0) {
                    JSONObject jsonObject = JSONObject.parseObject(result);
//                    jsonObject = jsonObject.getJSONObject("data");

                    Config.setToken(jsonObject.getString("data"));

                    dialogLicai = new Dialog(this);
                    View view1 = LayoutInflater.from(this).inflate(R.layout.uploaddialog, null);
                    dialogLicai.setContentView(view1);
                    dialogLicai.setCanceledOnTouchOutside(false);
                    dialogLicai.setCancelable(false);
                    Window dialogWindow = dialogLicai.getWindow();

                    WindowManager.LayoutParams p = dialogWindow.getAttributes(); // 获取对话框当前的参数值
                    p.width = DisplayUtil.dip2px(this, 300f); // 宽度设置为屏幕的0.65，根据实际情况调整
                    p.height = DisplayUtil.dip2px(this, 200f); // 宽度设置为屏幕的0.65，根据实际情况调整
                    dialogWindow.setAttributes(p);

                    dialogLicai.show();
                    TextView sure = view1.findViewById(R.id.sure);
                    sure.setOnClickListener(v -> {
                        dialogLicai.dismiss();

                        if (PermissionUtils.permissionJudge(this, PermissionUtils.WRITE_EXTERNAL_STORAGE)) {
                            new UpdateVersionController(this).downLoadApk(Constants.BASE_URL_ONE + jsonObject.getString("info"));

                        } else {
                            rxPermissions
                                    .request(Manifest.permission.WRITE_EXTERNAL_STORAGE)
                                    .subscribe(granted -> {
                                        if (granted) {
                                            new UpdateVersionController(this).downLoadApk(Constants.BASE_URL_ONE + jsonObject.getString("info"));
                                        } else {
                                            Utils.Toast("没有写内存的使用权限");
                                        }
                                    });
                        }
                    });
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private Dialog dialog;

    /**
     * 接口请求失败
     */
    @Override
    public void onRequestFail(String value, String failCode, int type) {

        Config.setToken(value);

        new Handler().postDelayed(() -> {
            List<WalletBean> walletBeans = DatabaseWalletUtils.getLocalCoinList(10);
            if (walletBeans != null && walletBeans.size() > 0) {

                for (WalletBean walletBean : walletBeans) {
                    if (walletBean.getTokenNameZhCN() == null || "".equals(walletBean.getTokenNameZhCN())) {
                        walletBean.setTokenNameZhCN("EMTC");
                        DatabaseWalletUtils.updateLocalData(walletBean, walletBean.getTokenAddress(), walletBean.getTokenName(), walletBean.getMobileMapping(), 1D);

                    }
                }
            }
//            更新btc错误数据
            walletBeans = DatabaseWalletUtils.getLocalCoinList_CCM("BTC");
            if (walletBeans != null && !walletBeans.isEmpty()) {
                for (WalletBean walletBean : walletBeans) {
                    if (!walletBean.getTokenAddress().startsWith("1")) {

//                        Utils.Toast("密码错误！请重新输入");
                        dialog = new Dialog(this, R.style.DialogThemeHalfAlpa);
                        View view1 = LayoutInflater.from(this).inflate(R.layout.pow_dialog, null);
                        dialog.setContentView(view1);
                        dialog.setCanceledOnTouchOutside(true);
                        Window dialogWindow = dialog.getWindow();

                        WindowManager.LayoutParams p = dialogWindow.getAttributes(); // 获取对话框当前的参数值
//                                    p.height = DisplayUtil.dip2px(activity, 230f) // 高度设置为屏幕的0.6，根据实际情况调整
//                    p.width = DisplayUtil.dip2px(this.getActivity(), 300f); // 宽度设置为屏幕的0.65，根据实际情况调整
//                    dialogWindow.setAttributes(p);


                        int hi = ScreenUtils.getScreenWidth(this);
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
//                        powd_diss.setOnClickListener(new View.OnClickListener() {
//                            @Override
//                            public void onClick(View view) {
//                                dialog.dismiss();
//                            }
//                        });
                        //密码输入完后的回调
                        pow_button.setOnClickListener(view3 -> {
                            String tradePwd = pow.getText().toString();
                            List<WalletBean> walletBeans1 = DatabaseWalletUtils.getLocalCoinList_CCM("EMTC");
                            String testPass = "";
                            if (walletBeans1 != null && walletBeans1.size() > 0) {
                                testPass = AES256.SHA256Decrypt(walletBeans1.get(0).getPrivateKey(), pow.getText().toString());
                            }
                            if (!StringUtils.isEmpty(testPass)) {

                                //手动收起软键盘
                                //手动收起软键盘
                                InputMethodManager imm = (InputMethodManager)
                                        this.getSystemService(Context.INPUT_METHOD_SERVICE);
                                imm.hideSoftInputFromWindow(pow.getWindowToken(), 0);

                                dialog.dismiss();
                                String name = walletBean.getWalletName();
                                String coin = "BTC";
                                DatabaseWalletUtils.deleteLocalCoin(walletBean.getBaseObjId());
                                StringBuilder sb = new StringBuilder();
                                byte[] entropy = new byte[Words.TWELVE.byteLength()];
                                new SecureRandom().nextBytes(entropy);
                                new MnemonicGenerator(English.INSTANCE).createMnemonic(entropy, sb::append);
                                String mnemonicWord = sb.toString();
                                new SplashAty.MyAsyncTask().execute(name, mnemonicWord, coin, tradePwd);

                            } else {
                                Utils.Toast("密码错误！请重新输入");
                                return;
                            }
                        });


                    } else {

                        walletBeans = DatabaseWalletUtils.getLocalCoinList_CCM("EMTC");

                        if (walletBeans == null || walletBeans.isEmpty()) {

                            myStartActivity(CreateImportAty.class);
                        } else {

//                            shengji
//                            if (walletBeans.size() < 15 && walletBeans.size() > 5) {
//
//                                initAddNewErc20(walletBeans.get(3).getTokenAddress(), walletBeans.get(3).getTheMnemonicWord(), walletBeans.get(3).getPrivateKey(), walletBeans.get(3).getMobileMapping(), walletBeans.get(3).getWalletName());
//                            }
//
//                            initDb(walletBeans);
//                            initDb(walletBeans.get(3).getTokenAddress(), walletBeans.get(3).getTheMnemonicWord(), walletBeans.get(3).getPrivateKey(), walletBeans.get(3).getMobileMapping(), walletBeans.get(3).getWalletName());

                            myStartActivity(MainAty.class);
                        }

                        finish();
                    }
                }
            } else {

                walletBeans = DatabaseWalletUtils.getLocalCoinList_CCM("EMTC");

                if (walletBeans == null || walletBeans.isEmpty()) {
                    myStartActivity(CreateImportAty.class);
                } else {

//                            shengji
//                    if (walletBeans.size() < 15 && walletBeans.size() > 5) {
//
//                        initAddNewErc20(walletBeans.get(3).getTokenAddress(), walletBeans.get(3).getTheMnemonicWord(), walletBeans.get(3).getPrivateKey(), walletBeans.get(3).getMobileMapping(), walletBeans.get(3).getWalletName());
//                    }
//                    initDb(walletBeans);
//                    initDb(walletBeans.get(3).getTokenAddress(), walletBeans.get(3).getTheMnemonicWord(), walletBeans.get(3).getPrivateKey(), walletBeans.get(3).getMobileMapping(), walletBeans.get(3).getWalletName());
                    myStartActivity(MainAty.class);
                }

                finish();
            }
        }, 1000);

    }

    private void initDb(List<WalletBean> walletBeans) {

        int count = 0;
        for (WalletBean walletBean : walletBeans) {
            if (walletBean.getContractAddress().toUpperCase().equals(EthConfig.SAN_410101_CONTRACT.toUpperCase())) {
                count += 1;
            }
        }

        if (count != 1) {
            for (WalletBean walletBean : walletBeans) {
                if (walletBean.getContractAddress().toUpperCase().equals(EthConfig.SAN_410101_CONTRACT.toUpperCase())) {
                    DatabaseWalletUtils.deleteLocalCoin(walletBean.getBaseObjId());
                }
            }
//            initDb(walletBeans.get(3).getTokenAddress(), walletBeans.get(3).getTheMnemonicWord(), walletBeans.get(3).getPrivateKey(), walletBeans.get(3).getMobileMapping(), walletBeans.get(3).getWalletName());
        }


    }

    private void initDb(String ethAddress, String encodeMnemonics, String encodePrivateKey, String mobileMapping, String walletName) {

        Log.e("versionCode:", String.valueOf(Utils.getVersionCode(this)));


        dialogUtils.showProgressDialog();
        //        //SAN-2406, mobileMapping
        WalletCoinUtils.setCoinData("SAN-410101", ethAddress, Config.getMobleMapping());
        DatabaseWalletUtils.setLocalCoinJson("https://raw.githubusercontent.com/iozhaq/image/master/SAN.png", "SAN-410101", "SAN-410101", ethAddress, EthConfig.SAN_410101_CONTRACT, encodeMnemonics, encodePrivateKey, BigDecimal.ZERO, BigDecimal.ZERO, true, mobileMapping, walletName, "EMTC");
        dialogUtils.dismissProgressDialog();

    }

    private void initAddNewErc20(String ethAddress, String encodeMnemonics, String encodePrivateKey, String mobileMapping, String walletName) {
        dialogUtils.showProgressDialog();
        WalletCoinUtils.setCoinData("SAN-0301", ethAddress, Config.getMobleMapping());
        DatabaseWalletUtils.setLocalCoinJson("https://raw.githubusercontent.com/iozhaq/image/master/SAN.png", "SAN-0301", "SAN-0301", ethAddress, EthConfig.SAN_0301_CONTRACT, encodeMnemonics, encodePrivateKey, BigDecimal.ZERO, BigDecimal.ZERO, true, mobileMapping, walletName, "EMTC");
        //        //SAN-0306, mobileMapping
        WalletCoinUtils.setCoinData("SAN-0306", ethAddress, Config.getMobleMapping());
        DatabaseWalletUtils.setLocalCoinJson("https://raw.githubusercontent.com/iozhaq/image/master/SAN.png", "SAN-0306", "SAN-0306", ethAddress, EthConfig.SAN_0306_CONTRACT, encodeMnemonics, encodePrivateKey, BigDecimal.ZERO, BigDecimal.ZERO, true, mobileMapping, walletName, "EMTC");
        //        //SAN-0502, mobileMapping
        WalletCoinUtils.setCoinData("SAN-0502", ethAddress, Config.getMobleMapping());
        DatabaseWalletUtils.setLocalCoinJson("https://raw.githubusercontent.com/iozhaq/image/master/SAN.png", "SAN-0502", "SAN-0502", ethAddress, EthConfig.SAN_0502_CONTRACT, encodeMnemonics, encodePrivateKey, BigDecimal.ZERO, BigDecimal.ZERO, true, mobileMapping, walletName, "EMTC");
        //        //SAN-3105, mobileMapping
        WalletCoinUtils.setCoinData("SAN-3105", ethAddress, Config.getMobleMapping());
        DatabaseWalletUtils.setLocalCoinJson("https://raw.githubusercontent.com/iozhaq/image/master/SAN.png", "SAN-3105", "SAN-3105", ethAddress, EthConfig.SAN_3105_CONTRACT, encodeMnemonics, encodePrivateKey, BigDecimal.ZERO, BigDecimal.ZERO, true, mobileMapping, walletName, "EMTC");
        //        //SAN-3301, mobileMapping
        WalletCoinUtils.setCoinData("SAN-3301", ethAddress, Config.getMobleMapping());
        DatabaseWalletUtils.setLocalCoinJson("https://raw.githubusercontent.com/iozhaq/image/master/SAN.png", "SAN-3301", "SAN-3301", ethAddress, EthConfig.SAN_3301_CONTRACT, encodeMnemonics, encodePrivateKey, BigDecimal.ZERO, BigDecimal.ZERO, true, mobileMapping, walletName, "EMTC");
        //        //SAN-2101, mobileMapping
        WalletCoinUtils.setCoinData("SAN-2101", ethAddress, Config.getMobleMapping());
        DatabaseWalletUtils.setLocalCoinJson("https://raw.githubusercontent.com/iozhaq/image/master/SAN.png", "SAN-2101", "SAN-2101", ethAddress, EthConfig.SAN_2101_CONTRACT, encodeMnemonics, encodePrivateKey, BigDecimal.ZERO, BigDecimal.ZERO, true, mobileMapping, walletName, "EMTC");
        //        //SAN-2105, mobileMapping
        WalletCoinUtils.setCoinData("SAN-2105", ethAddress, Config.getMobleMapping());
        DatabaseWalletUtils.setLocalCoinJson("https://raw.githubusercontent.com/iozhaq/image/master/SAN.png", "SAN-2105", "SAN-2105", ethAddress, EthConfig.SAN_2105_CONTRACT, encodeMnemonics, encodePrivateKey, BigDecimal.ZERO, BigDecimal.ZERO, true, mobileMapping, walletName, "EMTC");
        //        //SAN-2406, mobileMapping
        WalletCoinUtils.setCoinData("SAN-2406", ethAddress, Config.getMobleMapping());
        DatabaseWalletUtils.setLocalCoinJson("https://raw.githubusercontent.com/iozhaq/image/master/SAN.png", "SAN-2406", "SAN-2406", ethAddress, EthConfig.SAN_2406_CONTRACT, encodeMnemonics, encodePrivateKey, BigDecimal.ZERO, BigDecimal.ZERO, true, mobileMapping, walletName, "EMTC");
        dialogUtils.dismissProgressDialog();

    }

    class MyAsyncTask extends AsyncTask<String, Void, Bitmap> {

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
            String name = strings[0];
            String mnemonicWord = strings[1];
            String coin = strings[2];
            String tradePwd = strings[3];
//            存在多个重载方法， 使用  1  来 进行标识
            Log.e("111111111111111", "-----------------");
            BlockChainUtils.importTheWallet_btc_eth(mnemonicWord, tradePwd, coin, "", name, 1);
            return null;
        }

        @Override
        protected void onPostExecute(Bitmap bitmap) {
            super.onPostExecute(bitmap);
            dialogUtils.dismissProgressDialog();


            List<WalletBean> walletBeans = DatabaseWalletUtils.getLocalCoinList_CCM("EMTC");

            if (walletBeans == null || walletBeans.isEmpty()) {
                myStartActivity(CreateImportAty.class);
            } else {
                myStartActivity(MainAty.class);
            }

            finish();

        }
    }
}
