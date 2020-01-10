package com.qy.emt.fragment.main;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.qy.emt.R;
import com.qy.emt.aty.base.BaseAty;
import com.qy.emt.bean.other.database.WalletBean;
import com.qy.emt.utils.StatusBarUtil;
import com.qy.emt.utils.Utils;
import com.qy.emt.utils.database.DatabaseWalletUtils;
import com.qy.emt.utils.function.ScreenUtils;
import com.qy.emt.view.group.NavigationLucencyLayout;

import java.util.List;

import butterknife.BindView;
import butterknife.OnClick;

public class CreateWalletInAty extends BaseAty {

    @BindView(R.id.nll_wallet_market)
    NavigationLucencyLayout nll_wallet_market;


    @Override
    public int initView() {
        return R.layout.aty_in_create_wallet;
    }

    @Override
    public void setListener() {
    }

    private Dialog dialogFenX;

    @OnClick({
            R.id.ccm_create,
            R.id.eth_create,
            R.id.btc_create})
    public void onClick(View v) {
        String coinName = "";
        List<WalletBean> walletBeans;
        //                        这里做分叉
        dialogFenX = new Dialog(this, R.style.DialogThemeHalfAlpa);
        View view1 = LayoutInflater.from(this).inflate(R.layout.private_key_and_nonecmic_word_create_dialog, null);
        dialogFenX.setContentView(view1);
        dialogFenX.setCanceledOnTouchOutside(true);
        Window dialogWindow = dialogFenX.getWindow();

        WindowManager.LayoutParams p = dialogWindow.getAttributes(); // 获取对话框当前的参数值
        int hi = ScreenUtils.getScreenWidth(this);
        p.width = hi; // 宽度设置为屏幕的0.65，根据实际情况调整
        dialogWindow.setAttributes(p);
        dialogFenX.setCanceledOnTouchOutside(false);
        dialogFenX.setCancelable(false);

        LinearLayout jump_create_wallet = view1.findViewById(R.id.jump_create_wallet);
        LinearLayout jump_private_key = view1.findViewById(R.id.jump_private_key);
        LinearLayout nonemic_word_id = view1.findViewById(R.id.nonemic_word_id);
        ImageView dismiss_id = view1.findViewById(R.id.dismiss_id);
        dismiss_id.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialogFenX.dismiss();
            }
        });

        switch (v.getId()) {

            case R.id.ccm_create:
                coinName = "EMTC";
                walletBeans = DatabaseWalletUtils.getLocalCoinList_CCM(coinName);

                if (walletBeans != null && walletBeans.size() > 0) {
                    Utils.Toast("There can only be at most one EMTC address！");
                    break;
                }
                jump_create_wallet.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dialogFenX.dismiss();

                        Bundle bundle = new Bundle();
                        bundle.putString("coinName", "EMTC");
                        Utils.startActivity(view.getContext(), CreateImportWalletInAty.class, bundle);

                    }
                });
                nonemic_word_id.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dialogFenX.dismiss();

                        Bundle bundle = new Bundle();

                        bundle.putString("coinName", "EMTC");
                        Utils.startActivity(view.getContext(), NonImportWalletInAty.class, bundle);

                    }
                });
                jump_private_key.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dialogFenX.dismiss();

                        Bundle bundle = new Bundle();

                        bundle.putString("coinName", "EMTC");
                        Utils.startActivity(view.getContext(), PrivateImportWalletInAty.class, bundle);
                    }
                });
                dialogFenX.show();
                break;


            case R.id.eth_create:
                coinName = "ETH";
                walletBeans = DatabaseWalletUtils.getLocalCoinList_CCM(coinName);

                if (walletBeans != null && walletBeans.size() > 0) {
                    Utils.Toast("There can only be at most one ETH address！");
                    break;
                }
                jump_create_wallet.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dialogFenX.dismiss();

                        Bundle bundle = new Bundle();
                        bundle.putString("coinName", "ETH");
                        Utils.startActivity(view.getContext(), CreateImportWalletInAty.class, bundle);

                    }
                });
                nonemic_word_id.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dialogFenX.dismiss();

                        Bundle bundle = new Bundle();

                        bundle.putString("coinName", "ETH");
                        Utils.startActivity(view.getContext(), NonImportWalletInAty.class, bundle);

                    }
                });
                jump_private_key.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dialogFenX.dismiss();

                        Bundle bundle = new Bundle();

                        bundle.putString("coinName", "ETH");
                        Utils.startActivity(view.getContext(), PrivateImportWalletInAty.class, bundle);
                    }
                });
                dialogFenX.show();

                break;
            case R.id.btc_create:
                coinName = "BTC";
                walletBeans = DatabaseWalletUtils.getLocalCoinList_CCM(coinName);

                if (walletBeans != null && walletBeans.size() > 0) {
                    Utils.Toast("There can only be at most one BTC address！");
                    break;
                }

                dialogFenX.show();
                jump_create_wallet.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dialogFenX.dismiss();

                        Bundle bundle = new Bundle();
                        bundle.putString("coinName", "BTC");
                        Utils.startActivity(view.getContext(), CreateImportWalletInAty.class, bundle);

                    }
                });
                nonemic_word_id.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dialogFenX.dismiss();

                        Bundle bundle = new Bundle();

                        bundle.putString("coinName", "BTC");
                        Utils.startActivity(view.getContext(), NonImportWalletInAty.class, bundle);

                    }
                });
                jump_private_key.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dialogFenX.dismiss();

                        Bundle bundle = new Bundle();

                        bundle.putString("coinName", "BTC");
                        Utils.startActivity(view.getContext(), PrivateImportWalletInAty.class, bundle);
                    }
                });
                break;

            default:
                break;
        }
    }


    @Override
    public void fillData() {

        showStatusBar(true);
        nll_wallet_market.setTitle("Create wallet");
        StatusBarUtil.setStatusColor(this, true, true, R.color.colorPrimary);
    }
}
