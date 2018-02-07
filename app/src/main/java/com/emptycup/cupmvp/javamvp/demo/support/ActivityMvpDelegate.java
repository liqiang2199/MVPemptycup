package com.emptycup.cupmvp.javamvp.demo.support;

import android.os.Bundle;

import com.emptycup.cupmvp.javamvp.demo.MVPView;
import com.emptycup.cupmvp.javamvp.demo.MvpPresenter;

/**
 * Created by Administrator on 2018/2/6.
 *
 * 第一重代理 ——》目标接口
 */

public interface ActivityMvpDelegate<V extends MVPView,P extends MvpPresenter<V>> {

    void onCreate(Bundle savedInstanceState);
    void onStart();
    void onResume();
    void onPause();
    void onStop();
    void onDestroy();
}
