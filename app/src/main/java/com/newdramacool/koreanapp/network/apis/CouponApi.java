package com.newdramacool.koreanapp.network.apis;

import com.newdramacool.koreanapp.network.model.CouponDetails;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface CouponApi {
    @GET("coupon_details")
    Call<CouponDetails> getCouponDetails(@Query("api_secret_key") String key,
                                         @Query("coupon_code") String couponCode);

}
