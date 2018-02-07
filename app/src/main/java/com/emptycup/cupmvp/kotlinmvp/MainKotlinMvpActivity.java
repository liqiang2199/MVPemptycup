package com.emptycup.cupmvp.kotlinmvp;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Toast;

import com.emptycup.cupmvp.R;
import com.emptycup.cupmvp.kotlinmvp.baseactivity.BaseActivity;

import org.jetbrains.annotations.NotNull;

/**
 * Created by Administrator on 2018/2/6.
 *
 */

@SuppressLint("Registered")
public class MainKotlinMvpActivity extends BaseActivity<KotilnLoginView,KotlinLoginPresenter> implements KotilnLoginView{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.text).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getPresenter().http_Model();
            }
        });
    }

    @Override
    public KotlinLoginPresenter createPresenter() {
        return new KotlinLoginPresenter();
    }


    @Override
    public void LoginSuccess(@NotNull String msg) {
        Toast.makeText(this,msg,Toast.LENGTH_LONG).show();
    }

    @Override
    public void IView_Success(@NotNull Object o) {

    }

    @Override
    public void IView_Fail(@NotNull Object o) {

    }

    @Override
    public void IView_NoNetWork(@NotNull Object o) {

    }

    @Override
    public void IView_NoData(@NotNull Object o) {

    }

    @Override
    public void IView_RequestError(@NotNull Object o) {

    }

    @Override
    public void IView_SignleSignOn(@NotNull Object o) {

    }
}
