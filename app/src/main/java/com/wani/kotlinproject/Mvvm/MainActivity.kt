package com.wani.kotlinproject.Mvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import com.wani.kotlinproject.R
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        SearchRetrofit.getService().requestSearchImage().enqueue(object : Callback<DataTest.Notice> {
            override fun onFailure(call: Call<DataTest.Notice>, t: Throwable) {

                Log.e("search_data_error : ", t.toString())
            }

            override fun onResponse(
                call: Call<DataTest.Notice>,
                response: Response<DataTest.Notice>
            ) {
                if (response.isSuccessful) {
                    val image = response.body()?.response
                    val data = response.body()?.data


                    Log.e("search_data : ", image.toString())
                    Log.e("search_data : ", data.toString())

                }
            }


        })


    }

    object SearchRetrofit {
        // 위에서 만든 RetrofitService를 연결해줍니다.
        fun getService(): Service = retrofit

        private val retrofit =
            Retrofit.Builder()
                .baseUrl("https://abee997.co.kr") // 도메인 주소
                .addConverterFactory(GsonConverterFactory.create()) // GSON을 사요아기 위해 ConverterFactory에 GSON 지정
                .build()
                .create(Service::class.java)
    }
}

