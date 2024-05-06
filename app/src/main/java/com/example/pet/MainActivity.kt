package com.example.pet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Welcomebtn = findViewById<Button>(R.id.Welcomebtn)
        val dogSitting = findViewById<ImageView>(R.id.dogSitting)


        Welcomebtn.setOnClickListener {
            val Intent = Intent(this,SecondScreen2::class.java)
            startActivity(Intent)
        }
    }
}