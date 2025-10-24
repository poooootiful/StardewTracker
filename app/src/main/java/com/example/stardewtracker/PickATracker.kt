package com.example.stardewtracker

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class PickATracker : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_pick_atracker)

        val perfectionload : Button = findViewById(R.id.Perfection)

        perfectionload.setOnClickListener {
            perfectiontracker()
        }
    }
    private fun perfectiontracker () {
        val intent = Intent (this, TrackerP::class.java )
        startActivity(intent)
    }

}
