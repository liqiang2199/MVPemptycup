package com.emptycup.cupmvp.kotlinmvp.support

import android.util.Log
import com.emptycup.cupmvp.kotlinmvp.basemvp.IBaseMvpPresenter
import com.emptycup.cupmvp.kotlinmvp.basemvp.IBaseMvpView

/**
 * Created by Administrator on 2018/1/9.
 * 第二次代理的 目标实现
 */
class ProxyMvpCallBack<V: IBaseMvpView,  P: IBaseMvpPresenter<V>>(var mvpCallBack: MvpCallBack<V, P>) : MvpCallBack<V, P> {

    override fun createPresenter(): P {
        var presenter:P = mvpCallBack.getPresenter()
        if (presenter == null){
            presenter = mvpCallBack.createPresenter()
        }
        if (presenter == null){
            throw  NullPointerException("Presenter Is Null")
        }
        mvpCallBack.setPresenter(presenter)
        return presenter
    }

    override fun createView(): V {
        var view:V = mvpCallBack.getView()
        if (view == null){
            view = mvpCallBack.createView()
        }
        if (view == null){
            throw  NullPointerException("View Is Null")
        }
        return view
    }

    override fun getPresenter(): P {
        return mvpCallBack.getPresenter()
    }

    override fun setPresenter(presenter: P) = mvpCallBack.setPresenter(presenter)

    override fun getView(): V {
        return mvpCallBack.getView()
    }

    fun attachView(){
        Log.v("attachView","     getBaseView        "+getView())
        getPresenter().attachView(getView())
    }

    fun detachVeiw(){
        getPresenter().detachView()
    }

}