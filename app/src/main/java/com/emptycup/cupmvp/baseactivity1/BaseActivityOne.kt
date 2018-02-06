package com.emptycup.cupmvp.baseactivity1

import android.app.Activity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.emptycup.cupmvp.baseactivity1.support.ActivityProxyImpl
import com.emptycup.cupmvp.baseactivity1.support.IActivityProxy
import com.emptycup.cupmvp.baseactivity1.support.MvpCallBack
import com.emptycup.cupmvp.mvp.persenter.BasePresenterImp
import com.emptycup.cupmvp.mvp.persenter.IBasePresenter
import com.emptycup.cupmvp.mvp.view.IBaseView

/**
 * Created by Administrator on 2018/1/7.
 * MVP 的第二次优化
 * 绑定View 层 和 实例化P层
 */
abstract class BaseActivityOne< V : IBaseView,  P : IBasePresenter< V>> : Activity()
,IBaseView,MvpCallBack<V,P>{

    //这个代理对象 持有目标对象的实例
    private var activityProxyImpl: IActivityProxy<V, P>?= null


    private fun getActivityProxyImpl():IActivityProxy<V,P>{
        if (activityProxyImpl == null){
            activityProxyImpl = ActivityProxyImpl(this)
        }
        return activityProxyImpl!!
    }


    private var presenter:P ?= null

    override fun createPresenter(): P {
        return presenter!!
    }

    override fun createView(): V {
        return this as V
    }

    override fun getBasePresenter(): P {
        return createPresenter()
    }

    override fun getBaseView(): V {
        return this as V
    }

    override fun setBasePresenter(presenter: P) {
        this.presenter = presenter
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        if ( activityProxyImpl != null){
//            //抛空
//            activityProxyImpl = ActivityProxyImpl(this)
//
            getActivityProxyImpl().onCreate(savedInstanceState)
//        }else{
//            Log.v("activityProxyImpl","   activityProxyImpl  NULL   ++++++ ")
//        }

//        val proxyMvpCallBack = ActivityProxyImpl(this)
//        activityProxyImpl = ActivityProxyImpl(this)
//        activityProxyImpl!!.onCreate(savedInstanceState)
    }

    override fun onDestroy() {
        super.onDestroy()
        getActivityProxyImpl().onDestroy()
    }
}