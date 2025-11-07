package com.example.stardewtracker

import android.os.Bundle
import android.widget.CheckBox
import androidx.appcompat.app.AppCompatActivity
import android.content.Context
import android.content.Intent
import android.widget.TextView
import android.net.Uri

class TrackerP : AppCompatActivity() {

    private lateinit var shipTick: CheckBox
    private lateinit var obeliskTick: CheckBox
    private lateinit var goldenClockTick: CheckBox
    private lateinit var monsterTick: CheckBox
    private lateinit var friendsTick: CheckBox
    private lateinit var lvlTick: CheckBox
    private lateinit var cookingTick: CheckBox
    private lateinit var craftingTick: CheckBox
    private lateinit var fishingTick: CheckBox
    private lateinit var walnutTick: CheckBox
    private lateinit var starDropTick: CheckBox

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tracker_p)

        val perfectionLink: TextView = findViewById(R.id.PerfectionTitle)
        perfectionLink.setOnClickListener {
            val url = "https://stardewvalleywiki.com/Perfection"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }

        shipTick = findViewById(R.id.ShipTick)
        obeliskTick = findViewById(R.id.ObeliskTick)
        goldenClockTick = findViewById(R.id.GoldenClockTick)
        monsterTick = findViewById(R.id.MonsterTick)
        friendsTick = findViewById(R.id.FriendsTick)
        lvlTick = findViewById(R.id.LvlTick)
        cookingTick = findViewById(R.id.CookingTick)
        craftingTick = findViewById(R.id.CraftingTick)
        fishingTick = findViewById(R.id.FishTick)
        walnutTick = findViewById(R.id.WalnutTick)
        starDropTick = findViewById(R.id.StardropTick)

        val sharedPref = getSharedPreferences("PerfectionSaved", Context.MODE_PRIVATE)
        shipTick.isChecked = sharedPref.getBoolean("shipTick_state", false)
        obeliskTick.isChecked = sharedPref.getBoolean("obeliskTick_state", false)
        goldenClockTick.isChecked = sharedPref.getBoolean("goldenClockTick_state", false)
        monsterTick.isChecked = sharedPref.getBoolean("monsterTick_state", false)
        friendsTick.isChecked = sharedPref.getBoolean("friendsTick_state", false)
        lvlTick.isChecked = sharedPref.getBoolean("lvlTick_state", false)
        cookingTick.isChecked = sharedPref.getBoolean("cookingTick_state", false)
        craftingTick.isChecked = sharedPref.getBoolean("craftingTick_state", false)
        fishingTick.isChecked = sharedPref.getBoolean("fishingTick_state", false)
        walnutTick.isChecked = sharedPref.getBoolean("walnutTick_state", false)
        starDropTick.isChecked = sharedPref.getBoolean("starDropTick_state", false)

        shipTick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("shipTick_state", isChecked).apply()
        }

        obeliskTick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("obeliskTick_state", isChecked).apply()
        }

        goldenClockTick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("goldenClockTick_state", isChecked).apply()
        }

        monsterTick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("monsterTick_state", isChecked).apply()
        }

        friendsTick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("friendsTick_state", isChecked).apply()
        }

        lvlTick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("lvlTick_state", isChecked).apply()
        }

        cookingTick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("cookingTick_state", isChecked).apply()
        }

        craftingTick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("craftingTick_state", isChecked).apply()
        }

        fishingTick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("fishingTick_state", isChecked).apply()
        }

        walnutTick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("walnutTick_state", isChecked).apply()
        }

        starDropTick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("starDropTick_state", isChecked).apply()
        }
    }
}
