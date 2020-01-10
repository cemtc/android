package com.qy.emt.aty.wallet;

import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.qy.emt.R;
import com.qy.emt.adapter.wallet.MnemonicAdapter;
import com.qy.emt.aty.base.BaseAty;
import com.qy.emt.bean.other.database.WalletBean;
import com.qy.emt.utils.StatusBarUtil;
import com.qy.emt.utils.function.safety.AES256;
import com.qy.emt.view.group.NavigationLucencyLayout;

import java.util.Arrays;
import java.util.List;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Description: Mnemonic
 * Data：2019/5/6-2:56 PM
 */
public class WalletMnemonicAty extends BaseAty {
    @BindView(R.id.nll_wallet_mnemonic)
    NavigationLucencyLayout nllWalletMnemonic;

    @BindView(R.id.rv_mnemonic)
    RecyclerView rvMnemonic;
    private String mnemonic;
    private String coin;
    private String tradePass;

    private List<WalletBean> walletBeans;

    @OnClick({R.id.tv_mnemonic_next})
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tv_mnemonic_next:
//                暂时注释
                Bundle bundle = new Bundle();
                bundle.putString("mnemonic", mnemonic);
                bundle.putString("coin", coin);
                myStartActivity(VerificationMnemonicWordAty.class, bundle);
//                finish();
//                StringUtils.isCopy(mnemonic);

                break;
            default:
                break;
        }
    }

    @Override
    public int initView() {
        return R.layout.aty_wallet_mnemonic;
    }

    @Override
    public void setListener() {

    }

    @Override
    public void fillData() {


        StatusBarUtil.setStatusColor(this, true, true, R.color.colorPrimary);
        nllWalletMnemonic.setTitle("Mnemonic export");
        tradePass = getIntent().getStringExtra("tradePwd");

        walletBeans = (List<WalletBean>) getIntent().getSerializableExtra("walletBeans");

        mnemonic = (AES256.SHA256Decrypt(walletBeans.get(0).getTheMnemonicWord(), tradePass));
//        mnemonic = sb.toString();
        List<String> mnemonicList = Arrays.asList(mnemonic.split(" "));
        initAdapter(mnemonicList);

    }

    private void initAdapter(List<String> mnemoniclist) {
        MnemonicAdapter marketListAdapter = new MnemonicAdapter(R.layout.item_mnemonic, this, mnemoniclist);
        GridLayoutManager manager = new GridLayoutManager(this, 3);
        rvMnemonic.setLayoutManager(manager);
        rvMnemonic.setAdapter(marketListAdapter);
    }
}
