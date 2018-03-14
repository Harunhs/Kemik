package com.example.harunsofuoglu.kemik.ui.login;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.example.harunsofuoglu.kemik.R;
import com.example.harunsofuoglu.kemik.core.BaseActivity;

/**
 * Created by harunsofuoglu on 14.03.2018.
 */

public class LoginActivity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.login_page_container, LoginFragment.newInstance())
                .commit();

    }
}
