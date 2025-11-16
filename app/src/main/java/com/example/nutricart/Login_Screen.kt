package com.example.nutricart

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Login_Screen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContentView(R.layout.activity_login_screen)


        val button5 = findViewById<Button>(R.id.button5)


        button5.setOnClickListener {

            val intent1 = Intent(this, HomeScreen::class.java)
            startActivity(intent1)
        }
    }
}
