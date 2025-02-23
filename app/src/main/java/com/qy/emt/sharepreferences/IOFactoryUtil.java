package com.qy.emt.sharepreferences;

/**
 * Created by zhoufan on 2018/2/24.
 * 使用抽象工厂方法实现对缓存的处理
 */

public class IOFactoryUtil implements IOFactory {

    // 使用单例生成唯一实例
    private static volatile IOFactoryUtil ioFactoryUtil;

    public static IOFactoryUtil getIOFactoryUtil() {
        if (ioFactoryUtil == null) {
            synchronized (IOFactoryUtil.class) {
                if (ioFactoryUtil == null) {
                    ioFactoryUtil = new IOFactoryUtil();
                }
            }
        }
        return ioFactoryUtil;
    }

    @Override
    public IOHandler create(Class<? extends IOHandler> clazz) {
        try {
            return clazz.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    // 默认的存储方式

}
