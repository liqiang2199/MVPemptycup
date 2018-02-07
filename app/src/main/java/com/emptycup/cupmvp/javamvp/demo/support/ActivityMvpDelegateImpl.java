package com.emptycup.cupmvp.javamvp.demo.support;

import android.os.Bundle;

import com.emptycup.cupmvp.javamvp.demo.MVPView;
import com.emptycup.cupmvp.javamvp.demo.MvpPresenter;

/**
 * Created by Administrator on 2018/2/6.
 * 第一重代理——》 目标对象
 */

public class ActivityMvpDelegateImpl<V extends MVPView,P extends MvpPresenter<V>> implements ActivityMvpDelegate<V,P>{
    private ProxyMvpCallBack<V,P> proxyMvpCallBack;

    public ActivityMvpDelegateImpl(MvpCallBack<V,P> mvpCallBack){
        this.proxyMvpCallBack = new ProxyMvpCallBack<>(mvpCallBack);
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        proxyMvpCallBack.createPresnter();
        proxyMvpCallBack.createView();
        proxyMvpCallBack.attachView();
    }

    @Override
    public void onStart() {

    }

    @Override
    public void onResume() {

    }

    @Override
    public void onPause() {

    }

    @Override
    public void onStop() {

    }

    @Override
    public void onDestroy() {
        proxyMvpCallBack.detachView();
    }
}
