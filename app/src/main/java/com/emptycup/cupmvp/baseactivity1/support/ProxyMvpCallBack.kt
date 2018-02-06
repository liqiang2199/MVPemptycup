package com.emptycup.cupmvp.baseactivity1.support

import android.util.Log
import com.emptycup.cupmvp.mvp.persenter.IBasePresenter
import com.emptycup.cupmvp.mvp.view.IBaseView

/**
 * Created by Administrator on 2018/1/9.
 * 第二次代理的 目标实现
 */
class ProxyMvpCallBack<V: IBaseView,  P: IBasePresenter<V>>(var mvpCallBack: MvpCallBack<V,P>) :MvpCallBack<V,P> {

    override fun createPresenter(): P {
        return mvpCallBack.createPresenter()
    }

    override fun createView(): V {
        return mvpCallBack.createView()
    }

    override fun getBasePresenter(): P {
        return mvpCallBack.getBasePresenter()
    }

    override fun setBasePresenter(presenter: P) = mvpCallBack.setBasePresenter(presenter)

    override fun getBaseView(): V {
        return mvpCallBack.getBaseView()
    }

    fun attachView(){
        Log.v("attachView","     getBaseView        "+getBaseView())
        createPresenter().attachView(getBaseView())
    }

    fun detachVeiw(){
        getBasePresenter().detachView()
    }

}