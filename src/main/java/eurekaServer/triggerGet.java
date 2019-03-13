package eurekaServer;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by liuzhonghua on 2019/1/18
 */

public class triggerGet {

    public static void main(String[] args) {

        OkHttpClient okHttpClient = new OkHttpClient();
        Request.Builder builder  = new Request.Builder();

        Request request = builder
                .url("http://192.168.64.129:8762/skipClient")
                .get()
                .build();


        try {
            okHttpClient.newCall(request).execute();
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
