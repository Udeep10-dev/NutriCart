package com.example.nutricart

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class CartScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_cart_screen)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val button4 = findViewById<Button>(R.id.button6)
        button4.setOnClickListener {
            // On button click, start the PaymentScreen1 activity
            val intent1 = Intent(this, PaymentScreen1::class.java)
            startActivity(intent1)
        }

        var imageButton_x = findViewById<ImageButton>(R.id.imageView3)
        imageButton_x.setOnClickListener {
            val intent1 = Intent(this, HomeScreen::class.java)
            startActivity(intent1)
        }
    }
}