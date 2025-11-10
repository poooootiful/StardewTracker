package com.example.stardewtracker

import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.CheckBox

class TrackerRemixed : AppCompatActivity() {

    private lateinit var WildHorseradishTick: CheckBox
    private lateinit var DaffodilTick: CheckBox
    private lateinit var LeekTick: CheckBox
    private lateinit var DandelionTick: CheckBox
    private lateinit var SpringOnionTick: CheckBox
    private lateinit var WinterRootTick: CheckBox
    private lateinit var CrystalFruitTick: CheckBox
    private lateinit var SnowYamTick: CheckBox
    private lateinit var CrocusTick: CheckBox
    private lateinit var HollyTick: CheckBox
    private lateinit var Sap500Tick: CheckBox
    private lateinit var Moss10Tick: CheckBox
    private lateinit var Fiber200Tick: CheckBox
    private lateinit var Acorn10Tick: CheckBox
    private lateinit var MapleSeed10Tick: CheckBox
    private lateinit var PurpleMushroom5Tick: CheckBox
    private lateinit var FiddleheadFern5Tick: CheckBox
    private lateinit var WhiteAlgae5Tick: CheckBox
    private lateinit var Hops5Tick: CheckBox
    private lateinit var TomatoTick: CheckBox
    private lateinit var HotPepperTick: CheckBox
    private lateinit var RemixedBlueberryTick: CheckBox
    private lateinit var MelonTick: CheckBox
    private lateinit var SummerSquashTick: CheckBox
    private lateinit var CornTick: CheckBox
    private lateinit var EggplantTick: CheckBox
    private lateinit var PumpkinTick: CheckBox
    private lateinit var YamTick: CheckBox
    private lateinit var BroccoliTick: CheckBox
    private lateinit var Parsnip5Tick: CheckBox
    private lateinit var GreenBean5Tick: CheckBox
    private lateinit var Potato5Tick: CheckBox
    private lateinit var Cauliflower5Tick: CheckBox
    private lateinit var Melon5Tick: CheckBox
    private lateinit var Blueberry5Tick: CheckBox
    private lateinit var HotPepper5Tick: CheckBox
    private lateinit var Pumpkin5Tick: CheckBox
    private lateinit var Yam5Tick: CheckBox
    private lateinit var Eggplant5Tick: CheckBox
    private lateinit var Corn5Tick: CheckBox
    private lateinit var AncientFruitTick: CheckBox
    private lateinit var SweetGemBerryTick: CheckBox
    private lateinit var RoeTick: CheckBox
    private lateinit var AgedRoeTick: CheckBox
    private lateinit var SquidInkTick: CheckBox
    private lateinit var TulipTick: CheckBox
    private lateinit var BlueJazzTick: CheckBox
    private lateinit var SummerTick: CheckBox
    private lateinit var RemixedSunflowerTick: CheckBox
    private lateinit var FairyRoseTick: CheckBox
    private lateinit var MeadTick: CheckBox
    private lateinit var PaleAleTick: CheckBox
    private lateinit var WineTick: CheckBox
    private lateinit var JuiceTick: CheckBox
    private lateinit var GreenTeaTick: CheckBox
    private lateinit var LargemouthBassTick: CheckBox
    private lateinit var ShadTick: CheckBox
    private lateinit var TunaTick: CheckBox
    private lateinit var WalleyeTick: CheckBox
    private lateinit var LavaEelTick: CheckBox
    private lateinit var ScorpionCarpTick: CheckBox
    private lateinit var OctopusTick: CheckBox
    private lateinit var BlobfishTick: CheckBox
    private lateinit var SlimeTick: CheckBox
    private lateinit var RemixedBatWingTick: CheckBox
    private lateinit var SolarEssenceTick: CheckBox
    private lateinit var VoidEssenceTick: CheckBox
    private lateinit var BoneFragmentTick: CheckBox
    private lateinit var AmethystTick: CheckBox
    private lateinit var RemixedAquamarineTick: CheckBox
    private lateinit var DiamondTick: CheckBox
    private lateinit var EmeraldTick: CheckBox
    private lateinit var RubyTick: CheckBox
    private lateinit var TopazTick: CheckBox
    private lateinit var IridiumOreTick: CheckBox
    private lateinit var BatteryPackTick: CheckBox
    private lateinit var RefinedQuartzTick: CheckBox
    private lateinit var RedMushroomTick: CheckBox
    private lateinit var BeetTick: CheckBox
    private lateinit var SeaUrchinTick: CheckBox
    private lateinit var AmaranthTick: CheckBox
    private lateinit var SunflowerTick: CheckBox
    private lateinit var StarfruitTick: CheckBox
    private lateinit var DuckFeatherTick: CheckBox
    private lateinit var CactusFruitTick: CheckBox
    private lateinit var AquamarineTick: CheckBox
    private lateinit var BlueberryTick: CheckBox
    private lateinit var RedCabbageTick: CheckBox
    private lateinit var IridiumBarTick: CheckBox
    private lateinit var Salmonberry10Tick: CheckBox
    private lateinit var CookieTick: CheckBox
    private lateinit var AncientDollTick: CheckBox
    private lateinit var IceCreamTick: CheckBox
    private lateinit var Salmonberry50Tick: CheckBox
    private lateinit var Blackberry50Tick: CheckBox
    private lateinit var WildPlum20Tick: CheckBox
    private lateinit var Egg10Tick: CheckBox
    private lateinit var Milk10Tick: CheckBox
    private lateinit var WheatFlour100Tick: CheckBox
    private lateinit var PrizeTicketTick: CheckBox
    private lateinit var MysteryBox5Tick: CheckBox
    private lateinit var JackOLanternTick: CheckBox
    private lateinit var Corn10Tick: CheckBox
    private lateinit var BatWing10Tick: CheckBox
    private lateinit var Holly5Tick: CheckBox
    private lateinit var PlumPuddingTick: CheckBox
    private lateinit var StuffingTick: CheckBox
    private lateinit var Powdermelon5Tick: CheckBox

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tracker_remixed)

        val sharedPref = getSharedPreferences("RemixedCommunitySaved", Context.MODE_PRIVATE)

        WildHorseradishTick = findViewById(R.id.RWildHorseradishTick)
        DaffodilTick = findViewById(R.id.RDaffodilTick)
        LeekTick = findViewById(R.id.RLeekTick)
        DandelionTick = findViewById(R.id.RDandelionTick)
        SpringOnionTick = findViewById(R.id.SpringOnionTick)
        WinterRootTick = findViewById(R.id.WinterRootTick)
        CrystalFruitTick = findViewById(R.id.CrystalFruitTick)
        SnowYamTick = findViewById(R.id.SnowYamTick)
        CrocusTick = findViewById(R.id.CrocusTick)
        HollyTick = findViewById(R.id.HollyTick)
        Sap500Tick = findViewById(R.id.Sap500Tick)
        Moss10Tick = findViewById(R.id.Moss10Tick)
        Fiber200Tick = findViewById(R.id.Fiber200Tick)
        Acorn10Tick = findViewById(R.id.Acorn10Tick)
        MapleSeed10Tick = findViewById(R.id.MapleSeed10Tick)
        PurpleMushroom5Tick = findViewById(R.id.PurpleMushroom5Tick)
        FiddleheadFern5Tick = findViewById(R.id.FiddleheadFern5Tick)
        WhiteAlgae5Tick = findViewById(R.id.WhiteAlgae5Tick)
        Hops5Tick = findViewById(R.id.Hops5Tick)
        TomatoTick = findViewById(R.id.TomatoTick)
        HotPepperTick = findViewById(R.id.HotPepperTick)
        RemixedBlueberryTick = findViewById(R.id.RemixedBlueberryTick)
        MelonTick = findViewById(R.id.MelonTick)
        SummerSquashTick = findViewById(R.id.SummerSquashTick)
        CornTick = findViewById(R.id.CornTick)
        EggplantTick = findViewById(R.id.EggplantTick)
        PumpkinTick = findViewById(R.id.PumpkinTick)
        YamTick = findViewById(R.id.YamTick)
        BroccoliTick = findViewById(R.id.BroccoliTick)
        Parsnip5Tick = findViewById(R.id.Parsnip5Tick)
        GreenBean5Tick = findViewById(R.id.GreenBean5Tick)
        Potato5Tick = findViewById(R.id.Potato5Tick)
        Cauliflower5Tick = findViewById(R.id.Cauliflower5Tick)
        Melon5Tick = findViewById(R.id.Melon5Tick)
        Blueberry5Tick = findViewById(R.id.Blueberry5Tick)
        HotPepper5Tick = findViewById(R.id.HotPepper5Tick)
        Pumpkin5Tick = findViewById(R.id.Pumpkin5Tick)
        Yam5Tick = findViewById(R.id.Yam5Tick)
        Eggplant5Tick = findViewById(R.id.Eggplant5Tick)
        Corn5Tick = findViewById(R.id.Corn5Tick)
        AncientFruitTick = findViewById(R.id.AncientFruitTick)
        SweetGemBerryTick = findViewById(R.id.SweetGemBerryTick)
        RoeTick = findViewById(R.id.RoeTick)
        AgedRoeTick = findViewById(R.id.AgedRoeTick)
        SquidInkTick = findViewById(R.id.SquidInkTick)
        TulipTick = findViewById(R.id.TulipTick)
        BlueJazzTick = findViewById(R.id.BlueJazzTick)
        SummerTick = findViewById(R.id.SummerTick)
        RemixedSunflowerTick = findViewById(R.id.RemixedSunflowerTick)
        FairyRoseTick = findViewById(R.id.FairyRoseTick)
        MeadTick = findViewById(R.id.MeadTick)
        PaleAleTick = findViewById(R.id.PaleAleTick)
        WineTick = findViewById(R.id.WineTick)
        JuiceTick = findViewById(R.id.JuiceTick)
        GreenTeaTick = findViewById(R.id.GreenTeaTick)
        LargemouthBassTick = findViewById(R.id.LargemouthBassTick)
        ShadTick = findViewById(R.id.ShadTick)
        TunaTick = findViewById(R.id.TunaTick)
        WalleyeTick = findViewById(R.id.WalleyeTick)
        LavaEelTick = findViewById(R.id.LavaEelTick)
        ScorpionCarpTick = findViewById(R.id.ScorpionCarpTick)
        OctopusTick = findViewById(R.id.OctopusTick)
        BlobfishTick = findViewById(R.id.BlobfishTick)
        SlimeTick = findViewById(R.id.SlimeTick)
        RemixedBatWingTick = findViewById(R.id.RemixedBatWingTick)
        SolarEssenceTick = findViewById(R.id.SolarEssenceTick)
        VoidEssenceTick = findViewById(R.id.VoidEssenceTick)
        BoneFragmentTick = findViewById(R.id.BoneFragmentTick)
        AmethystTick = findViewById(R.id.AmethystTick)
        RemixedAquamarineTick = findViewById(R.id.RemixedAquamarineTick)
        DiamondTick = findViewById(R.id.DiamondTick)
        EmeraldTick = findViewById(R.id.EmeraldTick)
        RubyTick = findViewById(R.id.RubyTick)
        TopazTick = findViewById(R.id.TopazTick)
        IridiumOreTick = findViewById(R.id.IridiumOreTick)
        BatteryPackTick = findViewById(R.id.BatteryPackTick)
        RefinedQuartzTick = findViewById(R.id.RefinedQuartzTick)
        RedMushroomTick = findViewById(R.id.RedMushroomTick)
        BeetTick = findViewById(R.id.BeetTick)
        SeaUrchinTick = findViewById(R.id.SeaUrchinTick)
        AmaranthTick = findViewById(R.id.AmaranthTick)
        SunflowerTick = findViewById(R.id.SunflowerTick)
        StarfruitTick = findViewById(R.id.StarfruitTick)
        DuckFeatherTick = findViewById(R.id.DuckFeatherTick)
        CactusFruitTick = findViewById(R.id.CactusFruitTick)
        AquamarineTick = findViewById(R.id.AquamarineTick)
        BlueberryTick = findViewById(R.id.BlueberryTick)
        RedCabbageTick = findViewById(R.id.RedCabbageTick)
        IridiumBarTick = findViewById(R.id.IridiumBarTick)
        Salmonberry10Tick = findViewById(R.id.Salmonberry10Tick)
        CookieTick = findViewById(R.id.CookieTick)
        AncientDollTick = findViewById(R.id.AncientDollTick)
        IceCreamTick = findViewById(R.id.IceCreamTick)
        Salmonberry50Tick = findViewById(R.id.Salmonberry50Tick)
        Blackberry50Tick = findViewById(R.id.Blackberry50Tick)
        WildPlum20Tick = findViewById(R.id.WildPlum20Tick)
        Egg10Tick = findViewById(R.id.Egg10Tick)
        Milk10Tick = findViewById(R.id.Milk10Tick)
        WheatFlour100Tick = findViewById(R.id.WheatFlour100Tick)
        PrizeTicketTick = findViewById(R.id.PrizeTicketTick)
        MysteryBox5Tick = findViewById(R.id.MysteryBox5Tick)
        JackOLanternTick = findViewById(R.id.JackOLanternTick)
        Corn10Tick = findViewById(R.id.Corn10Tick)
        BatWing10Tick = findViewById(R.id.BatWing10Tick)
        Holly5Tick = findViewById(R.id.Holly5Tick)
        PlumPuddingTick = findViewById(R.id.PlumPuddingTick)
        StuffingTick = findViewById(R.id.StuffingTick)
        Powdermelon5Tick = findViewById(R.id.Powdermelon5Tick)

        WildHorseradishTick.isChecked = sharedPref.getBoolean("WildHorseradishTick_state", false)
        DaffodilTick.isChecked = sharedPref.getBoolean("DaffodilTick_state", false)
        LeekTick.isChecked = sharedPref.getBoolean("LeekTick_state", false)
        DandelionTick.isChecked = sharedPref.getBoolean("DandelionTick_state", false)
        SpringOnionTick.isChecked = sharedPref.getBoolean("SpringOnionTick_state", false)
        WinterRootTick.isChecked = sharedPref.getBoolean("WinterRootTick_state", false)
        CrystalFruitTick.isChecked = sharedPref.getBoolean("CrystalFruitTick_state", false)
        SnowYamTick.isChecked = sharedPref.getBoolean("SnowYamTick_state", false)
        CrocusTick.isChecked = sharedPref.getBoolean("CrocusTick_state", false)
        HollyTick.isChecked = sharedPref.getBoolean("HollyTick_state", false)
        Sap500Tick.isChecked = sharedPref.getBoolean("Sap500Tick_state", false)
        Moss10Tick.isChecked = sharedPref.getBoolean("Moss10Tick_state", false)
        Fiber200Tick.isChecked = sharedPref.getBoolean("Fiber200Tick_state", false)
        Acorn10Tick.isChecked = sharedPref.getBoolean("Acorn10Tick_state", false)
        MapleSeed10Tick.isChecked = sharedPref.getBoolean("MapleSeed10Tick_state", false)
        PurpleMushroom5Tick.isChecked = sharedPref.getBoolean("PurpleMushroom5Tick_state", false)
        FiddleheadFern5Tick.isChecked = sharedPref.getBoolean("FiddleheadFern5Tick_state", false)
        WhiteAlgae5Tick.isChecked = sharedPref.getBoolean("WhiteAlgae5Tick_state", false)
        Hops5Tick.isChecked = sharedPref.getBoolean("Hops5Tick_state", false)
        TomatoTick.isChecked = sharedPref.getBoolean("TomatoTick_state", false)
        HotPepperTick.isChecked = sharedPref.getBoolean("HotPepperTick_state", false)
        RemixedBlueberryTick.isChecked = sharedPref.getBoolean("RemixedBlueberryTick_state", false)
        MelonTick.isChecked = sharedPref.getBoolean("MelonTick_state", false)
        SummerSquashTick.isChecked = sharedPref.getBoolean("SummerSquashTick_state", false)
        CornTick.isChecked = sharedPref.getBoolean("CornTick_state", false)
        EggplantTick.isChecked = sharedPref.getBoolean("EggplantTick_state", false)
        PumpkinTick.isChecked = sharedPref.getBoolean("PumpkinTick_state", false)
        YamTick.isChecked = sharedPref.getBoolean("YamTick_state", false)
        BroccoliTick.isChecked = sharedPref.getBoolean("BroccoliTick_state", false)
        Parsnip5Tick.isChecked = sharedPref.getBoolean("Parsnip5Tick_state", false)
        GreenBean5Tick.isChecked = sharedPref.getBoolean("GreenBean5Tick_state", false)
        Potato5Tick.isChecked = sharedPref.getBoolean("Potato5Tick_state", false)
        Cauliflower5Tick.isChecked = sharedPref.getBoolean("Cauliflower5Tick_state", false)
        Melon5Tick.isChecked = sharedPref.getBoolean("Melon5Tick_state", false)
        Blueberry5Tick.isChecked = sharedPref.getBoolean("Blueberry5Tick_state", false)
        HotPepper5Tick.isChecked = sharedPref.getBoolean("HotPepper5Tick_state", false)
        Pumpkin5Tick.isChecked = sharedPref.getBoolean("Pumpkin5Tick_state", false)
        Yam5Tick.isChecked = sharedPref.getBoolean("Yam5Tick_state", false)
        Eggplant5Tick.isChecked = sharedPref.getBoolean("Eggplant5Tick_state", false)
        Corn5Tick.isChecked = sharedPref.getBoolean("Corn5Tick_state", false)
        AncientFruitTick.isChecked = sharedPref.getBoolean("AncientFruitTick_state", false)
        SweetGemBerryTick.isChecked = sharedPref.getBoolean("SweetGemBerryTick_state", false)
        RoeTick.isChecked = sharedPref.getBoolean("RoeTick_state", false)
        AgedRoeTick.isChecked = sharedPref.getBoolean("AgedRoeTick_state", false)
        SquidInkTick.isChecked = sharedPref.getBoolean("SquidInkTick_state", false)
        TulipTick.isChecked = sharedPref.getBoolean("TulipTick_state", false)
        BlueJazzTick.isChecked = sharedPref.getBoolean("BlueJazzTick_state", false)
        SummerTick.isChecked = sharedPref.getBoolean("SummerTick_state", false)
        RemixedSunflowerTick.isChecked = sharedPref.getBoolean("RemixedSunflowerTick_state", false)
        FairyRoseTick.isChecked = sharedPref.getBoolean("FairyRoseTick_state", false)
        MeadTick.isChecked = sharedPref.getBoolean("MeadTick_state", false)
        PaleAleTick.isChecked = sharedPref.getBoolean("PaleAleTick_state", false)
        WineTick.isChecked = sharedPref.getBoolean("WineTick_state", false)
        JuiceTick.isChecked = sharedPref.getBoolean("JuiceTick_state", false)
        GreenTeaTick.isChecked = sharedPref.getBoolean("GreenTeaTick_state", false)
        LargemouthBassTick.isChecked = sharedPref.getBoolean("LargemouthBassTick_state", false)
        ShadTick.isChecked = sharedPref.getBoolean("ShadTick_state", false)
        TunaTick.isChecked = sharedPref.getBoolean("TunaTick_state", false)
        WalleyeTick.isChecked = sharedPref.getBoolean("WalleyeTick_state", false)
        LavaEelTick.isChecked = sharedPref.getBoolean("LavaEelTick_state", false)
        ScorpionCarpTick.isChecked = sharedPref.getBoolean("ScorpionCarpTick_state", false)
        OctopusTick.isChecked = sharedPref.getBoolean("OctopusTick_state", false)
        BlobfishTick.isChecked = sharedPref.getBoolean("BlobfishTick_state", false)
        SlimeTick.isChecked = sharedPref.getBoolean("SlimeTick_state", false)
        RemixedBatWingTick.isChecked = sharedPref.getBoolean("RemixedBatWingTick_state", false)
        SolarEssenceTick.isChecked = sharedPref.getBoolean("SolarEssenceTick_state", false)
        VoidEssenceTick.isChecked = sharedPref.getBoolean("VoidEssenceTick_state", false)
        BoneFragmentTick.isChecked = sharedPref.getBoolean("BoneFragmentTick_state", false)
        AmethystTick.isChecked = sharedPref.getBoolean("AmethystTick_state", false)
        RemixedAquamarineTick.isChecked = sharedPref.getBoolean("RemixedAquamarineTick_state", false)
        DiamondTick.isChecked = sharedPref.getBoolean("DiamondTick_state", false)
        EmeraldTick.isChecked = sharedPref.getBoolean("EmeraldTick_state", false)
        RubyTick.isChecked = sharedPref.getBoolean("RubyTick_state", false)
        TopazTick.isChecked = sharedPref.getBoolean("TopazTick_state", false)
        IridiumOreTick.isChecked = sharedPref.getBoolean("IridiumOreTick_state", false)
        BatteryPackTick.isChecked = sharedPref.getBoolean("BatteryPackTick_state", false)
        RefinedQuartzTick.isChecked = sharedPref.getBoolean("RefinedQuartzTick_state", false)
        RedMushroomTick.isChecked = sharedPref.getBoolean("RedMushroomTick_state", false)
        BeetTick.isChecked = sharedPref.getBoolean("BeetTick_state", false)
        SeaUrchinTick.isChecked = sharedPref.getBoolean("SeaUrchinTick_state", false)
        AmaranthTick.isChecked = sharedPref.getBoolean("AmaranthTick_state", false)
        SunflowerTick.isChecked = sharedPref.getBoolean("SunflowerTick_state", false)
        StarfruitTick.isChecked = sharedPref.getBoolean("StarfruitTick_state", false)
        DuckFeatherTick.isChecked = sharedPref.getBoolean("DuckFeatherTick_state", false)
        CactusFruitTick.isChecked = sharedPref.getBoolean("CactusFruitTick_state", false)
        AquamarineTick.isChecked = sharedPref.getBoolean("AquamarineTick_state", false)
        BlueberryTick.isChecked = sharedPref.getBoolean("BlueberryTick_state", false)
        RedCabbageTick.isChecked = sharedPref.getBoolean("RedCabbageTick_state", false)
        IridiumBarTick.isChecked = sharedPref.getBoolean("IridiumBarTick_state", false)
        Salmonberry10Tick.isChecked = sharedPref.getBoolean("Salmonberry10Tick_state", false)
        CookieTick.isChecked = sharedPref.getBoolean("CookieTick_state", false)
        AncientDollTick.isChecked = sharedPref.getBoolean("AncientDollTick_state", false)
        IceCreamTick.isChecked = sharedPref.getBoolean("IceCreamTick_state", false)
        Salmonberry50Tick.isChecked = sharedPref.getBoolean("Salmonberry50Tick_state", false)
        Blackberry50Tick.isChecked = sharedPref.getBoolean("Blackberry50Tick_state", false)
        WildPlum20Tick.isChecked = sharedPref.getBoolean("WildPlum20Tick_state", false)
        Egg10Tick.isChecked = sharedPref.getBoolean("Egg10Tick_state", false)
        Milk10Tick.isChecked = sharedPref.getBoolean("Milk10Tick_state", false)
        WheatFlour100Tick.isChecked = sharedPref.getBoolean("WheatFlour100Tick_state", false)
        PrizeTicketTick.isChecked = sharedPref.getBoolean("PrizeTicketTick_state", false)
        MysteryBox5Tick.isChecked = sharedPref.getBoolean("MysteryBox5Tick_state", false)
        JackOLanternTick.isChecked = sharedPref.getBoolean("JackOLanternTick_state", false)
        Corn10Tick.isChecked = sharedPref.getBoolean("Corn10Tick_state", false)
        BatWing10Tick.isChecked = sharedPref.getBoolean("BatWing10Tick_state", false)
        Holly5Tick.isChecked = sharedPref.getBoolean("Holly5Tick_state", false)
        PlumPuddingTick.isChecked = sharedPref.getBoolean("PlumPuddingTick_state", false)
        StuffingTick.isChecked = sharedPref.getBoolean("StuffingTick_state", false)
        Powdermelon5Tick.isChecked = sharedPref.getBoolean("Powdermelon5Tick_state", false)

        WildHorseradishTick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("WildHorseradishTick_state", isChecked).apply()
        }
        DaffodilTick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("DaffodilTick_state", isChecked).apply()
        }
        LeekTick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("LeekTick_state", isChecked).apply()
        }
        DandelionTick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("DandelionTick_state", isChecked).apply()
        }
        SpringOnionTick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("SpringOnionTick_state", isChecked).apply()
        }
        WinterRootTick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("WinterRootTick_state", isChecked).apply()
        }
        CrystalFruitTick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("CrystalFruitTick_state", isChecked).apply()
        }
        SnowYamTick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("SnowYamTick_state", isChecked).apply()
        }
        CrocusTick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("CrocusTick_state", isChecked).apply()
        }
        HollyTick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("HollyTick_state", isChecked).apply()
        }
        Sap500Tick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("Sap500Tick_state", isChecked).apply()
        }
        Moss10Tick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("Moss10Tick_state", isChecked).apply()
        }
        Fiber200Tick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("Fiber200Tick_state", isChecked).apply()
        }
        Acorn10Tick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("Acorn10Tick_state", isChecked).apply()
        }
        MapleSeed10Tick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("MapleSeed10Tick_state", isChecked).apply()
        }
        PurpleMushroom5Tick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("PurpleMushroom5Tick_state", isChecked).apply()
        }
        FiddleheadFern5Tick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("FiddleheadFern5Tick_state", isChecked).apply()
        }
        WhiteAlgae5Tick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("WhiteAlgae5Tick_state", isChecked).apply()
        }
        Hops5Tick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("Hops5Tick_state", isChecked).apply()
        }
        TomatoTick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("TomatoTick_state", isChecked).apply()
        }
        HotPepperTick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("HotPepperTick_state", isChecked).apply()
        }
        RemixedBlueberryTick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("RemixedBlueberryTick_state", isChecked).apply()
        }
        MelonTick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("MelonTick_state", isChecked).apply()
        }
        SummerSquashTick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("SummerSquashTick_state", isChecked).apply()
        }
        CornTick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("CornTick_state", isChecked).apply()
        }
        EggplantTick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("EggplantTick_state", isChecked).apply()
        }
        PumpkinTick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("PumpkinTick_state", isChecked).apply()
        }
        YamTick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("YamTick_state", isChecked).apply()
        }
        BroccoliTick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("BroccoliTick_state", isChecked).apply()
        }
        Parsnip5Tick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("Parsnip5Tick_state", isChecked).apply()
        }
        GreenBean5Tick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("GreenBean5Tick_state", isChecked).apply()
        }
        Potato5Tick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("Potato5Tick_state", isChecked).apply()
        }
        Cauliflower5Tick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("Cauliflower5Tick_state", isChecked).apply()
        }
        Melon5Tick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("Melon5Tick_state", isChecked).apply()
        }
        Blueberry5Tick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("Blueberry5Tick_state", isChecked).apply()
        }
        HotPepper5Tick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("HotPepper5Tick_state", isChecked).apply()
        }
        Pumpkin5Tick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("Pumpkin5Tick_state", isChecked).apply()
        }
        Yam5Tick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("Yam5Tick_state", isChecked).apply()
        }
        Eggplant5Tick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("Eggplant5Tick_state", isChecked).apply()
        }
        Corn5Tick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("Corn5Tick_state", isChecked).apply()
        }
        AncientFruitTick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("AncientFruitTick_state", isChecked).apply()
        }
        SweetGemBerryTick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("SweetGemBerryTick_state", isChecked).apply()
        }
        RoeTick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("RoeTick_state", isChecked).apply()
        }

        AgedRoeTick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("AgedRoeTick_state", isChecked).apply()
        }

        SquidInkTick.setOnCheckedChangeListener { _, isChecked -> sharedPref.edit().putBoolean("SquidInkTick_state", isChecked).apply() }
        TulipTick.setOnCheckedChangeListener { _, isChecked -> sharedPref.edit().putBoolean("TulipTick_state", isChecked).apply() }
        BlueJazzTick.setOnCheckedChangeListener { _, isChecked -> sharedPref.edit().putBoolean("BlueJazzTick_state", isChecked).apply() }
        SummerTick.setOnCheckedChangeListener { _, isChecked -> sharedPref.edit().putBoolean("SummerTick_state", isChecked).apply() }
        RemixedSunflowerTick.setOnCheckedChangeListener { _, isChecked -> sharedPref.edit().putBoolean("RemixedSunflowerTick_state", isChecked).apply() }
        FairyRoseTick.setOnCheckedChangeListener { _, isChecked -> sharedPref.edit().putBoolean("FairyRoseTick_state", isChecked).apply() }
        MeadTick.setOnCheckedChangeListener { _, isChecked -> sharedPref.edit().putBoolean("MeadTick_state", isChecked).apply() }
        PaleAleTick.setOnCheckedChangeListener { _, isChecked -> sharedPref.edit().putBoolean("PaleAleTick_state", isChecked).apply() }
        WineTick.setOnCheckedChangeListener { _, isChecked -> sharedPref.edit().putBoolean("WineTick_state", isChecked).apply() }
        JuiceTick.setOnCheckedChangeListener { _, isChecked -> sharedPref.edit().putBoolean("JuiceTick_state", isChecked).apply() }
        GreenTeaTick.setOnCheckedChangeListener { _, isChecked -> sharedPref.edit().putBoolean("GreenTeaTick_state", isChecked).apply() }
        LargemouthBassTick.setOnCheckedChangeListener { _, isChecked -> sharedPref.edit().putBoolean("LargemouthBassTick_state", isChecked).apply() }
        ShadTick.setOnCheckedChangeListener { _, isChecked -> sharedPref.edit().putBoolean("ShadTick_state", isChecked).apply() }
        TunaTick.setOnCheckedChangeListener { _, isChecked -> sharedPref.edit().putBoolean("TunaTick_state", isChecked).apply() }
        WalleyeTick.setOnCheckedChangeListener { _, isChecked -> sharedPref.edit().putBoolean("WalleyeTick_state", isChecked).apply() }
        LavaEelTick.setOnCheckedChangeListener { _, isChecked -> sharedPref.edit().putBoolean("LavaEelTick_state", isChecked).apply() }
        ScorpionCarpTick.setOnCheckedChangeListener { _, isChecked -> sharedPref.edit().putBoolean("ScorpionCarpTick_state", isChecked).apply() }
        OctopusTick.setOnCheckedChangeListener { _, isChecked -> sharedPref.edit().putBoolean("OctopusTick_state", isChecked).apply() }
        BlobfishTick.setOnCheckedChangeListener { _, isChecked -> sharedPref.edit().putBoolean("BlobfishTick_state", isChecked).apply() }
        SlimeTick.setOnCheckedChangeListener { _, isChecked -> sharedPref.edit().putBoolean("SlimeTick_state", isChecked).apply() }
        RemixedBatWingTick.setOnCheckedChangeListener { _, isChecked -> sharedPref.edit().putBoolean("RemixedBatWingTick_state", isChecked).apply() }
        SolarEssenceTick.setOnCheckedChangeListener { _, isChecked -> sharedPref.edit().putBoolean("SolarEssenceTick_state", isChecked).apply() }
        VoidEssenceTick.setOnCheckedChangeListener { _, isChecked -> sharedPref.edit().putBoolean("VoidEssenceTick_state", isChecked).apply() }
        BoneFragmentTick.setOnCheckedChangeListener { _, isChecked -> sharedPref.edit().putBoolean("BoneFragmentTick_state", isChecked).apply() }
        AmethystTick.setOnCheckedChangeListener { _, isChecked -> sharedPref.edit().putBoolean("AmethystTick_state", isChecked).apply() }
        RemixedAquamarineTick.setOnCheckedChangeListener { _, isChecked -> sharedPref.edit().putBoolean("RemixedAquamarineTick_state", isChecked).apply() }
        DiamondTick.setOnCheckedChangeListener { _, isChecked -> sharedPref.edit().putBoolean("DiamondTick_state", isChecked).apply() }
        EmeraldTick.setOnCheckedChangeListener { _, isChecked -> sharedPref.edit().putBoolean("EmeraldTick_state", isChecked).apply() }
        RubyTick.setOnCheckedChangeListener { _, isChecked -> sharedPref.edit().putBoolean("RubyTick_state", isChecked).apply() }
        TopazTick.setOnCheckedChangeListener { _, isChecked -> sharedPref.edit().putBoolean("TopazTick_state", isChecked).apply() }
        IridiumOreTick.setOnCheckedChangeListener { _, isChecked -> sharedPref.edit().putBoolean("IridiumOreTick_state", isChecked).apply() }
        BatteryPackTick.setOnCheckedChangeListener { _, isChecked -> sharedPref.edit().putBoolean("BatteryPackTick_state", isChecked).apply() }
        RefinedQuartzTick.setOnCheckedChangeListener { _, isChecked -> sharedPref.edit().putBoolean("RefinedQuartzTick_state", isChecked).apply() }
        RedMushroomTick.setOnCheckedChangeListener { _, isChecked -> sharedPref.edit().putBoolean("RedMushroomTick_state", isChecked).apply() }
        BeetTick.setOnCheckedChangeListener { _, isChecked -> sharedPref.edit().putBoolean("BeetTick_state", isChecked).apply() }
        SeaUrchinTick.setOnCheckedChangeListener { _, isChecked -> sharedPref.edit().putBoolean("SeaUrchinTick_state", isChecked).apply() }
        AmaranthTick.setOnCheckedChangeListener { _, isChecked -> sharedPref.edit().putBoolean("AmaranthTick_state", isChecked).apply() }
        SunflowerTick.setOnCheckedChangeListener { _, isChecked -> sharedPref.edit().putBoolean("SunflowerTick_state", isChecked).apply() }
        StarfruitTick.setOnCheckedChangeListener { _, isChecked -> sharedPref.edit().putBoolean("StarfruitTick_state", isChecked).apply() }
        DuckFeatherTick.setOnCheckedChangeListener { _, isChecked -> sharedPref.edit().putBoolean("DuckFeatherTick_state", isChecked).apply() }
        CactusFruitTick.setOnCheckedChangeListener { _, isChecked -> sharedPref.edit().putBoolean("CactusFruitTick_state", isChecked).apply() }
        AquamarineTick.setOnCheckedChangeListener { _, isChecked -> sharedPref.edit().putBoolean("AquamarineTick_state", isChecked).apply() }
        BlueberryTick.setOnCheckedChangeListener { _, isChecked -> sharedPref.edit().putBoolean("BlueberryTick_state", isChecked).apply() }
        RedCabbageTick.setOnCheckedChangeListener { _, isChecked -> sharedPref.edit().putBoolean("RedCabbageTick_state", isChecked).apply() }
        IridiumBarTick.setOnCheckedChangeListener { _, isChecked -> sharedPref.edit().putBoolean("IridiumBarTick_state", isChecked).apply() }
        Salmonberry10Tick.setOnCheckedChangeListener { _, isChecked -> sharedPref.edit().putBoolean("Salmonberry10Tick_state", isChecked).apply() }
        CookieTick.setOnCheckedChangeListener { _, isChecked -> sharedPref.edit().putBoolean("CookieTick_state", isChecked).apply() }
        AncientDollTick.setOnCheckedChangeListener { _, isChecked -> sharedPref.edit().putBoolean("AncientDollTick_state", isChecked).apply() }
        IceCreamTick.setOnCheckedChangeListener { _, isChecked -> sharedPref.edit().putBoolean("IceCreamTick_state", isChecked).apply() }
        Salmonberry50Tick.setOnCheckedChangeListener { _, isChecked -> sharedPref.edit().putBoolean("Salmonberry50Tick_state",isChecked).apply()}


        }
}