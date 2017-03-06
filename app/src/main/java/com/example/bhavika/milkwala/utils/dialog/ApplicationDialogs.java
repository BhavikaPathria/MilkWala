package com.example.bhavika.milkwala.utils.dialog;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;

import com.example.bhavika.milkwala.R;

/**
 * Created by Bhavika on 26-02-2017.
 */

public class ApplicationDialogs {

    //Show Dialog and close on press of ok

    public void showMessageDialogWithFinish(final Activity activity,String message){
        AlertDialog.Builder dialog=new AlertDialog.Builder(activity);
        dialog.setCancelable(false);
        dialog.setMessage(message);
        dialog.setTitle(activity.getString(R.string.feedback));
        dialog.setPositiveButton(activity.getString(R.string.ok), new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                activity.finish();
            }
        });
        dialog.show();
    }

    //Show Dialog and andkeep activity running on press of ok

    public void showMessageDialog(Activity activity,String message){
        AlertDialog.Builder dialog=new AlertDialog.Builder(activity);
        dialog.setCancelable(false);
        dialog.setMessage(message);
        dialog.setTitle(activity.getString(R.string.feedback));
        dialog.setPositiveButton(activity.getString(R.string.ok), new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        dialog.show();
    }
}
