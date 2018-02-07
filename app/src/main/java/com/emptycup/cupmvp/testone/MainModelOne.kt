package com.emptycup.cupmvp.test

import android.content.Context
import com.emptycup.cupmvp.mvp.handlerview.IHandler
import com.emptycup.cupmvp.mvp.model.BaseModel

/**
 * Created by Administrator on 2017/12/16.
 *
 */
class MainModelOne :BaseModel() {
    override fun Init_Handler(context: Context, miHandler: IHandler) {
        this.context  = context
        this.iHandler  = miHandler
    }
     fun Init_Handler(miHandler: IHandler) {
        this.iHandler  = miHandler
    }
    fun http_GeRequest(){
        iHandler!!.IHandler_Success("成功")
    }
}