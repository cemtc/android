package com.qy.emt.aty.wallet;

import com.qy.emt.R;
import com.qy.emt.aty.base.BaseAty;
import com.qy.emt.utils.StatusBarUtil;
import com.qy.emt.view.group.NavigationLucencyLayout;

import butterknife.BindView;

public class AboutUsAty extends BaseAty {

    @BindView(R.id.nll_wallet_market)
    NavigationLucencyLayout nll_wallet_market;

    @Override
    public int initView() {
        return R.layout.about_us;
    }

    @Override
    public void setListener() {
    }

    @Override
    public void fillData() {

        showStatusBar(true);
        StatusBarUtil.setStatusColor(this, true, true, R.color.colorPrimary);
        nll_wallet_market.setTitle("通知中心");
    }
}
