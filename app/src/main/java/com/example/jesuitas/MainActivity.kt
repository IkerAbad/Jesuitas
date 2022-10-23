package com.example.jesuitas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.widget.ImageButton
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val megusta: ImageButton = findViewById(R.id.imageButton)
        megusta.setOnClickListener {
            val toast = Toast.makeText(this,R.string.like , Toast.LENGTH_SHORT)
            toast.show()

        }
    }
}