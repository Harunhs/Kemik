package com.example.harunsofuoglu.kemik.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;

import com.example.harunsofuoglu.kemik.R;
import com.facebook.login.widget.LoginButton;
import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by harunsofuoglu on 12.03.2018.
 */

public class LoginFragment extends Fragment {




    @BindView(R.id.kemik_logo)
    ImageView kemikLogo;

    @BindView(R.id.user_name)
    EditText userName;

    @BindView(R.id.user_password)
    EditText userPassword;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view=inflater.inflate(R.layout.fragment_login,container,false);
        ButterKnife.bind(this,view);



        return view;

    }

    public static LoginFragment newInstance(){
        return new LoginFragment();
    }



}
