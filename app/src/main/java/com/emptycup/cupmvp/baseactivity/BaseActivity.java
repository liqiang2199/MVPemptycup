package com.emptycup.cupmvp.baseactivity;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;

import com.emptycup.cupmvp.MainActivity;
import com.emptycup.cupmvp.mvp.persenter.BasePersenterImp;
import com.emptycup.cupmvp.mvp.view.IBaseView;

import java.lang.reflect.ParameterizedType;

/**
 * Created by Administrator on 2017/12/16.
 * 父类 的Activity 绑定 View 和 Presenter
 * V  View 层
 * P  Presenter层
 */

public class BaseActivity<V extends IBaseView,P extends BasePersenterImp> extends Activity {
    public V view;
    public P presenter;
//    private BasePersenterImp presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    //绑定 View 和 Presenter
    public BasePersenterImp Init_Presenter() throws Exception {
        if (presenter == null){
            Log.v("this","初始化           1");
//            Class<P> clazz = (Class<P>)
//                    Class.forName(presenter.getClass().getName());
            
            Class<P> clazz = (Class<P>) MainPresenter.class;
            presenter = clazz.newInstance();
        }
        Log.v("this","初始化     2  ");
        return presenter;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (presenter != null){
            presenter.onDestroy("");
            presenter = null;
        }
    }
}
