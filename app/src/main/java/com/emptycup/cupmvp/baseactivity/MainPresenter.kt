package com.emptycup.cupmvp.baseactivity

import android.content.Context
import com.emptycup.cupmvp.mvp.persenter.BasePersenterImp

/**
 * Created by Administrator on 2017/12/16.
 */
class MainPresenter :BasePersenterImp<MainModel>(){
    fun http_Model(){
        val v = MainModel()
        newInstanceModel()
        v!!.Init_Handler(pContext!!,this)
        v!!.http_GeRequest()
    }

    override fun IHandler_Success(o: Any) {
        iBaseView!!.IView_Success(o)
    }
}