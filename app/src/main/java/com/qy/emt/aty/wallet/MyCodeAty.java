package com.qy.emt.aty.wallet;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;

import com.qy.emt.R;
import com.qy.emt.aty.base.BaseAty;
import com.qy.emt.view.group.NavigationLucencyLayout;
import com.uuzuche.lib_zxing.activity.CaptureFragment;
import com.uuzuche.lib_zxing.activity.CodeUtils;

import butterknife.BindView;

/**
 * Description:扫二维码
 * Data：2019/5/19-11:13 AM
 */
public class MyCodeAty extends BaseAty {
    @BindView(R.id.nll_second_button)
    NavigationLucencyLayout nllSecondButton;

    @Override
    public int initView() {
        return R.layout.aty_my_code;
    }

    @Override
    public void setListener() {

    }

    @Override
    public void fillData() {
        //执行扫面Fragment的初始化操作
        CaptureFragment captureFragment = new CaptureFragment();
        // 为二维码扫描界面设置定制化界面
        CodeUtils.setFragmentArgs(captureFragment, R.layout.item_my_code);

        captureFragment.setAnalyzeCallback(analyzeCallback);

        //替换我们的扫描控件
        getSupportFragmentManager().beginTransaction().replace(R.id.fl_my_container, captureFragment).commit();

    }

    /**
     * 二维码解析回调函数
     */
    CodeUtils.AnalyzeCallback analyzeCallback = new CodeUtils.AnalyzeCallback() {
        @Override
        public void onAnalyzeSuccess(Bitmap mBitmap, String result) {
            Intent resultIntent = new Intent();
            Bundle bundle = new Bundle();
            bundle.putInt(CodeUtils.RESULT_TYPE, CodeUtils.RESULT_SUCCESS);
            bundle.putString(CodeUtils.RESULT_STRING, result);
            resultIntent.putExtras(bundle);
            setResult(RESULT_OK, resultIntent);
            finish();
        }

        @Override
        public void onAnalyzeFailed() {
            Intent resultIntent = new Intent();
            Bundle bundle = new Bundle();
            bundle.putInt(CodeUtils.RESULT_TYPE, CodeUtils.RESULT_FAILED);
            bundle.putString(CodeUtils.RESULT_STRING, "");
            resultIntent.putExtras(bundle);
            setResult(RESULT_OK, resultIntent);
            finish();
        }
    };
}
