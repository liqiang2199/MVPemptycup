package com.emptycup.cupmvp.testone.support

import android.os.Bundle
import com.emptycup.cupmvp.mvp.persenter.IBasePresenter
import com.emptycup.cupmvp.mvp.view.IBaseView

/**
 * Created by Administrator on 2018/1/7.
 *  activtiy目标对象的接口
 *
 *  双重代理  Activity 代理生命周期
 */
interface IActivityProxy<in V:IBaseView,P:IBasePresenter<V>> {

    fun onCreate(savedInstanceState: Bundle?)
    fun onStart()
    fun onResume()
    fun onPause()
    fun onStop()
    fun onDestroy()
}