package com.example.stardewtracker

import android.os.Bundle
import android.widget.CheckBox
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.content.Context
import android.content.Intent
import android.widget.TextView
import android.net.Uri

class TrackerP : AppCompatActivity() {

    private lateinit var shiptick: CheckBox
    private lateinit var obelisktick: CheckBox
    private lateinit var goldenclocktick: CheckBox
    private lateinit var monstertick: CheckBox
    private lateinit var friendstick: CheckBox
    private lateinit var lvltick: CheckBox
    private lateinit var cookingtick: CheckBox
    private lateinit var craftingtick: CheckBox
    private lateinit var fishingtick: CheckBox
    private lateinit var walnuttick: CheckBox
    private lateinit var stardroptick: CheckBox

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tracker_p)

        val perfectionlink : TextView =findViewById(R.id.PerfectionTitle)
        perfectionlink.setOnClickListener {
            val url= "https://stardewvalleywiki.com/Perfection"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }


        shiptick = findViewById(R.id.ShipTick)
        obelisktick = findViewById(R.id.ObeliskTick)
        goldenclocktick = findViewById(R.id.GoldenClockTick)
        monstertick = findViewById(R.id.MonsterTick)
        friendstick = findViewById(R.id.FriendsTick)
        lvltick = findViewById(R.id.LvlTick)
        cookingtick = findViewById(R.id.CookingTick)
        craftingtick = findViewById(R.id.CraftingTick)
        fishingtick = findViewById(R.id.FishTick)
        walnuttick = findViewById(R.id.WalnutTick)
        stardroptick = findViewById(R.id.StardropTick)

        val sharedpref = getSharedPreferences("Perfectionsaved", Context.MODE_PRIVATE)
        shiptick.isChecked = sharedpref.getBoolean("shiptick_state", false)
        obelisktick.isChecked = sharedpref.getBoolean("obelisktick_state", false)
        goldenclocktick.isChecked = sharedpref.getBoolean("goldenclocktick_state", false)
        monstertick.isChecked = sharedpref.getBoolean("monstertick_state", false)
        friendstick.isChecked = sharedpref.getBoolean("friendstick_state", false)
        lvltick.isChecked = sharedpref.getBoolean("lvltick_state", false)
        cookingtick.isChecked = sharedpref.getBoolean("cookingtick_state", false)
        craftingtick.isChecked = sharedpref.getBoolean("craftingtick_state", false)
        fishingtick.isChecked = sharedpref.getBoolean("fishingtick_state", false)
        walnuttick.isChecked = sharedpref.getBoolean("walnuttick_state", false)
        stardroptick.isChecked = sharedpref.getBoolean("stardroptick_state", false)

        shiptick.setOnCheckedChangeListener { _, isChecked ->
            sharedpref.edit().putBoolean("shiptick_state", isChecked).apply()
        }

        obelisktick.setOnCheckedChangeListener { _, isChecked ->
            sharedpref.edit().putBoolean("obelisktick_state", isChecked).apply()
        }

        goldenclocktick.setOnCheckedChangeListener { _, isChecked ->
            sharedpref.edit().putBoolean("goldenclocktick_state", isChecked).apply()
        }

        monstertick.setOnCheckedChangeListener { _, isChecked ->
            sharedpref.edit().putBoolean("monstertick_state", isChecked).apply()
        }

        friendstick.setOnCheckedChangeListener { _, isChecked ->
            sharedpref.edit().putBoolean("friendstick_state", isChecked).apply()
        }

        lvltick.setOnCheckedChangeListener { _, isChecked ->
            sharedpref.edit().putBoolean("lvltick_state", isChecked).apply()
        }

        cookingtick.setOnCheckedChangeListener { _, isChecked ->
            sharedpref.edit().putBoolean("cookingtick_state", isChecked).apply()
        }

        craftingtick.setOnCheckedChangeListener { _, isChecked ->
            sharedpref.edit().putBoolean("craftingtick_state", isChecked).apply()
        }

        fishingtick.setOnCheckedChangeListener { _, isChecked ->
            sharedpref.edit().putBoolean("fishingtick_state", isChecked).apply()
        }

        walnuttick.setOnCheckedChangeListener { _, isChecked ->
            sharedpref.edit().putBoolean("walnuttick_state", isChecked).apply()
        }

        stardroptick.setOnCheckedChangeListener { _, isChecked ->
            sharedpref.edit().putBoolean("stardroptick_state", isChecked).apply()
        }

    }
}