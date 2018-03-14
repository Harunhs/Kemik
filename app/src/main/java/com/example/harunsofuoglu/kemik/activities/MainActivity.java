package com.example.harunsofuoglu.kemik.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.harunsofuoglu.kemik.R;
import com.example.harunsofuoglu.kemik.ui.login.LoginFragment;

import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
