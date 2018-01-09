package com.emptycup.cupmvp.baseactivity

import com.emptycup.cupmvp.mvp.persenter.BasePresenterImp

/**
 * Created by Administrator on 2017/12/16.
 */
class MainPresenterOne : BasePresenterImp<MainView>(){


    fun http_Model(){
//        val v = MainModel()
//        newInstanceModel()
//        iBaseModel!!.Init_Handler(pContext!!,this)
//        iBaseModel!!.http_GeRequest()
    }

    private var mainView:MainView ?= null
    override fun IHandler_Success(o: Any) {
        mainView = getWeakView()
        mainView!!.IView_Success(o)
    }
}