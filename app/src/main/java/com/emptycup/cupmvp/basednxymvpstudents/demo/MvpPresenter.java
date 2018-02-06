package com.emptycup.cupmvp.basednxymvpstudents.demo;

/**
 * Created by Administrator on 2018/2/6.
 * 抽象的父类
 */

public abstract class MvpPresenter<V extends MVPView> {

    private V view;

    public void attachView(V view){
        this.view = view;
    }

    public V getLoginView(){
        return view;
    }
    public void detachView(){
        if (view != null){
            view = null;
        }
    }
}
