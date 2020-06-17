package com.trunghtluu.catindex.viewmodel

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.trunghtluu.catindex.model.Breed
import com.trunghtluu.catindex.model.Cat
import com.trunghtluu.catindex.network.CatRetrofit
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainCat(application: Application) : AndroidViewModel(application) {
    private val catRetrofit = CatRetrofit()
    private val resultLiveData = MutableLiveData<List<Cat>>()

    fun getCats() {
        catRetrofit.getCats().enqueue(object : Callback<List<Cat>> {
            override fun onResponse(call: Call<List<Cat>>, response: Response<List<Cat>>) {
                Log.d("TAG_X", "pass")
                resultLiveData.setValue(response.body())
            }

            override fun onFailure(call: Call<List<Cat>>, t: Throwable) {
                println("Fail")
                Log.d("TAB_X", "Fail")
            }
        })
    }

    fun getResultLiveData(): MutableLiveData<List<Cat>> {
        return resultLiveData
    }


}