package com.emptycup.cupmvp.kotlinmvp

import com.emptycup.cupmvp.kotlinmvp.basemvp.IHanlderMvp

/**
 * Created by Administrator on 2018/2/7.
 *
 */
class KotlinLoginModel {
    fun LoginResult(use: String, name: String, iHanlder: IHanlderMvp) {
        iHanlder.IHandler_Success(use+name)
    }
}