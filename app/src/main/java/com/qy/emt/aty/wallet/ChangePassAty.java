package com.qy.emt.aty.wallet;

import android.content.Context;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;

import com.qy.emt.R;
import com.qy.emt.aty.base.BaseAty;
import com.qy.emt.bean.other.database.WalletBean;
import com.qy.emt.config.Config;
import com.qy.emt.utils.StatusBarUtil;
import com.qy.emt.utils.Utils;
import com.qy.emt.utils.database.DatabaseWalletUtils;
import com.qy.emt.utils.function.StringUtils;
import com.qy.emt.utils.function.safety.AES256;
import com.qy.emt.view.group.NavigationLucencyLayout;

import java.util.List;
import java.util.regex.Pattern;

import butterknife.BindView;
import butterknife.OnClick;

public class ChangePassAty extends BaseAty {

    @BindView(R.id.nll_wallet_market)
    NavigationLucencyLayout nll_wallet_market;


    @BindView(R.id.old_trade_pass)
    EditText old_trade_pass;

    @BindView(R.id.new_trade_pass)
    EditText new_trade_pass;

    @BindView(R.id.conf_trade_pass)
    EditText conf_trade_pass;

    @BindView(R.id.trade_i1)
    ImageView trade_i1;

    private boolean isShowNewTradePass = false;

    @OnClick({
            R.id.trade_i1,
            R.id.trade_edit})
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.trade_edit:

                String oldTradePass = old_trade_pass.getText().toString();
                if (oldTradePass == null || "".equals(oldTradePass.trim())) {
                    Utils.Toast("Enter the old password");
                    return;
                }

                if (new_trade_pass.getText().toString().isEmpty()) {
                    Utils.Toast("password can not be blank");
                    return;
                }

                if (!Pattern.matches(Utils.passRegex, new_trade_pass.getText().toString())) {
                    Utils.Toast("The new password must be 8-32 alphanumeric combination");
                    return;
                }

                if (!new_trade_pass.getText().toString().equals(conf_trade_pass.getText().toString())) {
                    Utils.Toast("The new password entered twice is inconsistent");
                    return;
                }
                alterPassword();
                break;

            case R.id.trade_i1:
                if (!isShowNewTradePass) {
                    new_trade_pass.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                    trade_i1.setImageResource(R.mipmap.icon_found_eyes);
                    isShowNewTradePass = true;
                } else {
                    new_trade_pass.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    trade_i1.setImageResource(R.mipmap.icon_close);
                    isShowNewTradePass = false;
                }
                break;

            default:
                break;
        }
    }


    @Override
    public int initView() {
        return R.layout.aty_change_pass;
    }

    @Override
    public void setListener() {
    }

    @Override
    public void fillData() {

        showStatusBar(true);
        StatusBarUtil.setStatusColor(this, true, true, R.color.colorPrimary);
        nll_wallet_market.setTitle("change Password");
    }


    private void alterPassword() {

        List<WalletBean> walletList = DatabaseWalletUtils.getLocalCoinList(10);
        if (walletList == null || walletList.isEmpty()) {
            return;
        }
        for (WalletBean walletBean : walletList) {
            String tokenName = walletBean.getTokenName();
            String privateKey = walletBean.getPrivateKey();
            String mnemonicWord = walletBean.getTheMnemonicWord();

            String old = old_trade_pass.getText().toString();
            String newpass = new_trade_pass.getText().toString();

            String decryptPrivateKey = AES256.SHA256Decrypt(privateKey, old);
            if (StringUtils.isEmpty(decryptPrivateKey)) {
                Utils.Toast("Old password error");
                return;
            }
            if (mnemonicWord == null || mnemonicWord.length() == 0) {
            } else {
                String decryptMnemonicWord = AES256.SHA256Decrypt(mnemonicWord, old);
                String encodeMnemonicKey = AES256.SHA256Encode(decryptMnemonicWord, newpass);
                walletBean.setTheMnemonicWord(encodeMnemonicKey);
            }
            //重新加密
            String encodePrivateKey = AES256.SHA256Encode(decryptPrivateKey, newpass);
            walletBean.setPrivateKey(encodePrivateKey);
            DatabaseWalletUtils.updateLocalData(walletBean, walletBean.getTokenAddress(), tokenName, Config.getMobleMapping(), 3D);
        }
        Utils.Toast("Modify the transaction password successfully");
        cleanInputText();
        InputMethodManager imm = (InputMethodManager)
                this.getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(new_trade_pass.getWindowToken(), 0);

    }

    private void cleanInputText() {
        old_trade_pass.setText("");
        new_trade_pass.setText("");
        conf_trade_pass.setText("");

    }

}
