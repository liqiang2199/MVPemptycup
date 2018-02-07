package com.emptycup.cupmvp.kotlinmvp.basemvp

import java.lang.ref.WeakReference

/**
 * Created by Administrator on 2018/2/7.
 *
 */
abstract class IBaseMvpPresenter<V:IBaseMvpView> :IHanlderMvp{
    private var view:WeakReference<V> ?= null

    fun attachView(view:V){
        this.view = WeakReference(view)
    }

    fun getView(): V? {
        return view!!.get()
    }

    fun detachView(){
        if (view != null){
            view!!.clear()
            view = null
        }
    }

    /**
     * 为了 使 Persenter 的子类 选择性 实现 IHandler 接口
     */
    override fun IHandler_Success(o:Any){}//成功
    override fun IHandler_Fail(o:Any){}//失败
    override fun IHandler_NoNetWork(o: Any){}//无网络 界面的显示
    override fun IHandler_NoData(o: Any){}//无数据 界面显示
    override fun IHandler_RequestError(o: Any){}//请求异常 或者错误
    override fun IHandler_SignleSignOn(o: Any){}//单点登录 实现
}