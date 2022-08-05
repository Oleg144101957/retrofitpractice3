package com.vishnevskiypro.retrofitpractice3.data.repository

import com.vishnevskiypro.retrofitpractice3.data.api.RetrofitInstance
import com.vishnevskiypro.retrofitpractice3.model.beznal.Beznalichka
import com.vishnevskiypro.retrofitpractice3.model.nal.Nalichka
import retrofit2.Response

class Repository {

    suspend fun getNal() : Response<Nalichka>{
        return RetrofitInstance.api.getNalMoney()
    }

    suspend fun getBeznal() : Response<Beznalichka>{
        return RetrofitInstance.api.getBeznalMoney()
    }


}