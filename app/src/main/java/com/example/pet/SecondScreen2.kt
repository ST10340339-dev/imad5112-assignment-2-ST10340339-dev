package com.example.pet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class SecondScreen2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_screen2)

        val Feedbtn = findViewById<Button>(R.id.Feedbtn)
        val Cleanbtn = findViewById<Button>(R.id.Cleanbtn)
        val Playbtn = findViewById<Button>(R.id.Playbtn)

        val hungertext = findViewById<TextView>(R.id.Feedbtn)
        val cleantext = findViewById<TextView>(R.id.Cleanbtn)
        val playtext = findViewById<TextView>(R.id.Playbtn)

        var hungercount = 0
        var cleancount = 0
        var playcount = 0


        val dog_sitting2 = findViewById<ImageView>(R.id.dog_sitting2)

        Feedbtn.setOnClickListener {
            dog_sitting2.setImageResource(R.drawable.feed_dog)
            if (hungertext != 100) {
                hungercount++
            }

            hungertext.text = hungercount.toString()
            cleantext.text = cleancount.toString()
            playtext.text = playcount.toString()
        }
        Cleanbtn.setOnClickListener {
            dog_sitting2.setImageResource(R.drawable.clean_dog)
            if (cleantext != 100) {
                hungercount++
            }
            hungertext.text = hungercount.toString()
            cleantext.text = cleancount.toString()
            playtext.text = playcount.toString()
        }
        Playbtn.setOnClickListener {
            dog_sitting2.setImageResource(R.drawable.happy_dog)
            if (playtext != 100) {
                hungercount++
            }
            hungertext.text = hungercount.toString()
            cleantext.text = cleancount.toString()
            playtext.text = playcount.toString()
        }


    }
}