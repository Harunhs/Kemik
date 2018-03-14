package com.example.harunsofuoglu.kemik.core;

import android.content.Context;
import android.support.multidex.MultiDex;
import android.support.multidex.MultiDexApplication;

import com.example.harunsofuoglu.kemik.network.ApiClient;
import com.example.harunsofuoglu.kemik.network.ApiService;
import com.orhanobut.logger.Logger;


/**
 * Created by harunsofuoglu on 14.03.2018.
 */

public class KemikApplication extends MultiDexApplication {

    private static final String APP_TAG = "KemikApplication";

    private ApiService mApiService;

    public void onCreate(){
        super.onCreate();
        mApiService = ApiClient.createService(this);
        Logger.init(APP_TAG);
    }


    public ApiService getApiService() {
        return mApiService;
    }

    public void setApiService(ApiService apiService) {
        mApiService = apiService;
    }


    /*
    User response login gelecek.
     */



    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(base);
    }

}
