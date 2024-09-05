package com.example.ntwalomap


import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Delay for 5 seconds
        Handler(Looper.getMainLooper()).postDelayed({
            // Start the main activity
            val intent = Intent(this, Map::class.java)
            startActivity(intent)
            // Close the splash screen activity
            finish()
        }, 5000) // 5000 milliseconds = 5 seconds
    }
}