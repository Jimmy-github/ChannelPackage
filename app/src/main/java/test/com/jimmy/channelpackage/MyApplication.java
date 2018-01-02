package test.com.jimmy.channelpackage;

import android.app.Application;

import com.umeng.commonsdk.UMConfigure;

/**
 * Created by zhangtianjie on 2018/1/2.
 */

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        UMConfigure.init(this, UMConfigure.DEVICE_TYPE_PHONE, "5a4aea3ab27b0a2c250000dd");
   //   开启友盟log
        UMConfigure.setLogEnabled(false);
        //设置日志加密
        UMConfigure.setEncryptEnabled(false);
    }
}
