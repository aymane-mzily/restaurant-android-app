package com.aymsou.rstaurantsapp.utils;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Aymane on 10/28/2019.
 */

public class RetroClient {

    public static final String GMAPS_ROOT_URL = "https://maps.googleapis.com/maps/api/place/";
    //public static final String WEBSITE_ROOT_URL = "https://restaurant-mobile-app-168116.appspot.com/";
    public static final String WEBSITE_ROOT_URL = "http://192.168.2.164:8001/api/";

    private static Retrofit getRetrofitInstance(String url) {
        return new Retrofit.Builder().baseUrl(url).addConverterFactory(GsonConverterFactory.create()).build();
    }

    public static ApiService getApiService(String url) {
        return getRetrofitInstance(url).create(ApiService.class);
    }

}
