package com.example.lab_1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editTextName: EditText = findViewById(R.id.editTextText)
        val editTextCategory: EditText = findViewById(R.id.editTextText2)
        val editTextLocation: EditText = findViewById(R.id.editTextText3)
        val buttonSubmit: Button = findViewById(R.id.button)

        buttonSubmit.setOnClickListener {
            val name = editTextName.text.toString()
            val category = editTextCategory.text.toString()
            val location = editTextLocation.text.toString()

            if (name.isBlank() || category.isBlank() || location.isBlank()) {
                Toast.makeText(this, "Please fill in all fields", Toast.LENGTH_SHORT).show()
            } else {
                val intent = Intent(this, ResultActivity::class.java).apply {
                    putExtra("name", name)
                    putExtra("category", category)
                    putExtra("location", location)
                }
                startActivity(intent)
            }
        }
    }
}
