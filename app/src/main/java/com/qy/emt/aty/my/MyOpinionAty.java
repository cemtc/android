package com.qy.emt.aty.my;

import com.qy.emt.R;
import com.qy.emt.aty.base.BaseAty;
import com.qy.emt.view.group.NavigationLucencyLayout;

import butterknife.BindView;

/**
 * Description:意见反馈
 * Data：2019/5/17-2:39 PM
 *
 * @author
 */
public class MyOpinionAty extends BaseAty {
    @BindView(R.id.nv_my_opinion)
    NavigationLucencyLayout nvMyOpinion;

    @Override
    public int initView() {
        return R.layout.aty_my_opinion;
    }

    @Override
    public void setListener() {
        nvMyOpinion.setTitle(getString(R.string.about_opinion));
    }

    @Override
    public void fillData() {

    }
}
