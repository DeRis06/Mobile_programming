package com.denis.portalberita

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class register : AppCompatActivity() {
    private lateinit var buttonButton: Button
    private lateinit var textView: TextView

    private fun initComponents(){
        buttonButton =findViewById(R.id.Buton)
        textView =findViewById(R.id.logindisini)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.register)

        initComponents()
        val ButtonClick = buttonButton
        val loginClick = textView

        ButtonClick.setOnClickListener{
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
        loginClick.setOnClickListener{
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}