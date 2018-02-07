package com.emptycup.cupmvp.javamvp.demo;

/**
 * Created by Administrator on 2018/2/6.
 *
 */

public class LoginModel {

    public void LoginResult(String use,String name,IHanlder iHanlder){
        iHanlder.Http_LoginResult(use+name);
    }
}
