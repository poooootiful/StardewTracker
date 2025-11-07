package com.example.stardewtracker

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class PickATracker : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_pick_atracker)

        val perfectionLoad : Button = findViewById(R.id.Perfection)

        perfectionLoad.setOnClickListener {
            perfectionTracker()
        }

        val communityLoad : Button = findViewById(R.id.Community)

        communityLoad.setOnClickListener {
            communityTracker()
        }

        val remixedcommunityLoad : Button = findViewById(R.id.communityremixed)

        remixedcommunityLoad.setOnClickListener {
            remixedCommunityTracker()
        }

    }
    private fun perfectionTracker () {
        val intent = Intent (this, TrackerP::class.java )
        startActivity(intent)
    }

    private fun communityTracker () {
        val intent = Intent (this, TrackerCommunity::class.java )
        startActivity(intent)
    }

    private fun remixedCommunityTracker () {
        val intent = Intent (this, TrackerRemixed::class.java )
        startActivity(intent)
    }

}
