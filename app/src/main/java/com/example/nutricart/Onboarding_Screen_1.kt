package com.example.nutricart

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Onboarding_Screen_1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding_screen1)


        val button2 = findViewById<Button>(R.id.button2)
        button2.setOnClickListener {
            // Start Onboarding_Screen_2 activity
            val intent1 = Intent(this, Onboarding_Screen_2::class.java)
            startActivity(intent1)
        }

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            // Start Onboarding_Screen_3 activity
            val intent2 = Intent(this, Onboarding_Screen_3::class.java)
            startActivity(intent2)
        }
    }
}
