package com.wani.kotlinproject.Mvvm

import android.media.Image
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.POST
import retrofit2.http.Query
import java.io.File

interface Service {

   // @Headers("Content-Type: multipart/form-data; boundary=--------------------------813124492853403612087460")
    @GET("/cotest/index.php/mores/notice/select_using_term")
    fun requestSearchImage(
   //    @Query("category") category: String
    ): Call<DataTest.Notice>

    @GET("/cotest/index.php/mores/notice/select_using_term")
    fun requestUploadImage(
        @Query("category") category: String,
        @Query("image") image: File
    ): Call<DataTest.Notice>

}