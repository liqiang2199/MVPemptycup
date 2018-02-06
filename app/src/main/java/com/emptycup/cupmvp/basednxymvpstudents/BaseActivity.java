package com.emptycup.cupmvp.basednxymvpstudents;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.emptycup.cupmvp.basednxymvpstudents.demo.MvpPresenter;
import com.emptycup.cupmvp.basednxymvpstudents.demo.MVPView;
import com.emptycup.cupmvp.basednxymvpstudents.demo.support.ActivityMvpDelegate;
import com.emptycup.cupmvp.basednxymvpstudents.demo.support.ActivityMvpDelegateImpl;
import com.emptycup.cupmvp.basednxymvpstudents.demo.support.MvpCallBack;

/**
 * Created by Administrator on 2018/2/6.
 * 特点： 持有P 层 引用
 * 特点： 实现交互接口
 *
 * 第一重 代理 -》 代理对象
 * 代理模式的两个特点：1：持有目标对象的引用 2： 实现目标接口（可有可无）
 *
 * 第二重 代理 ——》 目标对象
 */

public abstract class BaseActivity<V extends MVPView,P extends MvpPresenter<V>> extends Activity implements
        MVPView,MvpCallBack<V,P>{

    private P presenter;


    //特点一：持有目标对象的引用
    private ActivityMvpDelegateImpl<V,P> mvpDelegate;

    public ActivityMvpDelegateImpl<V, P> getMvpDelegate() {
        if (mvpDelegate == null){
            this.mvpDelegate = new ActivityMvpDelegateImpl<>(this);
        }
        return mvpDelegate;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getMvpDelegate().onCreate(savedInstanceState);
    }


    @Override
    public P createPresnter() {
        return presenter;
    }

    @Override
    public P getPresenter() {
        return presenter;
    }

    @Override
    public V createView() {
        return (V) this;
    }

    @Override
    public V getMvpView() {
        return (V) this;
    }

    @Override
    public void setPresenter(P presenter) {
        this.presenter = presenter;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        getMvpDelegate().onDestroy();
    }
}
