package com.emptycup.cupmvp;

import android.support.annotation.NonNull;
import android.os.Bundle;
import android.widget.Toast;

import com.emptycup.cupmvp.test.BaseActivity;
import com.emptycup.cupmvp.test.MainPresenter;
import com.emptycup.cupmvp.test.MainView;

import org.jetbrains.annotations.NotNull;

public class MainActivity extends BaseActivity<MainView,MainPresenter> implements MainView {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        try {
//            Init_Presenter(MainPresenter.class.getName());
//            iTestView = new TestViewImpl();
//            iTestView.setTestView();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        TextView text  = (TextView) findViewById(R.id.text);
//        text.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if (presenter != null){
//                    presenter.http_Model();
//                }else{
//                    Toast.makeText(MainActivity.this,"presenter is Null",Toast.LENGTH_SHORT).show();
//                }
//
//            }
//        });

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

    @NotNull
    @Override
    public MainPresenter createPresenter() {
        return null;
    }

    @NotNull
    @Override
    public MainView createView() {
        return null;
    }

    @NotNull
    @Override
    public MainPresenter getBasePresenter() {
        return null;
    }

    @Override
    public void setBasePresenter(MainPresenter presenter) {

    }

    @NotNull
    @Override
    public MainView getBaseView() {
        return null;
    }
}
