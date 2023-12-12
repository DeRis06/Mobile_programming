package com.denis.portalberita

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class Beranda_reporter : AppCompatActivity() {
    private lateinit var imageView: ImageView
    private lateinit var imageView2: ImageView

    private fun initComponents(){
        imageView =findViewById(R.id.imageView6)
        imageView2 =findViewById(R.id.imageView8)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.beranda_reporter)

        initComponents()
        val ImageClick = imageView

        ImageClick.setOnClickListener{
            val intent = Intent(this,buat_berita::class.java)
            startActivity(intent)
        }
    }
}