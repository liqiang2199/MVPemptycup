package com.emptycup.cupmvp.kotlinmvp.basemvp

/**
 * Created by Administrator on 2018/2/7.
 * 所有View层的公用基类
 */
interface IBaseMvpView {

    fun IView_Success(o:Any)//成功
    fun IView_Fail(o:Any)//失败
    fun IView_NoNetWork(o: Any)//无网络 界面的显示
    fun IView_NoData(o: Any)//无数据 界面显示
    fun IView_RequestError(o: Any)//请求异常 或者错误
    fun IView_SignleSignOn(o: Any)//单点登录 实现
}