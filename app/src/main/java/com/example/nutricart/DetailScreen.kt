package com.example.nutricart

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class DetailScreen : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_screen)


        val button4 = findViewById<Button>(R.id.button4)
        button4.setOnClickListener {
            // On button click, start the PaymentScreen1 activity
            val intent1 = Intent(this, CartScreen::class.java)
            startActivity(intent1)
        }

        var imageButton_x = findViewById<ImageButton>(R.id.imageView2)
        imageButton_x.setOnClickListener {
            val intent1 = Intent(this, HomeScreen::class.java)
            startActivity(intent1)
        }
    }
}
