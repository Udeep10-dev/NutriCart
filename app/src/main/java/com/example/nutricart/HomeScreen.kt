package com.example.nutricart

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class HomeScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContentView(R.layout.activity_home_screen)


        val imageButton1 = findViewById<ImageButton>(R.id.imageButton1)
        imageButton1.setOnClickListener {
            val intent1 = Intent(this, DetailScreen::class.java)
            startActivity(intent1)
        }

        val imageButton3 = findViewById<ImageButton>(R.id.imageButton2)
        imageButton3.setOnClickListener {
            val intent2 = Intent(this, DetailScreen::class.java)
            startActivity(intent2)
        }

        val imageButton4 = findViewById<ImageButton>(R.id.btnBeetroot1)
        imageButton4.setOnClickListener {
            val intent2 = Intent(this, DetailScreen::class.java)
            startActivity(intent2)
        }
        val imageButton5 = findViewById<ImageButton>(R.id.btnBringlas)
        imageButton5.setOnClickListener {
            val intent2 = Intent(this, DetailScreen::class.java)
            startActivity(intent2)
        }
        val imageButton6 = findViewById<ImageButton>(R.id.btnCabbage)
        imageButton6.setOnClickListener {
            val intent2 = Intent(this, DetailScreen::class.java)
            startActivity(intent2)
        }



    }
}
