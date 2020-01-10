package com.qy.emt.utils.database;

import android.util.Log;

import com.google.gson.Gson;
import com.qy.emt.bean.other.database.UserMobileBean;

import org.litepal.LitePal;

import java.util.List;

/**
 *
 */
public class DatabaseUserMobileUtils {


    /**
     * 设置本地钱包数据
     */
    public static void setLocalUserJson(UserMobileBean userMobileBean) {
        List<UserMobileBean> mobileList = getMobileList(userMobileBean.getMobile());
        if (mobileList != null && mobileList.size() > 0) {
            return;
        }

        Log.e("============11", "tokenName：" + new Gson().toJson(userMobileBean));
        userMobileBean.save();
    }

    public static List<UserMobileBean> getLocalMobileList() {
        List<UserMobileBean> localUserMobileBeanBeans = LitePal.where().find(UserMobileBean.class);
        if (localUserMobileBeanBeans.size() > 0) {
            return localUserMobileBeanBeans;
        } else {
            return null;
        }
    }

    public static List<UserMobileBean> getMobileList(String mobile) {
        List<UserMobileBean> localUserMobileBeanBeans = LitePal.where("mobile=?", mobile).find(UserMobileBean.class);
        if (localUserMobileBeanBeans!=null &&localUserMobileBeanBeans.size() > 0) {
            return localUserMobileBeanBeans;
        } else {
            return null;
        }
    }

    /**
     * 清除本地钱包
     */
    public static void deleteLocalUserMobileBean() {
        LitePal.deleteAll(UserMobileBean.class);
    }

}
