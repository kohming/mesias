package com.gka.gkamobile.service;


import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface TokenApiService {

    @POST("/auth/get_token")
    @FormUrlEncoded
    Call<ResponseBody> postKontak(@Field("app_id") String appId, @Field("app_key") String appKey);
}
