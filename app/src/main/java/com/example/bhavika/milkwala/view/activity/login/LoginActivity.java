package com.example.bhavika.milkwala.view.activity.login;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.bhavika.milkwala.R;
import com.example.bhavika.milkwala.model.properties.login.LoginResultPrp;
import com.example.bhavika.milkwala.view.activity.BaseActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends BaseActivity implements LoginView {


    @BindView(R.id.editTextEmail)
    EditText editTextEmail;

    @BindView(R.id.editTextPassword)
    EditText editTextPassword;


    ILoginPresenter loginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginactivity);

        ButterKnife.bind(this);
        loginPresenter=new LoginPresenter(this,this);
    }

    @OnClick(R.id.buttonLogin)
    public void onLoginButtonClick()
    {
        loginPresenter.requestLogin(editTextEmail.getText().toString(),editTextPassword.getText().toString());
    }


    @OnClick(R.id.textViewForgotPassword)
    public void onForgotPasswordClick()
    {
        loginPresenter.requestForgotPassword(editTextEmail.getText().toString());
    }


    @Override
    public void onLoginComplete(LoginResultPrp loginResult) {

        Toast.makeText(this,loginResult.getResult().getMessage(),Toast.LENGTH_SHORT).show();


    }

    @Override
    public void startProgress() {

        startProgressDialog(getString(R.string.loadingpleasewait));
    }

    @Override
    public void stopProgress() {

        stopProgressDialog();
    }

    @Override
    public void showFeedbackMessage(String message) {

        Toast.makeText(this,message,Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onForgotPasswordComplete() {

    }
}
