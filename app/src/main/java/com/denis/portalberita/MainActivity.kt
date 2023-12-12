package com.denis.portalberita

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var buttonButton: Button
    private lateinit var textView: TextView

    private fun initComponents(){
        buttonButton =findViewById(R.id.Buton)
        textView =findViewById(R.id.daftardisini)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initComponents()
        val ButtonClick = buttonButton
        val RegisterClick = textView

        ButtonClick.setOnClickListener{
            val intent = Intent(this,beranda_user::class.java)
            startActivity(intent)
        }
        RegisterClick.setOnClickListener{
            val intent = Intent(this,register::class.java)
            startActivity(intent)
        }
    }
}