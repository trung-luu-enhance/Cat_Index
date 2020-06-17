package com.trunghtluu.catindex.network

import com.trunghtluu.catindex.model.Breed
import com.trunghtluu.catindex.model.Cat
import com.trunghtluu.catindex.utils.Constants
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class CatRetrofit {

    private val catService: CatService

    init {
        catService = createCatService(getInstance());
    }

    private fun getInstance(): Retrofit {
        val logging = HttpLoggingInterceptor()
        logging.setLevel(HttpLoggingInterceptor.Level.HEADERS)
        val client = OkHttpClient.Builder()
            .addInterceptor(logging)
            .build()

        return Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(client)
            .build()
    }

    private fun createCatService(retrofit: Retrofit): CatService {
        return retrofit.create(CatService::class.java)
    }

    fun getCats(): Call<List<Cat>> {
        return catService.getCats()
    }
}