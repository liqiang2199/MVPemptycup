package com.emptycup.cupmvp.javamvp;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Toast;

import com.emptycup.cupmvp.R;
import com.emptycup.cupmvp.javamvp.demo.LoginPresenter;
import com.emptycup.cupmvp.javamvp.demo.LoginView;

/**
 * Created by Administrator on 2018/2/6.
 *
 */

@SuppressLint("Registered")
public class MainMvpActivity extends BaseActivity<LoginView,LoginPresenter> implements LoginView{

//    private LoginPresenter loginPresenter;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        loginPresenter = new LoginPresenter();
//        loginPresenter.attachView(this);
        findViewById(R.id.text).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getPresenter().http("lili","147258369");
            }
        });
    }

    @Override
    public LoginPresenter createPresnter() {
        return new LoginPresenter();
    }

    @Override
    public void onLoginResult(String msg) {
        Toast.makeText(this,msg,Toast.LENGTH_LONG).show();
    }

}
