package com.example.harunsofuoglu.kemik.core;

import android.app.Fragment;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.StringRes;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.harunsofuoglu.kemik.BuildConfig;
import com.example.harunsofuoglu.kemik.network.ApiService;

/**
 * Created by harunsofuoglu on 14.03.2018.
 */

public class BaseFragment extends Fragment {

    protected final static boolean DEBUG = BuildConfig.DEBUG;

    private ProgressDialog progressDialog;
    protected ApiService mApiService;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        mApiService = ((BaseActivity) getActivity()).mApiService;

        if (progressDialog == null) {
            progressDialog = new ProgressDialog(getActivity());
            progressDialog.setCancelable(false);
            progressDialog.setTitle("Lütfen Bekleyiniz");
        }

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);
    }


    protected void showLoading() {

        if (!progressDialog.isShowing())
            progressDialog.show();
    }

    protected void hideLoading() {
        if (progressDialog != null && progressDialog.isShowing()) {
            progressDialog.dismiss();
        }
    }


    protected void showToast(@StringRes int resId) {
        displayToastWithUIThread(getText(resId));
    }

    protected void showToast(final CharSequence message) {
        displayToastWithUIThread(message);
    }

    private void displayToastWithUIThread(final CharSequence message) {
        getActivity().runOnUiThread(new Runnable() {
            @Override
            public void run() {
                Toast.makeText(getActivity(),message, Toast.LENGTH_LONG).show();
            }
        });
    }


    protected void log(String TAG,@StringRes int resId){
        if (DEBUG){
            Log.i(TAG,String.valueOf(getText(resId)));
        }
    }

    protected void log(String TAG,CharSequence charSequence){
        if (DEBUG){
            Log.i(TAG,String.valueOf(charSequence));
        }
    }



}
