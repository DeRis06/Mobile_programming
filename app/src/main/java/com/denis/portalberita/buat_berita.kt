package com.denis.portalberita

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class buat_berita : AppCompatActivity() {
    private lateinit var buttonButton: Button

    private fun initComponents(){
        buttonButton =findViewById(R.id.button)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.laman_buat_berita)

        initComponents()
        val ButtonClick = buttonButton

        ButtonClick.setOnClickListener{
            val intent = Intent(this,Beranda_reporter::class.java)
            startActivity(intent)
        }
    }
}