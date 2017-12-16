package com.emptycup.cupmvp.baseactivity;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;

import com.emptycup.cupmvp.MainActivity;
import com.emptycup.cupmvp.mvp.persenter.BasePersenterImp;
import com.emptycup.cupmvp.mvp.view.IBaseView;
import java.lang.reflect.Type;
import java.lang.reflect.ParameterizedType;

/**
 * Created by Administrator on 2017/12/16.
 * 父类 的Activity 绑定 View 和 Presenter
 * V  View 层
 * P  Presenter层
 */

public abstract class BaseActivity<V extends IBaseView,P extends BasePersenterImp> extends Activity
implements IBaseView{
    public P presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    //绑定 View 和 Presenter
    public BasePersenterImp Init_Presenter(String name) throws Exception {
        if (presenter == null){

            Log.v("this","初始化           1");
            Class<?> clazz = Class.forName(name);

            // 1获取子类的class(在创建子类对象的时候,会返回父类的构造方法)
//            Class<? extends BasePersenterImp> clazz = BasePersenterImp.class; // Student
            presenter = (P) clazz.newInstance();
        }
        Log.v("this","初始化     2  ");
        presenter.attachView(this,this);
        return presenter;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (presenter != null){
            presenter.onDestroy("");
            presenter = null;
        }
    }
}
