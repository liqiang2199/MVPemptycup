package com.emptycup.cupmvp.mvp.model

import android.content.Context
import com.emptycup.cupmvp.mvp.handlerview.IHandler

/**
 * Created by Administrator on 2017/12/16.
 * 管理 每个Model 层 都需要的 统一 接口
 */
open class BaseModel  :IBaseModel{
    override fun Init_Handler(context: Context, miHandler: IHandler) {}

    var iHandler:IHandler ?= null
    var context: Context ?= null


}