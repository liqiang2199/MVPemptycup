package com.emptycup.cupmvp.test

import com.emptycup.cupmvp.mvp.persenter.BasePresenterImp

/**
 * Created by Administrator on 2017/12/16.
 */
class MainPresenterOne : BasePresenterImp<MainViewOne>(){

    private var mainModelOne: MainModelOne?= null
    fun http_Model(){
//        val v = MainModel()
//        newInstanceModel()
//        iBaseModel!!.Init_Handler(pContext!!,this)
//        iBaseModel!!.http_GeRequest()
        mainModelOne = MainModelOne()
        mainModelOne!!.Init_Handler(this)
        mainModelOne!!.http_GeRequest()
    }

    private var mainView:MainViewOne ?= null
    override fun IHandler_Success(o: Any) {
        mainView = getWeakView()
        mainView!!.IView_Success(o)
    }
}