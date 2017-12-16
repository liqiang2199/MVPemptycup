package com.emptycup.cupmvp.mvp.persenter

import com.emptycup.cupmvp.mvp.handlerview.IHandler
import com.emptycup.cupmvp.mvp.model.BaseModel
import com.emptycup.cupmvp.mvp.view.IBaseView
import java.lang.ref.WeakReference

/**
 * Created by Administrator on 2017/12/16.
 * 绑定 View 层
 */
 abstract class BasePersenterImp<M : BaseModel> : IBasePersenter<IBaseView, M>,IHandler{

    constructor()
    /**
     * 为了 使 Persenter 的子类 选择性 实现 IHandler 接口
     */
    override fun IHandler_Success(o:Any){}//成功
    override fun IHandler_Fail(o:Any){}//失败
    override fun IHandler_NoNetWork(o: Any){}//无网络 界面的显示
    override fun IHandler_NoData(o: Any){}//无数据 界面显示
    override fun IHandler_RequestError(o: Any){}//请求异常 或者错误
    override fun IHandler_SignleSignOn(o: Any){}//单点登录 实现

    var iBaseView:IBaseView ?= null
    var iBaseModel:M ?= null
    //绑定View
    override fun attachView(view: IBaseView) {
        this.iBaseView  = view
    }

    override fun detachView() {
        if (iBaseView != null){
            iBaseView=null
        }
    }
    //获取Model 的实例化
    override fun newInstanceModel(model: M) {
//        this.iBaseModel = model
        // 获取Class类对象
        val cls = model::class.java
        // 调用newInstance方法创建Person类对象
        //将子类的引用对象指向 父类
        iBaseModel = cls.newInstance()
    }

    override fun detachModel() {
        if (iBaseModel != null){
            iBaseModel=null
        }
    }

    override fun onDestroy(o: Any) {
        detachView()
        detachModel()
    }

    override fun onPause(o: Any) {

    }

    override fun onResume(o: Any) {

    }

    override fun onStart(o: Any) {

    }

    override fun onStop(o: Any) {

    }
}