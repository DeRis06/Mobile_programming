package com.denis.portalberita

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.denis.portalberita.api.apiconfig
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class news_page : AppCompatActivity() {
    private lateinit var ImageView: ImageView

    private fun initComponents(){
        ImageView = findViewById(R.id.back)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.portal)
        val berita = findViewById<RecyclerView>(R.id.rv_portal)
        initComponents()
        val imageClick = ImageView

        imageClick.setOnClickListener{
            val intent = Intent(this,beranda_user::class.java)
            startActivity(intent)
        }

        apiconfig.getService().getBerita().enqueue(object: Callback<ResponsePortalBerita>{
            override fun onResponse(call: Call<ResponsePortalBerita>, response: Response<ResponsePortalBerita>) {
                if(response.isSuccessful){
                    val responsePortalBerita = response.body()
                    val dataBerita = responsePortalBerita?.data
                    val PortalBeritaAdapter = PortalBeritaAdapter(dataBerita)
                    berita.apply {
                        layoutManager = LinearLayoutManager(this@news_page)

                        PortalBeritaAdapter.notifyDataSetChanged()
                        adapter = PortalBeritaAdapter
                    }
                }
            }

            override fun onFailure(call: Call<ResponsePortalBerita>, t: Throwable) {
                Toast.makeText(applicationContext, t.localizedMessage, Toast.LENGTH_SHORT).show()
            }
        })
    }
}