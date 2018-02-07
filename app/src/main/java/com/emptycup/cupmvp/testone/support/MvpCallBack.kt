package com.emptycup.cupmvp.testone.support

import com.emptycup.cupmvp.mvp.persenter.IBasePresenter
import com.emptycup.cupmvp.mvp.view.IBaseView

/**
 * Created by Administrator on 2018/1/9.
 * 第二层 代理   目标接口
 * 绑定 和 解绑
 */
interface MvpCallBack<V: IBaseView,  P: IBasePresenter<V>> {

    // 实现的是 绑定 和解绑 的规范-》绑定V层  和  解绑 V 层
    fun createPresenter():P
    fun createView():V
    fun getBasePresenter():P
    fun setBasePresenter(presenter:P)
    fun getBaseView():V
}