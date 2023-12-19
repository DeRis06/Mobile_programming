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

class ekonomi2 : AppCompatActivity() {
    private lateinit var ImageView: ImageView

    private fun initComponents() {
        ImageView = findViewById(R.id.back)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ekonomi2)
        initComponents()
        val imageClick = ImageView

        imageClick.setOnClickListener {
            val intent = Intent(this, beranda_user::class.java)
            startActivity(intent)
        }
    }
}