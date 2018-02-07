package com.emptycup.cupmvp.kotlinmvp.support

import com.emptycup.cupmvp.kotlinmvp.basemvp.IBaseMvpPresenter
import com.emptycup.cupmvp.kotlinmvp.basemvp.IBaseMvpView

/**
 * Created by Administrator on 2018/1/9.
 * 第二层 代理   目标接口
 * 绑定 和 解绑
 */
interface MvpCallBack<V: IBaseMvpView,  P: IBaseMvpPresenter<V>> {

    // 实现的是 绑定 和解绑 的规范-》绑定V层  和  解绑 V 层
    fun createPresenter():P
    fun createView():V
    fun getPresenter():P
    fun setPresenter(presenter:P)
    fun getView():V
}