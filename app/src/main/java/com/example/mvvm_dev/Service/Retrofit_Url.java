package com.example.mvvm_dev.Service;

import java.util.concurrent.TimeUnit;


import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Retrofit_Url {
    public static final String url = "http://calllogpharapibeta.fptshop.com.vn:9119/api/Pharmacy/";
    public static Retrofit_Api api_retrofit;

    public static Retrofit_Api getConnect() {

        Retrofit_Api api;
        Retrofit retrofit = null;
        OkHttpClient.Builder client = new OkHttpClient.Builder();
        client.connectTimeout(15, TimeUnit.SECONDS);
        client.readTimeout(15, TimeUnit.SECONDS);
        client.writeTimeout(15, TimeUnit.SECONDS);

        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(url)
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(client.build())
                    .build();
        }
        api = retrofit.create(Retrofit_Api.class);
        return api;
    }
}
