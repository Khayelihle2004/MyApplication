package com.example.myapplication


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView

class DetailedViewActivity : AppCompatActivity() {

    private lateinit var detailedInfo: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detailed_view)

        detailedInfo = findViewById(R.id.detailed_info)
        // Add code here to display the detailed information and calculate average screen time
    }
}
