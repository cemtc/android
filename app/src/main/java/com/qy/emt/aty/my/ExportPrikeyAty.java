package com.qy.emt.aty.my;

import android.content.Intent;
import android.support.v7.widget.LinearLayoutManager;

import com.github.jdsjlzx.interfaces.OnRefreshListener;
import com.github.jdsjlzx.recyclerview.LRecyclerView;
import com.github.jdsjlzx.recyclerview.LRecyclerViewAdapter;
import com.qy.emt.R;
import com.qy.emt.adapter.wallet.ExportPrikeyAdapter;
import com.qy.emt.aty.base.BaseAty;
import com.qy.emt.bean.other.database.WalletBean;
import com.qy.emt.utils.StatusBarUtil;
import com.qy.emt.utils.function.StringUtils;
import com.qy.emt.view.group.NavigationLucencyLayout;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

/**
 * Description:交易页面
 * Data：2019/5/9-8:01 PM
 */
public class ExportPrikeyAty extends BaseAty implements OnRefreshListener {
    @BindView(R.id.nll_wallet_market)
    NavigationLucencyLayout nllWalletMarket;

    @BindView(R.id.lr_id)
    LRecyclerView lRecyclerView;

    private String tradePass;

    private List<WalletBean> walletBeans;

    private ExportPrikeyAdapter exportPrikeyAdapter;

    private LRecyclerViewAdapter lRecyclerViewAdapter;

    @Override
    public int initView() {
        return R.layout.export_prikey;
    }

    @Override
    public void setListener() {
    }

    @Override
    public void fillData() {

        StatusBarUtil.setStatusColor(this, true, true, R.color.colorPrimary);
        nllWalletMarket.setTitle("Private key export");
        tradePass = getIntent().getStringExtra("tradePwd");
        walletBeans = (List<WalletBean>) getIntent().getSerializableExtra("walletBeans");
        List<WalletBean> newWalletBean = new ArrayList<>(3);
        for (WalletBean walletBean : walletBeans) {


            if (walletBean.getCoin().equals("BTC")) {
                newWalletBean.add(walletBean);
            }
            if (walletBean.getCoin().equals("ETH")) {

                newWalletBean.add(walletBean);
            }
            if (walletBean.getCoin().equals("EMTC")) {

                newWalletBean.add(walletBean);
            }

        }


        exportPrikeyAdapter = new ExportPrikeyAdapter(this, newWalletBean, tradePass, (text) -> {
//            Utils.Toast("点击了条目：" + position);

            StringUtils.isCopy(text);
//            openShareDialog(text);

        });
        LinearLayoutManager manager = new LinearLayoutManager(this);
        manager.setOrientation(LinearLayoutManager.VERTICAL);
        lRecyclerView.setLayoutManager(manager);
        lRecyclerView.setOnRefreshListener(this);
        lRecyclerViewAdapter = new LRecyclerViewAdapter(exportPrikeyAdapter);
        lRecyclerView.setAdapter(lRecyclerViewAdapter);
    }

    @Override
    public void onRefresh() {
//        exportPrikeyAdapter.setqOrgs(walletBeans);
//        exportPrikeyAdapter.notifyDataSetChanged();
        lRecyclerView.refreshComplete(3);
    }

    public static final int SHARE_REQUEST_CODE = 1003;

    private void openShareDialog(String jsonData) {
        Intent sharingIntent = new Intent(Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(Intent.EXTRA_SUBJECT, "Keystore");
        sharingIntent.putExtra(Intent.EXTRA_TEXT, jsonData);
        startActivityForResult(
                Intent.createChooser(sharingIntent, "Share via"),
                SHARE_REQUEST_CODE);
    }

}
