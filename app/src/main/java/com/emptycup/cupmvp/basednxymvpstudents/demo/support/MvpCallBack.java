package com.emptycup.cupmvp.basednxymvpstudents.demo.support;

import com.emptycup.cupmvp.basednxymvpstudents.demo.MVPView;
import com.emptycup.cupmvp.basednxymvpstudents.demo.MvpPresenter;

/**
 * Created by Administrator on 2018/2/6.
 * 第二重代理  目标接口  MVP 绑定和解绑 接口
 */

public interface MvpCallBack<V extends MVPView,P extends MvpPresenter<V>> {
    P createPresnter();
    V createView();
    P getPresenter();
    void setPresenter(P presenter);
    V getMvpView();
}
