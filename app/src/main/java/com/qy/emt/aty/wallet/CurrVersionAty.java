package com.qy.emt.aty.wallet;

import android.Manifest;
import android.app.Dialog;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import com.alibaba.fastjson.JSONObject;
import com.qy.emt.R;
import com.qy.emt.aty.base.BaseAty;
import com.qy.emt.config.Config;
import com.qy.emt.retrofit.Constants;
import com.qy.emt.retrofit.HttpRequestCallback;
import com.qy.emt.retrofit.HttpUtils;
import com.qy.emt.utils.StatusBarUtil;
import com.qy.emt.utils.UpdateVersionController;
import com.qy.emt.utils.Utils;
import com.qy.emt.utils.system.PermissionUtils;
import com.qy.emt.view.group.NavigationLucencyLayout;
import com.uuzuche.lib_zxing.DisplayUtil;

import java.util.TreeMap;

import butterknife.BindView;

public class CurrVersionAty extends BaseAty implements HttpRequestCallback<Object> {

    @BindView(R.id.nll_wallet_market)
    NavigationLucencyLayout nll_wallet_market;
    @BindView(R.id.local_version)
    TextView local_version;
    @BindView(R.id.server_version)
    TextView server_version;
    @BindView(R.id.check_update)
    Button check_update;

    private Dialog dialogLicai;

    @Override
    public int initView() {
        return R.layout.aty_check_update;
    }

    @Override
    public void setListener() {
        check_update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                requestData(0);
            }
        });


    }

    @Override
    public void fillData() {

        showStatusBar(true);
        StatusBarUtil.setStatusColor(this, true, true, R.color.colorPrimary);
        nll_wallet_market.setTitle("Check for updates");
        local_version.setText("v" + Utils.getVersionName(this));
//        TODO
        server_version.setText("v" + Config.getToken());


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
                                            Utils.Toast("No write access to memory");
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

    /**
     * 接口请求失败
     */
    @Override
    public void onRequestFail(String value, String failCode, int type) {
        Utils.Toast("Already the latest version");
    }
}
