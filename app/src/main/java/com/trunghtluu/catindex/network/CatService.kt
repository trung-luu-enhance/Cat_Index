package com.trunghtluu.catindex.network

import com.trunghtluu.catindex.model.Cat
import retrofit2.Call
import retrofit2.http.GET

interface CatService {

    @GET("/v1/images/search?has_breeds=true&limit=100&order=asc")
    abstract fun getCats(): Call<List<Cat>>
}