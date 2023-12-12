package com.denis.portalberita

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class beranda_user : AppCompatActivity() {

    private lateinit var ImageView: ImageView
    private lateinit var ImageView2: ImageView
    private lateinit var TextView: TextView
    private lateinit var Textview2: TextView
    private lateinit var TextView3: TextView
    private lateinit var TextView4: TextView

    private fun initComponents(){
        ImageView =findViewById(R.id.imageView7)
        ImageView2 =findViewById(R.id.imageView5)
        TextView = findViewById(R.id.textView3)
        Textview2 = findViewById(R.id.textView4)
        TextView3 =findViewById(R.id.textView5)
        TextView4 =findViewById(R.id.textView6)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.beranda)

        initComponents()
        val imageClick = ImageView
        val imageClick2 = ImageView2
        val textClick = TextView
        val textClick2 = Textview2
        val textClick3 = TextView3
        val textClick4 = TextView4

        imageClick.setOnClickListener{
            val intent = Intent(this,news_page::class.java)
            startActivity(intent)
        }
        imageClick2.setOnClickListener{
            val intent = Intent(this,news_page::class.java)
            startActivity(intent)
        }
        textClick.setOnClickListener{
            val intent = Intent(this,news_page::class.java)
            startActivity(intent)
        }
        textClick2.setOnClickListener{
            val intent = Intent(this,news_page::class.java)
            startActivity(intent)
        }
        textClick3.setOnClickListener{
            val intent = Intent(this,news_page::class.java)
            startActivity(intent)
        }
        textClick4.setOnClickListener{
            val intent = Intent(this,news_page::class.java)
            startActivity(intent)
        }
    }
}