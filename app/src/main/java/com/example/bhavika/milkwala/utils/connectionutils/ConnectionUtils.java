package com.example.bhavika.milkwala.utils.connectionutils;

import android.app.Activity;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/**
 * Created by Bhavika on 25-02-2017.
 */

public class ConnectionUtils {

    //Check Internet Connection is Live or not
          public boolean checkInternetConnection(Activity activity){

           ConnectivityManager connectionService=(ConnectivityManager)activity.getSystemService(Context.CONNECTIVITY_SERVICE);
           NetworkInfo networkInfo=connectionService.getActiveNetworkInfo();
           boolean isNetworkConnected=false;
              try {
                  if(networkInfo.isConnected()==true)
                  {
                      isNetworkConnected=true;
                  }
                  else{
                     isNetworkConnected=false;
                  }
              }
              catch(NullPointerException e)
              {
                  isNetworkConnected=false;
              }

              try {
                  if (networkInfo.isConnectedOrConnecting() == true) {
                      isNetworkConnected = true;
                  } else {
                      isNetworkConnected = false;
                  }
              }
                  catch(NullPointerException e){
                      isNetworkConnected=false;
                  }
            return isNetworkConnected;
          }
}
