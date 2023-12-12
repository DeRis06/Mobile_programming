package com.denis.portalberita.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

object apiconfig {
    const val baseURL ="http://127.0.0.1/PortalBerita/public/api/berita/"

    fun getRetrofit() : Retrofit {
        return Retrofit.Builder().baseUrl(baseURL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
    fun getService() : apiservice{
        return getRetrofit().create(apiservice::class.java)
    }
}