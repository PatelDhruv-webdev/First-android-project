package com.example.lab_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ResultActivity : AppCompatActivity() {

    private lateinit var textViewResult: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        setContentView(R.layout.activity_result)
        super.onCreate(savedInstanceState)
        val category = intent.getStringExtra("category")
        val location = intent.getStringExtra("location")
        val name = intent.getStringExtra("name")
        textViewResult = findViewById(R.id.textViewResult)
        textViewResult.text = "$name is a $category generally found in $location"

    }
}
