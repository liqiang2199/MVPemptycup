package com.emptycup.cupmvp.mvp.persenter

import android.content.Context
import android.util.Log
import com.emptycup.cupmvp.mvp.handlerview.IHandler
import com.emptycup.cupmvp.mvp.model.BaseModel
import com.emptycup.cupmvp.mvp.view.IBaseView
import java.lang.ref.WeakReference
import java.lang.reflect.ParameterizedType

/**
 * Created by Administrator on 2017/12/16.
 * 绑定 View 层 和Model 层
 */
 abstract class BasePresenterImp<V:IBaseView> : IBasePresenter<V>,IHandler{

    /**
     * 为了 使 Persenter 的子类 选择性 实现 IHandler 接口
     */
    override fun IHandler_Success(o:Any){}//成功
    override fun IHandler_Fail(o:Any){}//失败
    override fun IHandler_NoNetWork(o: Any){}//无网络 界面的显示
    override fun IHandler_NoData(o: Any){}//无数据 界面显示
    override fun IHandler_RequestError(o: Any){}//请求异常 或者错误
    override fun IHandler_SignleSignOn(o: Any){}//单点登录 实现

    var iBaseView:WeakReference<V> ?= null// 利用 弱引用
//    var iBaseView:V ?= null// 利用 弱引用
    var iBaseModel:BaseModel ?= null

    var pContext:Context ?= null
    //绑定View
    override fun attachView( view:V) {
        //获取实例化
        Log.v("dddd","     getBaseView        "+view)
        this.iBaseView  = WeakReference(view)
//        this.iBaseView  = view
//        this.pContext = pContext

//        newInstanceModel()
    }
//    fun getWeakView(): V? {
//        return iBaseView!!.get()
//    }
    fun getWeakView(): V? {
        return iBaseView!!.get()
    }
    override fun detachView() {
        if (iBaseView != null){
            iBaseView!!.clear()
            iBaseView=null
        }
        if (pContext != null){
            pContext = null
        }
    }

    //获取Model 的实例化
    override fun newInstanceModel() {
        // 获取Class类对象
        val cls = BaseModel::class.java
        //将子类的引用对象指向 父类
        iBaseModel = cls.newInstance()

        val type = javaClass.genericSuperclass//使用反射实例化Model
        val trueType = (type as ParameterizedType).actualTypeArguments[0]
        try {
            this.iBaseModel = (trueType as Class<BaseModel>).newInstance()
        } catch (e: InstantiationException) {
            e.printStackTrace()
        } catch (e: IllegalAccessException) {
            e.printStackTrace()
        }
    }
//
    override fun detachModel() {
        if (iBaseModel != null){
            iBaseModel=null
        }
    }

    //销毁 界面的View  和 Model 层的实例
    override fun onDestroy(o: V) {
        detachView()
        detachModel()
    }

    override fun onPause(o: V) {}
    override fun onResume(o: V) {}
    override fun onStart(o: V) {}
    override fun onStop(o: V) {}
}