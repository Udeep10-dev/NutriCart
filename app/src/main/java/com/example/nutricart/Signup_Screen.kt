package com.example.nutricart

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Signup_Screen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup_screen)

        var button5 = findViewById<Button>(R.id.button5)
        button5.setOnClickListener {
            val intent1 = Intent(this, Login_Screen::class.java)
            startActivity(intent1)
        }
    }
}