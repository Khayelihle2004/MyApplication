package com.example.myapplication



import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navigateButton: Button = findViewById(R.id.button_navigate)
        val clearButton: Button = findViewById(R.id.button_clear)

        navigateButton.setOnClickListener {
            val intent = Intent(this@MainActivity, DetailedViewActivity::class.java)
            startActivity(intent)
        }

        clearButton.setOnClickListener {
            // Logic to clear the input data
        }
    }
}







