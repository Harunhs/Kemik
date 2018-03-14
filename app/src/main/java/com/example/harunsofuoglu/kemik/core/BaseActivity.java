package com.example.harunsofuoglu.kemik.core;

import android.support.v7.app.AppCompatActivity;

import com.example.harunsofuoglu.kemik.network.ApiService;

/**
 * Created by harunsofuoglu on 14.03.2018.
 */

public class BaseActivity extends AppCompatActivity {

    protected ApiService mApiService;




    @Override
    protected void onResume() {
        super.onResume();
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        //EventBus.getDefault().unregister(this);
    }

    private void setup(){
        mApiService = ((KemikApplication) getApplication()).getApiService();


    }

}
