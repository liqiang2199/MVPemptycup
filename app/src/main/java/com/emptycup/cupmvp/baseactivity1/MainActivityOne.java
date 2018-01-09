package com.emptycup.cupmvp.baseactivity1;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.emptycup.cupmvp.R;
import com.emptycup.cupmvp.baseactivity.BaseActivity;
import com.emptycup.cupmvp.baseactivity.MainPresenter;
import com.emptycup.cupmvp.baseactivity.MainView;

import org.jetbrains.annotations.NotNull;

public class MainActivityOne extends BaseActivityOne<MainView,MainPresenter> implements MainView {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView text  = (TextView) findViewById(R.id.text);
        text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (getBasePresenter() != null){
                    getBasePresenter().http_Model();
                }else{
                    Toast.makeText(MainActivityOne.this,"presenter is Null",Toast.LENGTH_SHORT).show();
                }

            }
        });

    }

    @NotNull
    @Override
    public MainPresenter createPresenter() {
        return new MainPresenter();
    }

    @Override
    public void IView_Success(@NonNull Object o) {
        Toast.makeText(this,"IView_Success",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void IView_Fail(@NonNull Object o) {
        Toast.makeText(this,"IView_Fail",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void IView_NoNetWork(@NonNull Object o) {
        Toast.makeText(this,"IView_NoNetWork",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void IView_NoData(@NonNull Object o) {
        Toast.makeText(this,"IView_Success",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void IView_RequestError(@NonNull Object o) {
        Toast.makeText(this,"IView_RequestError",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void IView_SignleSignOn(@NonNull Object o) {
        Toast.makeText(this,"IView_SignleSignOn",Toast.LENGTH_SHORT).show();
    }
}
