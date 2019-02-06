package com.learn2crack.imageupload;

import okhttp3.MultipartBody;
import retrofit2.Call;
import retrofit2.http.Header;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Query;

public interface RetrofitInterface {
    @Multipart
    @POST("users/upload_file")
    Call<Resumefile> uploadImage(@Part MultipartBody.Part image, @Query("user_id") String name, @Header("X-API-KEY") String  s, @Header("Authorization") String  ss);
}
