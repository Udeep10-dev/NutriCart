package com.example.nutricart

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Onboarding_Screen_2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding_screen2)


        val buttonNext = findViewById<Button>(R.id.button2)
        val buttonSkip = findViewById<Button>(R.id.button)

        buttonNext.setOnClickListener {
            // Proceed to next onboarding screen
            val intent = Intent(this, Onboarding_Screen_3::class.java)
            startActivity(intent)
        }

        buttonSkip.setOnClickListener {
            // Skip to main activity or final screen
            val intent = Intent(this, Onboarding_Screen_3::class.java)
            startActivity(intent)
        }
    }
}