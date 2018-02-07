package com.emptycup.cupmvp.basednxymvpstudents.demo.support;

import com.emptycup.cupmvp.basednxymvpstudents.demo.MVPView;
import com.emptycup.cupmvp.basednxymvpstudents.demo.MvpPresenter;

/**
 * Created by Administrator on 2018/2/6.
 * 第二重代理   代理对象
 */

public class ProxyMvpCallBack<V extends MVPView,P extends MvpPresenter<V>> implements MvpCallBack<V,P> {
    private MvpCallBack<V,P> mvpCallBack;

    public ProxyMvpCallBack(MvpCallBack<V,P> mvpCallBack){
        this.mvpCallBack = mvpCallBack;
    }
    @Override
    public P createPresnter() {
        //创建P层
        P presenter = mvpCallBack.getPresenter();
        if (presenter == null){
            presenter = mvpCallBack.createPresnter();
        }
        if (presenter == null){
            throw new NullPointerException("presenter Is Null");
        }
        this.mvpCallBack.setPresenter(presenter);
        return presenter;
    }

    @Override
    public V createView() {
        V view = mvpCallBack.getMvpView();
        if (view == null){
            view = mvpCallBack.createView();
        }
        if (view == null){
            throw  new NullPointerException("view Is Null");
        }
        return view;
    }

    @Override
    public P getPresenter() {
        return mvpCallBack.getPresenter();
    }

    @Override
    public void setPresenter(P presenter) {
        mvpCallBack.setPresenter(presenter);
    }

    @Override
    public V getMvpView() {
        return mvpCallBack.getMvpView();
    }
    public void attachView(){
        getPresenter().attachView(getMvpView());
    }
    public void detachView(){
        getPresenter().detachView();
    }
}
