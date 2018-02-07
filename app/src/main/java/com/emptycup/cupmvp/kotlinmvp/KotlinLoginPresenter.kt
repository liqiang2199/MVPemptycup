package com.emptycup.cupmvp.kotlinmvp

import com.emptycup.cupmvp.kotlinmvp.basemvp.IBaseMvpPresenter
import com.emptycup.cupmvp.kotlinmvp.basemvp.IBaseMvpView
import com.emptycup.cupmvp.kotlinmvp.basemvp.IHanlderMvp

/**
 * Created by Administrator on 2018/2/7.
 *
 */
class KotlinLoginPresenter :IBaseMvpPresenter<KotilnLoginView>(),IHanlderMvp{
    override fun IHandler_Success(o: Any) {
        getView()!!.LoginSuccess(o as String)
    }

    var loginMvpModel:KotlinLoginModel ?= null

    fun http_Model(){
        loginMvpModel = KotlinLoginModel()
        loginMvpModel!!.LoginResult(
                "kkkk ",
                "147258369",
                this
        )
    }
}