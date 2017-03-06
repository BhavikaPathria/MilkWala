package com.example.bhavika.milkwala.view.activity.login;

/**
 * Created by Bhavika on 04-03-2017.
 */

public interface ILoginPresenter {


    public void requestLogin(String email,String password);
    public void requestForgotPassword(String email);
}
