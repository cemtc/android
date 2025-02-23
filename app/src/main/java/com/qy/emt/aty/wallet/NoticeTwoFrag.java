package com.qy.emt.aty.wallet;

import android.graphics.Color;
import android.support.v7.widget.LinearLayoutManager;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.chad.library.adapter.base.entity.MultiItemEntity;
import com.github.jdsjlzx.interfaces.OnLoadMoreListener;
import com.github.jdsjlzx.interfaces.OnRefreshListener;
import com.github.jdsjlzx.recyclerview.LRecyclerView;
import com.github.jdsjlzx.recyclerview.LRecyclerViewAdapter;
import com.qy.emt.R;
import com.qy.emt.adapter.wallet.NoticePageTwoAdapter;
import com.qy.emt.fragment.base.BaseFrag;
import com.qy.emt.retrofit.HttpRequestCallback;
import com.qy.emt.retrofit.HttpUtils;
import com.qy.emt.utils.Utils;

import java.util.List;
import java.util.TreeMap;

import butterknife.BindView;

/**
 * Description:钱包页
 * Data：2019/5/8-4:54 PM
 */
public class NoticeTwoFrag extends BaseFrag implements OnRefreshListener, OnLoadMoreListener, HttpRequestCallback<Object> {

    @BindView(R.id.vp_wallet)
    LRecyclerView vpRecyclerView;

    private EditText pow;
    private Button pow_button;
    private ImageView powd_diss;

    private NoticePageTwoAdapter noticePageTwoAdapter;

    private JSONArray jsonArray;
    private LRecyclerViewAdapter lRecyclerViewAdapter;
    List<MultiItemEntity> tokenEntityList;
    //    private BigDecimal rmbAmount;
//    private BigDecimal ptbAmount;
    private String tradePwd;

    private String address;

    private int pageNo = 1;

    private int noticeId;

    @Override
    public int initView() {
        return R.layout.aty_notice_page_two;
    }

    @Override
    public void setListener() {

    }

    @Override
    public void fillData() {
        initWalletData();
        requestData(0);

    }

    public void initWalletData() {

        noticePageTwoAdapter = new NoticePageTwoAdapter(getActivity(), (jsonArray), (view, pojo, position) -> {
//                Utils.Toast("点击了条目：" + position);

//            ImageView img_icon = view.findViewById(R.id.img_icon);
            TextView title_id = view.findViewById(R.id.title_id);
//            TextView advertising_time = view.findViewById(R.id.advertising_time);
            TextView content_id = view.findViewById(R.id.content_id);
//
//            img_icon.setImageResource(R.mipmap.icon_gray);
            title_id.setTextColor(Color.parseColor("#999999"));
//            advertising_time.setTextColor(Color.parseColor("#c3c3c3"));
            content_id.setTextColor(Color.parseColor("#999999"));
            noticeId = pojo.getIntValue("noticeId");
//            requestData(1);
        });
        LinearLayoutManager manager = new LinearLayoutManager(getActivity());
        manager.setOrientation(LinearLayoutManager.VERTICAL);
        vpRecyclerView.setLayoutManager(manager);

        lRecyclerViewAdapter = new LRecyclerViewAdapter(noticePageTwoAdapter);
        vpRecyclerView.setAdapter(lRecyclerViewAdapter);
        vpRecyclerView.setOnRefreshListener(this);
        vpRecyclerView.setOnLoadMoreListener(this);
        vpRecyclerView.setLoadMoreEnabled(true);

    }


    @Override
    public void onRefresh() {
        pageNo = 1;
        requestData(0);
        vpRecyclerView.refreshComplete(20);
    }

    private void requestData(int type) {
        TreeMap<String, Object> map;

//        公告
        if (type == 0) {
            map = new TreeMap<String, Object>();
            map.put("pageNo", pageNo);
            map.put("pageSize", "20");
            HttpUtils.getHttpUtils().executeGet(this.getActivity(), map, "getNoticeListByPage", type, this);
        }
        if (type == 1) {
            map = new TreeMap<>();
            map.put("noticeId", noticeId);
            HttpUtils.getHttpUtils().executeGet(this.getActivity(), map, "insertNoticeHandle", type, this);
        }
    }

    /**
     * 接口请求成功
     */
    @Override
    public void onRequestSuccess(String result, int type) {

        dialogUtils.dismissProgressDialog();
        try {
            if (!TextUtils.isEmpty(result)) {
                if (type == 0) {
                    dialogUtils.dismissProgressDialog();
                    JSONObject jsonObject1 = JSONObject.parseObject(result);
                    if (pageNo == 1) {
                        jsonArray = jsonObject1.getJSONArray("data");
                        if (jsonArray.size() == 0) {
                            vpRecyclerView.setVisibility(View.GONE);
                        } else {
                            vpRecyclerView.setVisibility(View.VISIBLE);
                        }
                    } else {
                        JSONArray jsonArray1 = jsonObject1.getJSONArray("data");
                        jsonArray.addAll(jsonArray1);

                    }

                    noticePageTwoAdapter.setData(jsonArray);
                    noticePageTwoAdapter.notifyDataSetChanged();
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 接口请求失败
     */
    @Override
    public void onRequestFail(String value, String failCode, int type) {

        dialogUtils.dismissProgressDialog();
        if (!"null".equals(value)) {
            Utils.Toast(value);
        } else {
            Utils.Toast(failCode);
        }
    }

    @Override
    public void onLoadMore() {
        pageNo = pageNo + 1;
        requestData(0);
        vpRecyclerView.refreshComplete(20);
    }
}



