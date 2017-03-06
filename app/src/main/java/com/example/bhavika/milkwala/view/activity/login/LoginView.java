package com.example.bhavika.milkwala.view.activity.login;

import com.example.bhavika.milkwala.model.properties.login.LoginResultPrp;

/**
 * Created by Bhavika on 04-03-2017.
 */

public interface LoginView {

    void onLoginComplete(LoginResultPrp loginResult);

    void startProgress();
    void stopProgress();

    void showFeedbackMessage(String message);

    void onForgotPasswordComplete();

}
