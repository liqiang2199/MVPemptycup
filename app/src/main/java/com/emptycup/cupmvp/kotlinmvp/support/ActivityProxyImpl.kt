package com.emptycup.cupmvp.kotlinmvp.support

import android.os.Bundle
import android.util.Log
import com.emptycup.cupmvp.kotlinmvp.basemvp.IBaseMvpPresenter
import com.emptycup.cupmvp.kotlinmvp.basemvp.IBaseMvpView

/**
 * Created by Administrator on 2018/1/7.
 * activity 目标对象的实现类
 */
 class ActivityProxyImpl<V: IBaseMvpView,  P: IBaseMvpPresenter<V>> : IActivityProxy<V,P> {
    //对Activity  引用
    private var proxyMvpCallBack:ProxyMvpCallBack<V,P> ?= null

    constructor(mvpCallBack: MvpCallBack<V, P>){
        Log.v("mvpCallBack","   mvpCallBack   ++++++ ")
        this.proxyMvpCallBack = ProxyMvpCallBack(mvpCallBack)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.v("mvpCallBack","   ActivityProxyImpl    onCreate ")
        if (proxyMvpCallBack != null){
            proxyMvpCallBack!!.createPresenter()
            proxyMvpCallBack!!.createView()
            proxyMvpCallBack!!.attachView()
        }
    }

    override fun onStart() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onResume() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onPause() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onStop() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onDestroy() {
        proxyMvpCallBack!!.detachVeiw()
    }

}