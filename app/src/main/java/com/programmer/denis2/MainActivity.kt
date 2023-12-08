package com.programmer.denis2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.programmer.denis2.api.ApiConfig
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ApiConfig.getService().getMorty().enqueue(object : Callback<ResponseMorty> {
            override fun onResponse(call: Call<ResponseMorty>, response: Response<ResponseMorty>) {
                TODO("Not yet implemented")
                if (response.isSuccessful){
                    val morty = findViewById<RecyclerView>(R.id.rv_mortin)
                    val responseMorty = response.body()
                    val dataMorty = responseMorty?.results
                    val mortyAdapter = MortyAdapter(dataMorty)
                    morty.apply{
                        layoutManager = LinearLayoutManager(this@MainActivity)
                        setHasFixedSize(true)
                        mortyAdapter.notifyDataSetChanged()
                        adapter = mortyAdapter
                    }
                }
            }

            override fun onFailure(call: Call<ResponseMorty>, t: Throwable) {
                TODO("Not yet implemented")
                Toast.makeText(applicationContext, t.localizedMessage, Toast.LENGTH_SHORT).show()
            }
        })


    }
}