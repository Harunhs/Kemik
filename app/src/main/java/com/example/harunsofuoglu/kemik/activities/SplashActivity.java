package com.example.harunsofuoglu.kemik.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.harunsofuoglu.kemik.R;
import com.example.harunsofuoglu.kemik.ui.login.LoginActivity;

/**
 * Created by harunsofuoglu on 14.03.2018.
 */

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        startActivity(new Intent(this, MainActivity.class));
        finish();

    }
}
