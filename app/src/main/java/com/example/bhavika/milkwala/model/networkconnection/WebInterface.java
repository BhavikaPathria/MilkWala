package com.example.bhavika.milkwala.model.networkconnection;

import com.example.bhavika.milkwala.model.properties.login.LoginResultPrp;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by Bhavika on 04-03-2017.
 */

public interface WebInterface {

    @FormUrlEncoded
    @POST("milkwala/ws/login.php")
    Call<LoginResultPrp> requestLogin(@Field("email")String email,@Field("password") String password);


    @FormUrlEncoded
    @POST("milkwala/ws/forgotPassword.php")
    Call<ResponseBody> requestForgotPassword(@Field("email")String email);
}
