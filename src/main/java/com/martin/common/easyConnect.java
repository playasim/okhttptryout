package com.martin.common;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class easyConnect {

    public static void main(String[] args) throws IOException {
        OkHttpClient client = new OkHttpClient();

        String appkey = "dasd";
        String secretkey = "dsadas";
        String url = "http://oauth.newayz.com";
        String redirectUrl = "http://insights.newayz.com";
        String reUrl = url + "/show?response_type=code&client_id=" + appkey + "&redirect_uri=" +
                redirectUrl + "&state=martin1";

        Request request = new Request.Builder().url(url).build();
        Response response = client.newCall(request).execute();

        if (response.isSuccessful()) {
            System.out.println(reUrl);
            System.out.println(response.body().toString());
            System.out.println(response.body().string());
        }

    }
}
