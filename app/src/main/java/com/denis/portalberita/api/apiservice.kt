package com.denis.portalberita.api

import com.denis.portalberita.ResponsePortalBerita
import retrofit2.Call
import retrofit2.http.GET
interface apiservice {
    @GET("character")
    fun getBerita () : Call<ResponsePortalBerita>
}