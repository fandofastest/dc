package com.newdramacool.koreanapp.network.apis;

import com.newdramacool.koreanapp.network.model.AllPackage;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;

public interface PackageApi {

    @GET("all_package")
    Call<AllPackage> getAllPackage(@Header("API-KEY") String apiKey);

}
