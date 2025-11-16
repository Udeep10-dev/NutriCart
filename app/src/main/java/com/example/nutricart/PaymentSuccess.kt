package com.example.nutricart

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class PaymentSuccess : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment_success)

        var imageButton1 = findViewById<ImageButton>(R.id.imageView3)
        imageButton1.setOnClickListener {
            val intent1 = Intent(this, HomeScreen::class.java)
            startActivity(intent1)
        }
    }
}