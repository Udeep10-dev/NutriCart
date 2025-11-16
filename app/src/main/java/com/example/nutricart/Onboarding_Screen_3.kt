package com.example.nutricart

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Onboarding_Screen_3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContentView(R.layout.activity_onboarding_screen3)

        // Find the Button by ID
        val button3 = findViewById<Button>(R.id.button3)

        // Set the OnClickListener for the Button
        button3.setOnClickListener {

            val intent1 = Intent(this, Signup_Screen::class.java)
            startActivity(intent1)
        }
    }
}
