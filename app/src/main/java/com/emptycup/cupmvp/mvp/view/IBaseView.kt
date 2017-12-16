package com.emptycup.cupmvp.mvp.view

/**
 * Created by Administrator on 2017/12/16.
 * MVP View管理的父类
 */
interface IBaseView {
    fun IView_Success(o:Any)//成功
    fun IView_Fail(o:Any)//失败
    fun IView_NoNetWork(o: Any)//无网络 界面的显示
    fun IView_NoData(o: Any)//无数据 界面显示
    fun IView_RequestError(o: Any)//请求异常 或者错误
    fun IView_SignleSignOn(o: Any)//单点登录 实现
}