package com.emptycup.cupmvp.mvp.persenter

import android.icu.lang.UCharacter.GraphemeClusterBreak.V



/**
 * Created by Administrator on 2017/12/16.
 * persenter 管理Persenter 父类
 * 作用： 实现Model 层的 业务逻辑 反馈给View 层
 *   同时绑定 Model 和 View 层
 *   T  View层
 *   V  Model层
 *
 */
interface IBasePersenter<T,V> {

    fun attachView(view: T)//初始化 View
    fun detachView()//将View值空

    fun newInstanceModel(model:V)// 获取 Model 对象
    fun detachModel()//销毁Model

    //绑定 Activity 生命周期 回收 引用类型
    fun onStart(o:Any)
    fun onResume(o:Any)
    fun onPause(o:Any)
    fun onStop(o:Any)
    fun onDestroy(o:Any)
}