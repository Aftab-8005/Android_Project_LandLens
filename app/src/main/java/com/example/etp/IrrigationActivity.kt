package com.example.etp

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class IrrigationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_irrigation)
        val backBtn = findViewById<Button>(R.id.backToDashboard)
        backBtn.setOnClickListener {
            finish() // Go back to Dashboard
        }
    }
}