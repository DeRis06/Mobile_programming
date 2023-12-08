package com.programmer.denis2.api

import com.programmer.denis2.ResponseMorty
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET(value = "character")
    fun getMorty () : Call<ResponseMorty>
}