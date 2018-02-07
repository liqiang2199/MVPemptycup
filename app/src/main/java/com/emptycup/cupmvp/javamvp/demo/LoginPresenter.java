package com.emptycup.cupmvp.javamvp.demo;

/**
 * Created by Administrator on 2018/2/6.
 * 1.持有Model 的实例化
 */

public class LoginPresenter extends MvpPresenter<LoginView> {

    private LoginModel loginModel;


    public LoginPresenter(){
        this.loginModel = new LoginModel();
    }

    public void http(String use,String name){
        loginModel.LoginResult(use, name, new IHanlder() {
            @Override
            public void Http_LoginResult(String msg) {
                getLoginView().onLoginResult(msg);
            }
        });

    }


}
