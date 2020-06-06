package com.newdramacool.koreanapp.network.apis;


import com.newdramacool.koreanapp.network.model.User;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Header;
import retrofit2.http.POST;

public interface SignUpApi {
    @FormUrlEncoded
    @POST("signup")
    Call<User> signUp(@Header("API-KEY") String apiKey,
                      @Field("email") String email,
                      @Field("password") String password,
                      @Field("name") String name);

}