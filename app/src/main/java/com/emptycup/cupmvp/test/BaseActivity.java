package com.emptycup.cupmvp.test;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.emptycup.cupmvp.testone.support.ActivityProxyImpl;
import com.emptycup.cupmvp.testone.support.IActivityProxy;
import com.emptycup.cupmvp.testone.support.MvpCallBack;
import com.emptycup.cupmvp.mvp.persenter.IBasePresenter;
import com.emptycup.cupmvp.mvp.view.IBaseView;

/**
 * Created by Administrator on 2017/12/16.
 * 父类 的Activity 绑定 View 和 Presenter
 * V  View 层
 * P  Presenter层
 */

public abstract class BaseActivity<V extends IBaseView,P extends IBasePresenter<V>> extends Activity
implements IBaseView,MvpCallBack<V,P> {
    public P presenter;
public Class<P> clazz;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        IActivityProxy<V,P> proxyMvpCallBack = new ActivityProxyImpl<>(this);
        proxyMvpCallBack.onCreate(savedInstanceState);

    }

    //绑定 View 和 Presenter
//    public BasePresenterImp Init_Presenter(String name) throws Exception {
//        if (presenter == null){
//
//            Log.v("this","初始化           1");
////            Class<?> clazz = Class.forName(name);
//
//
//            // 1获取子类的class(在创建子类对象的时候,会返回父类的构造方法)
////            Class<? extends BasePresenterImp> clazz = BasePresenterImp.class; // Student
////            presenter = (P) clazz.newInstance();
//
//            ParameterizedType pt = (ParameterizedType)getClass().getGenericSuperclass();
//            clazz = (Class<P>)pt.getActualTypeArguments()[1];
//            presenter = clazz.newInstance();
//
//        }
//        Log.v("this","初始化     2  ");
//        presenter.attachView(this);
//        return presenter;
//    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
//        if (presenter != null){
//            presenter.onDestroy(this);
//            presenter = null;
//        }
    }
}
