package com.emptycup.cupmvp.mvp.model

import android.content.Context
import com.emptycup.cupmvp.mvp.handlerview.IHandler

/**
 * Created by Administrator on 2017/12/16.
 */
interface IBaseModel {
    fun Init_Handler(context: Context, miHandler: IHandler)
}