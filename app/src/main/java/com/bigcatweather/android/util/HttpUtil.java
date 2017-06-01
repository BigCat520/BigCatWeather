package com.bigcatweather.android.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by ASUS on 2017/6/1.
 */

public class HttpUtil {
    public static void sendOkHttpRequest(String address, okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();//传入请求地址，注册回调
        client.newCall(request).enqueue(callback);//回调处理服务器响应
    }
}
