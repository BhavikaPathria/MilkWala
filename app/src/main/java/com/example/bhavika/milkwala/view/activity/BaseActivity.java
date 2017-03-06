package com.example.bhavika.milkwala.view.activity;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Bhavika on 04-03-2017.
 */

public class BaseActivity extends AppCompatActivity{


    ProgressDialog progressDialog;

    public void startProgressDialog(String message)
    {
        progressDialog=new ProgressDialog(this);
        progressDialog.setCancelable(false);
        progressDialog.setMessage(message);
        progressDialog.show();
    }


    public void stopProgressDialog()
    {
        if(progressDialog!=null) {
            progressDialog.dismiss();
        }
    }

}
