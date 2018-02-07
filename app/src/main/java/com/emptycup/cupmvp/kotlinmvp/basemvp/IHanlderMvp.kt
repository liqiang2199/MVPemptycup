package com.emptycup.cupmvp.kotlinmvp.basemvp

/**
 * Created by Administrator on 2018/2/7.
 * 界面的所有的通知类
 */
interface IHanlderMvp {
    fun IHandler_Success(o:Any)//成功
    fun IHandler_Fail(o:Any)//失败
    fun IHandler_NoNetWork(o: Any)//无网络 界面的显示
    fun IHandler_NoData(o: Any)//无数据 界面显示
    fun IHandler_RequestError(o: Any)//请求异常 或者错误
    fun IHandler_SignleSignOn(o: Any)//单点登录 实现
}