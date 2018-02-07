package com.emptycup.cupmvp.javamvp.demo;

import java.lang.ref.WeakReference;

/**
 * Created by Administrator on 2018/2/6.
 * 抽象的父类
 */

public abstract class MvpPresenter<V extends MVPView> {

    private WeakReference<V> view;

    public void attachView(V view){
        this.view = new  WeakReference(view);
    }

    public V getLoginView(){
        return view.get();
    }
    public void detachView(){
        if (view != null){
            view.clear();
            view = null;
        }
    }
}
