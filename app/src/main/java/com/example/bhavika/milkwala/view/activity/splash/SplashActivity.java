package com.example.bhavika.milkwala.view.activity.splash;

import android.content.Intent;
import android.os.Bundle;
;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

import com.example.bhavika.milkwala.R;
import com.example.bhavika.milkwala.utils.connectionutils.ConnectionUtils;
import com.example.bhavika.milkwala.utils.dialog.ApplicationDialogs;
import com.example.bhavika.milkwala.view.activity.login.LoginActivity;


public class SplashActivity extends AppCompatActivity {
    //Splash Time
    int Splash_Time=5000;

  //Splash screen load starts

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashactivity);
    }
    @Override
    protected void onResume() {
        super.onResume();
        checkConnection();
    }

    //Check internet connection
    private void checkConnection()
    {
        //Show Dialog if there is no internet connection
        ConnectionUtils connectionUtils=new ConnectionUtils();
        boolean value=connectionUtils.checkInternetConnection(this);
        if(value==true){
            startSplash();
        }
        else{
            ApplicationDialogs applicationDialogs=new ApplicationDialogs();
            applicationDialogs.showMessageDialogWithFinish(this,getString(R.string.internetconnectionmessage));
        }
    }

    private void startSplash() {
     new Handler().postDelayed(new Runnable() {
         @Override
         public void run() {
             Intent intent=new Intent(SplashActivity.this,LoginActivity.class);
             startActivity(intent);
         }
     },Splash_Time);

    }


}
