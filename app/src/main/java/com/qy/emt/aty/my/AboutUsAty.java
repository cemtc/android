package com.qy.emt.aty.my;

import android.widget.TextView;

import com.qy.emt.R;
import com.qy.emt.aty.base.BaseAty;
import com.qy.emt.utils.StatusBarUtil;
import com.qy.emt.utils.Utils;
import com.qy.emt.view.group.NavigationLucencyLayout;

import butterknife.BindView;

/**
 * Description:交易页面
 * Data：2019/5/9-8:01 PM
 */
public class AboutUsAty extends BaseAty {
    @BindView(R.id.nll_wallet_market)
    NavigationLucencyLayout nllWalletMarket;

    @BindView(R.id.version_info_id)
    TextView version_info_id;

    @Override
    public int initView() {
        return R.layout.aty_about_us;
    }

    @Override
    public void setListener() {

    }

    @Override
    public void fillData() {

        StatusBarUtil.setStatusColor(this, true, true, R.color.color_fbfbfd);
        nllWalletMarket.setTitle("about us");
        version_info_id.setText("v" + Utils.getVersionName(this));

    }


}
