package com.example.nutricart

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class PaymentScreen1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment_screen1)

        val paymentButton = findViewById<Button>(R.id.button7)
        paymentButton.setOnClickListener {
            val intent = Intent(this, PaymentSuccess::class.java)
            startActivity(intent)
        }

        var imageButton_x = findViewById<ImageButton>(R.id.imageView3)
        imageButton_x.setOnClickListener {
            val intent1 = Intent(this, HomeScreen::class.java)
            startActivity(intent1)
        }
    }
}