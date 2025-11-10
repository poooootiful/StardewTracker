package com.example.stardewtracker

import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.CheckBox
class TrackerCommunity : AppCompatActivity() {
    private lateinit var WildhorseradsishTick: CheckBox
    private lateinit var DaffodilTick: CheckBox
    private lateinit var LeekTick: CheckBox
    private lateinit var DandelionTick: CheckBox
    private lateinit var SweetpeaTick: CheckBox
    private lateinit var SpiceberryTick: CheckBox
    private lateinit var GrapeTick: CheckBox
    private lateinit var BlackberryTick: CheckBox
    private lateinit var HazelnutTick: CheckBox
    private lateinit var CmushroomTick: CheckBox
    private lateinit var WildplumTick: CheckBox
    private lateinit var SnowyamTick: CheckBox
    private lateinit var WinterrootTick: CheckBox
    private lateinit var CrystalfruitTick: CheckBox
    private lateinit var CrocusTick: CheckBox
    private lateinit var WoodTick: CheckBox
    private lateinit var Wood2Tick: CheckBox
    private lateinit var StoneTick: CheckBox
    private lateinit var HardwoodTick: CheckBox
    private lateinit var CoconutTick: CheckBox
    private lateinit var CactusFruitTick: CheckBox
    private lateinit var CaveCarrotTick: CheckBox
    private lateinit var RedMushroomTick: CheckBox
    private lateinit var PurpleMushroomTick: CheckBox
    private lateinit var MapleSyrupTick: CheckBox
    private lateinit var OakResinTick: CheckBox
    private lateinit var PineTarTick: CheckBox
    private lateinit var MorelTick: CheckBox
    private lateinit var ParsnipTick: CheckBox
    private lateinit var GreenBeanTick: CheckBox
    private lateinit var CauliflowerTick: CheckBox
    private lateinit var PotatoTick: CheckBox
    private lateinit var TomatoTick: CheckBox
    private lateinit var HotPepperTick: CheckBox
    private lateinit var BlueberryTick: CheckBox
    private lateinit var MelonTick: CheckBox
    private lateinit var CornTick: CheckBox
    private lateinit var EggplantTick: CheckBox
    private lateinit var PumpkinTick: CheckBox
    private lateinit var YamTick: CheckBox
    private lateinit var Parsnip5Tick: CheckBox
    private lateinit var Melon5Tick: CheckBox
    private lateinit var Pumpkin5Tick: CheckBox
    private lateinit var Corn5Tick: CheckBox
    private lateinit var LargeMilkTick: CheckBox
    private lateinit var LargeEggBrownTick: CheckBox
    private lateinit var LargeEggWhiteTick: CheckBox
    private lateinit var LargeGoatMilkTick: CheckBox
    private lateinit var WoolTick: CheckBox
    private lateinit var DuckEggTick: CheckBox
    private lateinit var TruffleOilTick: CheckBox
    private lateinit var ClothTick: CheckBox
    private lateinit var GoatCheeseTick: CheckBox
    private lateinit var CheeseTick: CheckBox
    private lateinit var HoneyTick: CheckBox
    private lateinit var JellyTick: CheckBox
    private lateinit var AppleTick: CheckBox
    private lateinit var ApricotTick: CheckBox
    private lateinit var OrangeTick: CheckBox
    private lateinit var PeachTick: CheckBox
    private lateinit var PomegranateTick: CheckBox
    private lateinit var CherryTick: CheckBox
    private lateinit var SunfishTick: CheckBox
    private lateinit var CatfishTick: CheckBox
    private lateinit var ShadTick: CheckBox
    private lateinit var TigerTroutTick: CheckBox
    private lateinit var LargemouthBassTick: CheckBox
    private lateinit var CarpTick: CheckBox
    private lateinit var BullheadTick: CheckBox
    private lateinit var SturgeonTick: CheckBox
    private lateinit var SardineTick: CheckBox
    private lateinit var TunaTick: CheckBox
    private lateinit var RedSnapperTick: CheckBox
    private lateinit var TilapiaTick: CheckBox
    private lateinit var WalleyeTick: CheckBox
    private lateinit var BreamTick: CheckBox
    private lateinit var EelTick: CheckBox
    private lateinit var LobsterTick: CheckBox
    private lateinit var CrayfishTick: CheckBox
    private lateinit var CrabTick: CheckBox
    private lateinit var CockleTick: CheckBox
    private lateinit var MusselTick: CheckBox
    private lateinit var ShrimpTick: CheckBox
    private lateinit var SnailTick: CheckBox
    private lateinit var PeriwinkleTick: CheckBox
    private lateinit var OysterTick: CheckBox
    private lateinit var ClamTick: CheckBox
    private lateinit var PufferfishTick: CheckBox
    private lateinit var GhostfishTick: CheckBox
    private lateinit var SandfishTick: CheckBox
    private lateinit var WoodskipTick: CheckBox
    private lateinit var CopperBarTick: CheckBox
    private lateinit var IronBarTick: CheckBox
    private lateinit var GoldBarTick: CheckBox
    private lateinit var QuartzTick: CheckBox
    private lateinit var EarthCrystalTick: CheckBox
    private lateinit var FrozenTearTick: CheckBox
    private lateinit var FireQuartzTick: CheckBox
    private lateinit var Slime99Tick: CheckBox
    private lateinit var BatWing10Tick: CheckBox
    private lateinit var SolarEssenceTick: CheckBox
    private lateinit var VoidEssenceTick: CheckBox
    private lateinit var ChefMapleSyrupTick: CheckBox
    private lateinit var FiddleheadFernTick: CheckBox
    private lateinit var TruffleTick: CheckBox
    private lateinit var PoppyTick: CheckBox
    private lateinit var MakiRollTick: CheckBox
    private lateinit var FriedEggTick: CheckBox
    private lateinit var DyeRedMushroomTick: CheckBox
    private lateinit var SeaUrchinTick: CheckBox
    private lateinit var SunflowerTick: CheckBox
    private lateinit var DuckFeatherTick: CheckBox
    private lateinit var AquamarineTick: CheckBox
    private lateinit var RedCabbageTick: CheckBox
    private lateinit var FieldPurpleMushroomTick: CheckBox
    private lateinit var NautilusTick: CheckBox
    private lateinit var ChubTick: CheckBox
    private lateinit var FrozenGeodeTick: CheckBox
    private lateinit var Wheat10Tick: CheckBox
    private lateinit var Hay10Tick: CheckBox
    private lateinit var Apple3Tick: CheckBox
    private lateinit var EnchanterOakResinTick: CheckBox
    private lateinit var WineTick: CheckBox
    private lateinit var RabbitsFootTick: CheckBox
    private lateinit var EnchanterPomegranateTick: CheckBox
    private lateinit var G2500Tick: CheckBox
    private lateinit var G5000Tick: CheckBox
    private lateinit var G10000Tick: CheckBox
    private lateinit var G25000Tick: CheckBox


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tracker_community)

        val sharedPref = getSharedPreferences("CommunitySaved", Context.MODE_PRIVATE)

        WildhorseradsishTick = findViewById(R.id.WildhorseradsishTick)
        DaffodilTick = findViewById(R.id.DaffodilTick)
        LeekTick = findViewById(R.id.LeekTick)
        DandelionTick = findViewById(R.id.DandelionTick)
        SweetpeaTick = findViewById(R.id.SweetpeaTick)
        SpiceberryTick = findViewById(R.id.SpiceberryTick)
        GrapeTick = findViewById(R.id.GrapeTick)
        BlackberryTick = findViewById(R.id.BlackberryTick)
        HazelnutTick = findViewById(R.id.HazelnutTick)
        CmushroomTick = findViewById(R.id.CmushroomTick)
        WildplumTick = findViewById(R.id.WildplumTick)
        SnowyamTick = findViewById(R.id.SnowyamTick)
        WinterrootTick = findViewById(R.id.WinterrootTick)
        CrystalfruitTick = findViewById(R.id.CrystalfruitTick)
        CrocusTick = findViewById(R.id.CrocusTick)
        WoodTick = findViewById(R.id.WoodTick)
        Wood2Tick = findViewById(R.id.Wood2Tick)
        StoneTick = findViewById(R.id.StoneTick)
        HardwoodTick = findViewById(R.id.HardwoodTick)
        CoconutTick = findViewById(R.id.CoconutTick)
        CactusFruitTick = findViewById(R.id.CactusFruitTick)
        CaveCarrotTick = findViewById(R.id.CaveCarrotTick)
        RedMushroomTick = findViewById(R.id.RedMushroomTick)
        PurpleMushroomTick = findViewById(R.id.PurpleMushroomTick)
        MapleSyrupTick = findViewById(R.id.MapleSyrupTick)
        OakResinTick = findViewById(R.id.OakResinTick)
        PineTarTick = findViewById(R.id.PineTarTick)
        MorelTick = findViewById(R.id.MorelTick)
        ParsnipTick = findViewById(R.id.ParsnipTick)
        GreenBeanTick = findViewById(R.id.GreenBeanTick)
        CauliflowerTick = findViewById(R.id.CauliflowerTick)
        PotatoTick = findViewById(R.id.PotatoTick)
        TomatoTick = findViewById(R.id.TomatoTick)
        HotPepperTick = findViewById(R.id.HotPepperTick)
        BlueberryTick = findViewById(R.id.BlueberryTick)
        MelonTick = findViewById(R.id.MelonTick)
        CornTick = findViewById(R.id.CornTick)
        EggplantTick = findViewById(R.id.EggplantTick)
        PumpkinTick = findViewById(R.id.PumpkinTick)
        YamTick = findViewById(R.id.YamTick)
        Parsnip5Tick = findViewById(R.id.Parsnip5Tick)
        Melon5Tick = findViewById(R.id.Melon5Tick)
        Pumpkin5Tick = findViewById(R.id.Pumpkin5Tick)
        Corn5Tick = findViewById(R.id.Corn5Tick)
        LargeMilkTick = findViewById(R.id.LargeMilkTick)
        LargeEggBrownTick = findViewById(R.id.LargeEggBrownTick)
        LargeEggWhiteTick = findViewById(R.id.LargeEggWhiteTick)
        LargeGoatMilkTick = findViewById(R.id.LargeGoatMilkTick)
        WoolTick = findViewById(R.id.WoolTick)
        DuckEggTick = findViewById(R.id.DuckEggTick)
        TruffleOilTick = findViewById(R.id.TruffleOilTick)
        ClothTick = findViewById(R.id.ClothTick)
        GoatCheeseTick = findViewById(R.id.GoatCheeseTick)
        CheeseTick = findViewById(R.id.CheeseTick)
        HoneyTick = findViewById(R.id.HoneyTick)
        JellyTick = findViewById(R.id.JellyTick)
        AppleTick = findViewById(R.id.AppleTick)
        ApricotTick = findViewById(R.id.ApricotTick)
        OrangeTick = findViewById(R.id.OrangeTick)
        PeachTick = findViewById(R.id.PeachTick)
        PomegranateTick = findViewById(R.id.PomegranateTick)
        CherryTick = findViewById(R.id.CherryTick)
        SunfishTick = findViewById(R.id.SunfishTick)
        CatfishTick = findViewById(R.id.CatfishTick)
        ShadTick = findViewById(R.id.ShadTick)
        TigerTroutTick = findViewById(R.id.TigerTroutTick)
        LargemouthBassTick = findViewById(R.id.LargemouthBassTick)
        CarpTick = findViewById(R.id.CarpTick)
        BullheadTick = findViewById(R.id.BullheadTick)
        SturgeonTick = findViewById(R.id.SturgeonTick)
        SardineTick = findViewById(R.id.SardineTick)
        TunaTick = findViewById(R.id.TunaTick)
        RedSnapperTick = findViewById(R.id.RedSnapperTick)
        TilapiaTick = findViewById(R.id.TilapiaTick)
        WalleyeTick = findViewById(R.id.WalleyeTick)
        BreamTick = findViewById(R.id.BreamTick)
        EelTick = findViewById(R.id.EelTick)
        LobsterTick = findViewById(R.id.LobsterTick)
        CrayfishTick = findViewById(R.id.CrayfishTick)
        CrabTick = findViewById(R.id.CrabTick)
        CockleTick = findViewById(R.id.CockleTick)
        MusselTick = findViewById(R.id.MusselTick)
        ShrimpTick = findViewById(R.id.ShrimpTick)
        SnailTick = findViewById(R.id.SnailTick)
        PeriwinkleTick = findViewById(R.id.PeriwinkleTick)
        OysterTick = findViewById(R.id.OysterTick)
        ClamTick = findViewById(R.id.ClamTick)
        PufferfishTick = findViewById(R.id.PufferfishTick)
        GhostfishTick = findViewById(R.id.GhostfishTick)
        SandfishTick = findViewById(R.id.SandfishTick)
        WoodskipTick = findViewById(R.id.WoodskipTick)
        CopperBarTick = findViewById(R.id.CopperBarTick)
        IronBarTick = findViewById(R.id.IronBarTick)
        GoldBarTick = findViewById(R.id.GoldBarTick)
        QuartzTick = findViewById(R.id.QuartzTick)
        EarthCrystalTick = findViewById(R.id.EarthCrystalTick)
        FrozenTearTick = findViewById(R.id.FrozenTearTick)
        FireQuartzTick = findViewById(R.id.FireQuartzTick)
        Slime99Tick = findViewById(R.id.Slime99Tick)
        BatWing10Tick = findViewById(R.id.BatWing10Tick)
        SolarEssenceTick = findViewById(R.id.SolarEssenceTick)
        VoidEssenceTick = findViewById(R.id.VoidEssenceTick)
        ChefMapleSyrupTick = findViewById(R.id.ChefMapleSyrupTick)
        FiddleheadFernTick = findViewById(R.id.FiddleheadFernTick)
        TruffleTick = findViewById(R.id.TruffleTick)
        PoppyTick = findViewById(R.id.PoppyTick)
        MakiRollTick = findViewById(R.id.MakiRollTick)
        FriedEggTick = findViewById(R.id.FriedEggTick)
        DyeRedMushroomTick = findViewById(R.id.DyeRedMushroomTick)
        SeaUrchinTick = findViewById(R.id.SeaUrchinTick)
        SunflowerTick = findViewById(R.id.SunflowerTick)
        DuckFeatherTick = findViewById(R.id.DuckFeatherTick)
        AquamarineTick = findViewById(R.id.AquamarineTick)
        RedCabbageTick = findViewById(R.id.RedCabbageTick)
        FieldPurpleMushroomTick = findViewById(R.id.FieldPurpleMushroomTick)
        NautilusTick = findViewById(R.id.NautilusTick)
        ChubTick = findViewById(R.id.ChubTick)
        FrozenGeodeTick = findViewById(R.id.FrozenGeodeTick)
        Wheat10Tick = findViewById(R.id.Wheat10Tick)
        Hay10Tick = findViewById(R.id.Hay10Tick)
        Apple3Tick = findViewById(R.id.Apple3Tick)
        EnchanterOakResinTick = findViewById(R.id.EnchanterOakResinTick)
        WineTick = findViewById(R.id.WineTick)
        RabbitsFootTick = findViewById(R.id.RabbitsFootTick)
        EnchanterPomegranateTick = findViewById(R.id.EnchanterPomegranateTick)
        G2500Tick = findViewById(R.id.G2500Tick)
        G5000Tick = findViewById(R.id.G5000Tick)
        G10000Tick = findViewById(R.id.G10000Tick)
        G25000Tick = findViewById(R.id.G25000Tick)

        WildhorseradsishTick.isChecked = sharedPref.getBoolean("WildhorseradsishTick_state", false)
        DaffodilTick.isChecked = sharedPref.getBoolean("DaffodilTick_state", false)
        LeekTick.isChecked = sharedPref.getBoolean("LeekTick_state", false)
        DandelionTick.isChecked = sharedPref.getBoolean("DandelionTick_state", false)
        SweetpeaTick.isChecked = sharedPref.getBoolean("SweetpeaTick_state", false)
        SpiceberryTick.isChecked = sharedPref.getBoolean("SpiceberryTick_state", false)
        GrapeTick.isChecked = sharedPref.getBoolean("GrapeTick_state", false)
        BlackberryTick.isChecked = sharedPref.getBoolean("BlackberryTick_state", false)
        HazelnutTick.isChecked = sharedPref.getBoolean("HazelnutTick_state", false)
        CmushroomTick.isChecked = sharedPref.getBoolean("CmushroomTick_state", false)
        WildplumTick.isChecked = sharedPref.getBoolean("WildplumTick_state", false)
        SnowyamTick.isChecked = sharedPref.getBoolean("SnowyamTick_state", false)
        WinterrootTick.isChecked = sharedPref.getBoolean("WinterrootTick_state", false)
        CrystalfruitTick.isChecked = sharedPref.getBoolean("CrystalfruitTick_state", false)
        CrocusTick.isChecked = sharedPref.getBoolean("CrocusTick_state", false)
        WoodTick.isChecked = sharedPref.getBoolean("WoodTick_state", false)
        Wood2Tick.isChecked = sharedPref.getBoolean("Wood2Tick_state", false)
        StoneTick.isChecked = sharedPref.getBoolean("StoneTick_state", false)
        HardwoodTick.isChecked = sharedPref.getBoolean("HardwoodTick_state", false)
        CoconutTick.isChecked = sharedPref.getBoolean("CoconutTick_state", false)
        CactusFruitTick.isChecked = sharedPref.getBoolean("CactusFruitTick_state", false)
        CaveCarrotTick.isChecked = sharedPref.getBoolean("CaveCarrotTick_state", false)
        RedMushroomTick.isChecked = sharedPref.getBoolean("RedMushroomTick_state", false)
        PurpleMushroomTick.isChecked = sharedPref.getBoolean("PurpleMushroomTick_state", false)
        MapleSyrupTick.isChecked = sharedPref.getBoolean("MapleSyrupTick_state", false)
        OakResinTick.isChecked = sharedPref.getBoolean("OakResinTick_state", false)
        PineTarTick.isChecked = sharedPref.getBoolean("PineTarTick_state", false)
        MorelTick.isChecked = sharedPref.getBoolean("MorelTick_state", false)
        ParsnipTick.isChecked = sharedPref.getBoolean("ParsnipTick_state", false)
        GreenBeanTick.isChecked = sharedPref.getBoolean("GreenBeanTick_state", false)
        CauliflowerTick.isChecked = sharedPref.getBoolean("CauliflowerTick_state", false)
        PotatoTick.isChecked = sharedPref.getBoolean("PotatoTick_state", false)
        TomatoTick.isChecked = sharedPref.getBoolean("TomatoTick_state", false)
        HotPepperTick.isChecked = sharedPref.getBoolean("HotPepperTick_state", false)
        BlueberryTick.isChecked = sharedPref.getBoolean("BlueberryTick_state", false)
        MelonTick.isChecked = sharedPref.getBoolean("MelonTick_state", false)
        CornTick.isChecked = sharedPref.getBoolean("CornTick_state", false)
        EggplantTick.isChecked = sharedPref.getBoolean("EggplantTick_state", false)
        PumpkinTick.isChecked = sharedPref.getBoolean("PumpkinTick_state", false)
        YamTick.isChecked = sharedPref.getBoolean("YamTick_state", false)
        Parsnip5Tick.isChecked = sharedPref.getBoolean("Parsnip5Tick_state", false)
        Melon5Tick.isChecked = sharedPref.getBoolean("Melon5Tick_state", false)
        Pumpkin5Tick.isChecked = sharedPref.getBoolean("Pumpkin5Tick_state", false)
        Corn5Tick.isChecked = sharedPref.getBoolean("Corn5Tick_state", false)
        LargeMilkTick.isChecked = sharedPref.getBoolean("LargeMilkTick_state", false)
        LargeEggBrownTick.isChecked = sharedPref.getBoolean("LargeEggBrownTick_state", false)
        LargeEggWhiteTick.isChecked = sharedPref.getBoolean("LargeEggWhiteTick_state", false)
        LargeGoatMilkTick.isChecked = sharedPref.getBoolean("LargeGoatMilkTick_state", false)
        WoolTick.isChecked = sharedPref.getBoolean("WoolTick_state", false)
        DuckEggTick.isChecked = sharedPref.getBoolean("DuckEggTick_state", false)
        TruffleOilTick.isChecked = sharedPref.getBoolean("TruffleOilTick_state", false)
        ClothTick.isChecked = sharedPref.getBoolean("ClothTick_state", false)
        GoatCheeseTick.isChecked = sharedPref.getBoolean("GoatCheeseTick_state", false)
        CheeseTick.isChecked = sharedPref.getBoolean("CheeseTick_state", false)
        HoneyTick.isChecked = sharedPref.getBoolean("HoneyTick_state", false)
        JellyTick.isChecked = sharedPref.getBoolean("JellyTick_state", false)
        AppleTick.isChecked = sharedPref.getBoolean("AppleTick_state", false)
        ApricotTick.isChecked = sharedPref.getBoolean("ApricotTick_state", false)
        OrangeTick.isChecked = sharedPref.getBoolean("OrangeTick_state", false)
        PeachTick.isChecked = sharedPref.getBoolean("PeachTick_state", false)
        PomegranateTick.isChecked = sharedPref.getBoolean("PomegranateTick_state", false)
        CherryTick.isChecked = sharedPref.getBoolean("CherryTick_state", false)
        SunfishTick.isChecked = sharedPref.getBoolean("SunfishTick_state", false)
        CatfishTick.isChecked = sharedPref.getBoolean("CatfishTick_state", false)
        ShadTick.isChecked = sharedPref.getBoolean("ShadTick_state", false)
        TigerTroutTick.isChecked = sharedPref.getBoolean("TigerTroutTick_state", false)
        LargemouthBassTick.isChecked = sharedPref.getBoolean("LargemouthBassTick_state", false)
        CarpTick.isChecked = sharedPref.getBoolean("CarpTick_state", false)
        BullheadTick.isChecked = sharedPref.getBoolean("BullheadTick_state", false)
        SturgeonTick.isChecked = sharedPref.getBoolean("SturgeonTick_state", false)
        SardineTick.isChecked = sharedPref.getBoolean("SardineTick_state", false)
        TunaTick.isChecked = sharedPref.getBoolean("TunaTick_state", false)
        RedSnapperTick.isChecked = sharedPref.getBoolean("RedSnapperTick_state", false)
        TilapiaTick.isChecked = sharedPref.getBoolean("TilapiaTick_state", false)
        WalleyeTick.isChecked = sharedPref.getBoolean("WalleyeTick_state", false)
        BreamTick.isChecked = sharedPref.getBoolean("BreamTick_state", false)
        EelTick.isChecked = sharedPref.getBoolean("EelTick_state", false)
        LobsterTick.isChecked = sharedPref.getBoolean("LobsterTick_state", false)
        CrayfishTick.isChecked = sharedPref.getBoolean("CrayfishTick_state", false)
        CrabTick.isChecked = sharedPref.getBoolean("CrabTick_state", false)
        CockleTick.isChecked = sharedPref.getBoolean("CockleTick_state", false)
        MusselTick.isChecked = sharedPref.getBoolean("MusselTick_state", false)
        ShrimpTick.isChecked = sharedPref.getBoolean("ShrimpTick_state", false)
        SnailTick.isChecked = sharedPref.getBoolean("SnailTick_state", false)
        PeriwinkleTick.isChecked = sharedPref.getBoolean("PeriwinkleTick_state", false)
        OysterTick.isChecked = sharedPref.getBoolean("OysterTick_state", false)
        ClamTick.isChecked = sharedPref.getBoolean("ClamTick_state", false)
        PufferfishTick.isChecked = sharedPref.getBoolean("PufferfishTick_state", false)
        GhostfishTick.isChecked = sharedPref.getBoolean("GhostfishTick_state", false)
        SandfishTick.isChecked = sharedPref.getBoolean("SandfishTick_state", false)
        WoodskipTick.isChecked = sharedPref.getBoolean("WoodskipTick_state", false)
        CopperBarTick.isChecked = sharedPref.getBoolean("CopperBarTick_state", false)
        IronBarTick.isChecked = sharedPref.getBoolean("IronBarTick_state", false)
        GoldBarTick.isChecked = sharedPref.getBoolean("GoldBarTick_state", false)
        QuartzTick.isChecked = sharedPref.getBoolean("QuartzTick_state", false)
        EarthCrystalTick.isChecked = sharedPref.getBoolean("EarthCrystalTick_state", false)
        FrozenTearTick.isChecked = sharedPref.getBoolean("FrozenTearTick_state", false)
        FireQuartzTick.isChecked = sharedPref.getBoolean("FireQuartzTick_state", false)
        Slime99Tick.isChecked = sharedPref.getBoolean("Slime99Tick_state", false)
        BatWing10Tick.isChecked = sharedPref.getBoolean("BatWing10Tick_state", false)
        SolarEssenceTick.isChecked = sharedPref.getBoolean("SolarEssenceTick_state", false)
        VoidEssenceTick.isChecked = sharedPref.getBoolean("VoidEssenceTick_state", false)
        ChefMapleSyrupTick.isChecked = sharedPref.getBoolean("ChefMapleSyrupTick_state", false)
        FiddleheadFernTick.isChecked = sharedPref.getBoolean("FiddleheadFernTick_state", false)
        TruffleTick.isChecked = sharedPref.getBoolean("TruffleTick_state", false)
        PoppyTick.isChecked = sharedPref.getBoolean("PoppyTick_state", false)
        MakiRollTick.isChecked = sharedPref.getBoolean("MakiRollTick_state", false)
        FriedEggTick.isChecked = sharedPref.getBoolean("FriedEggTick_state", false)
        DyeRedMushroomTick.isChecked = sharedPref.getBoolean("DyeRedMushroomTick_state", false)
        SeaUrchinTick.isChecked = sharedPref.getBoolean("SeaUrchinTick_state", false)
        SunflowerTick.isChecked = sharedPref.getBoolean("SunflowerTick_state", false)
        DuckFeatherTick.isChecked = sharedPref.getBoolean("DuckFeatherTick_state", false)
        AquamarineTick.isChecked = sharedPref.getBoolean("AquamarineTick_state", false)
        RedCabbageTick.isChecked = sharedPref.getBoolean("RedCabbageTick_state", false)
        FieldPurpleMushroomTick.isChecked = sharedPref.getBoolean("FieldPurpleMushroomTick_state", false)
        NautilusTick.isChecked = sharedPref.getBoolean("NautilusTick_state", false)
        ChubTick.isChecked = sharedPref.getBoolean("ChubTick_state", false)
        FrozenGeodeTick.isChecked = sharedPref.getBoolean("FrozenGeodeTick_state", false)
        Wheat10Tick.isChecked = sharedPref.getBoolean("Wheat10Tick_state", false)
        Hay10Tick.isChecked = sharedPref.getBoolean("Hay10Tick_state", false)
        Apple3Tick.isChecked = sharedPref.getBoolean("Apple3Tick_state", false)
        EnchanterOakResinTick.isChecked = sharedPref.getBoolean("EnchanterOakResinTick_state", false)
        WineTick.isChecked = sharedPref.getBoolean("WineTick_state", false)
        RabbitsFootTick.isChecked = sharedPref.getBoolean("RabbitsFootTick_state", false)
        EnchanterPomegranateTick.isChecked = sharedPref.getBoolean("EnchanterPomegranateTick_state", false)
        G2500Tick.isChecked = sharedPref.getBoolean("G2500Tick_state", false)
        G5000Tick.isChecked = sharedPref.getBoolean("G5000Tick_state", false)
        G10000Tick.isChecked = sharedPref.getBoolean("G10000Tick_state", false)
        G25000Tick.isChecked = sharedPref.getBoolean("G25000Tick_state", false)


        WildhorseradsishTick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("WildhorseradsishTick_state", isChecked).apply()
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

        SweetpeaTick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("SweetpeaTick_state", isChecked).apply()
        }

        SpiceberryTick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("SpiceberryTick_state", isChecked).apply()
        }

        GrapeTick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("GrapeTick_state", isChecked).apply()
        }

        BlackberryTick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("BlackberryTick_state", isChecked).apply()
        }

        HazelnutTick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("HazelnutTick_state", isChecked).apply()
        }

        CmushroomTick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("CmushroomTick_state", isChecked).apply()
        }

        WildplumTick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("WildplumTick_state", isChecked).apply()
        }

        SnowyamTick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("SnowyamTick_state", isChecked).apply()
        }

        WinterrootTick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("WinterrootTick_state", isChecked).apply()
        }

        CrystalfruitTick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("CrystalfruitTick_state", isChecked).apply()
        }

        CrocusTick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("CrocusTick_state", isChecked).apply()
        }

        WoodTick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("WoodTick_state", isChecked).apply()
        }

        Wood2Tick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("Wood2Tick_state", isChecked).apply()
        }

        StoneTick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("StoneTick_state", isChecked).apply()
        }

        HardwoodTick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("HardwoodTick_state", isChecked).apply()
        }

        CoconutTick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("CoconutTick_state", isChecked).apply()
        }

        CactusFruitTick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("CactusFruitTick_state", isChecked).apply()
        }

        CaveCarrotTick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("CaveCarrotTick_state", isChecked).apply()
        }

        RedMushroomTick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("RedMushroomTick_state", isChecked).apply()
        }

        PurpleMushroomTick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("PurpleMushroomTick_state", isChecked).apply()
        }

        MapleSyrupTick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("MapleSyrupTick_state", isChecked).apply()
        }

        OakResinTick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("OakResinTick_state", isChecked).apply()
        }

        PineTarTick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("PineTarTick_state", isChecked).apply()
        }

        MorelTick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("MorelTick_state", isChecked).apply()
        }

        ParsnipTick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("ParsnipTick_state", isChecked).apply()
        }

        GreenBeanTick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("GreenBeanTick_state", isChecked).apply()
        }

        CauliflowerTick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("CauliflowerTick_state", isChecked).apply()
        }

        PotatoTick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("PotatoTick_state", isChecked).apply()
        }

        TomatoTick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("TomatoTick_state", isChecked).apply()
        }

        HotPepperTick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("HotPepperTick_state", isChecked).apply()
        }

        BlueberryTick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("BlueberryTick_state", isChecked).apply()
        }

        MelonTick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("MelonTick_state", isChecked).apply()
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

        Parsnip5Tick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("Parsnip5Tick_state", isChecked).apply()
        }

        Melon5Tick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("Melon5Tick_state", isChecked).apply()
        }

        Pumpkin5Tick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("Pumpkin5Tick_state", isChecked).apply()
        }

        Corn5Tick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("Corn5Tick_state", isChecked).apply()
        }

        LargeMilkTick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("LargeMilkTick_state", isChecked).apply()
        }

        LargeEggBrownTick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("LargeEggBrownTick_state", isChecked).apply()
        }

        LargeEggWhiteTick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("LargeEggWhiteTick_state", isChecked).apply()
        }

        LargeGoatMilkTick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("LargeGoatMilkTick_state", isChecked).apply()
        }

        WoolTick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("WoolTick_state", isChecked).apply()
        }

        DuckEggTick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("DuckEggTick_state", isChecked).apply()
        }

        TruffleOilTick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("TruffleOilTick_state", isChecked).apply()
        }

        ClothTick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("ClothTick_state", isChecked).apply()
        }

        GoatCheeseTick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("GoatCheeseTick_state", isChecked).apply()
        }

        CheeseTick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("CheeseTick_state", isChecked).apply()
        }

        HoneyTick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("HoneyTick_state", isChecked).apply()
        }

        JellyTick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("JellyTick_state", isChecked).apply()
        }

        AppleTick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("AppleTick_state", isChecked).apply()
        }

        ApricotTick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("ApricotTick_state", isChecked).apply()
        }

        OrangeTick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("OrangeTick_state", isChecked).apply()
        }

        PeachTick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("PeachTick_state", isChecked).apply()
        }

        PomegranateTick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("PomegranateTick_state", isChecked).apply()
        }

        CherryTick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("CherryTick_state", isChecked).apply()
        }

        SunfishTick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("SunfishTick_state", isChecked).apply()
        }

        CatfishTick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("CatfishTick_state", isChecked).apply()
        }

        ShadTick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("ShadTick_state", isChecked).apply()
        }

        TigerTroutTick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("TigerTroutTick_state", isChecked).apply()
        }

        LargemouthBassTick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("LargemouthBassTick_state", isChecked).apply()
        }

        CarpTick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("CarpTick_state", isChecked).apply()
        }

        BullheadTick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("BullheadTick_state", isChecked).apply()
        }

        SturgeonTick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("SturgeonTick_state", isChecked).apply()
        }

        SardineTick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("SardineTick_state", isChecked).apply()
        }

        TunaTick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("TunaTick_state", isChecked).apply()
        }

        RedSnapperTick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("RedSnapperTick_state", isChecked).apply()
        }

        TilapiaTick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("TilapiaTick_state", isChecked).apply()
        }

        WalleyeTick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("WalleyeTick_state", isChecked).apply()
        }

        BreamTick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("BreamTick_state", isChecked).apply()
        }

        EelTick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("EelTick_state", isChecked).apply()
        }

        LobsterTick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("LobsterTick_state", isChecked).apply()
        }

        CrayfishTick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("CrayfishTick_state", isChecked).apply()
        }

        CrabTick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("CrabTick_state", isChecked).apply()
        }

        CockleTick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("CockleTick_state", isChecked).apply()
        }

        MusselTick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("MusselTick_state", isChecked).apply()
        }

        ShrimpTick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("ShrimpTick_state", isChecked).apply()
        }

        SnailTick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("SnailTick_state", isChecked).apply()
        }

        PeriwinkleTick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("PeriwinkleTick_state", isChecked).apply()
        }

        OysterTick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("OysterTick_state", isChecked).apply()
        }

        ClamTick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("ClamTick_state", isChecked).apply()
        }

        PufferfishTick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("PufferfishTick_state", isChecked).apply()
        }

        GhostfishTick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("GhostfishTick_state", isChecked).apply()
        }

        SandfishTick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("SandfishTick_state", isChecked).apply()
        }

        WoodskipTick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("WoodskipTick_state", isChecked).apply()
        }

        CopperBarTick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("CopperBarTick_state", isChecked).apply()
        }

        IronBarTick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("IronBarTick_state", isChecked).apply()
        }

        GoldBarTick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("GoldBarTick_state", isChecked).apply()
        }

        QuartzTick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("QuartzTick_state", isChecked).apply()
        }

        EarthCrystalTick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("EarthCrystalTick_state", isChecked).apply()
        }

        FrozenTearTick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("FrozenTearTick_state", isChecked).apply()
        }

        FireQuartzTick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("FireQuartzTick_state", isChecked).apply()
        }

        Slime99Tick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("Slime99Tick_state", isChecked).apply()
        }

        BatWing10Tick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("BatWing10Tick_state", isChecked).apply()
        }

        SolarEssenceTick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("SolarEssenceTick_state", isChecked).apply()
        }

        VoidEssenceTick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("VoidEssenceTick_state", isChecked).apply()
        }

        ChefMapleSyrupTick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("ChefMapleSyrupTick_state", isChecked).apply()
        }

        FiddleheadFernTick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("FiddleheadFernTick_state", isChecked).apply()
        }

        TruffleTick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("TruffleTick_state", isChecked).apply()
        }

        PoppyTick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("PoppyTick_state", isChecked).apply()
        }

        MakiRollTick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("MakiRollTick_state", isChecked).apply()
        }

        FriedEggTick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("FriedEggTick_state", isChecked).apply()
        }

        DyeRedMushroomTick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("DyeRedMushroomTick_state", isChecked).apply()
        }

        SeaUrchinTick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("SeaUrchinTick_state", isChecked).apply()
        }

        SunflowerTick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("SunflowerTick_state", isChecked).apply()
        }

        DuckFeatherTick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("DuckFeatherTick_state", isChecked).apply()
        }

        AquamarineTick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("AquamarineTick_state", isChecked).apply()
        }

        RedCabbageTick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("RedCabbageTick_state", isChecked).apply()
        }

        FieldPurpleMushroomTick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("FieldPurpleMushroomTick_state", isChecked).apply()
        }

        NautilusTick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("NautilusTick_state", isChecked).apply()
        }

        ChubTick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("ChubTick_state", isChecked).apply()
        }

        FrozenGeodeTick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("FrozenGeodeTick_state", isChecked).apply()
        }

        Wheat10Tick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("Wheat10Tick_state", isChecked).apply()
        }

        Hay10Tick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("Hay10Tick_state", isChecked).apply()
        }

        Apple3Tick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("Apple3Tick_state", isChecked).apply()
        }

        EnchanterOakResinTick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("EnchanterOakResinTick_state", isChecked).apply()
        }

        WineTick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("WineTick_state", isChecked).apply()
        }

        RabbitsFootTick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("RabbitsFootTick_state", isChecked).apply()
        }

        EnchanterPomegranateTick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("EnchanterPomegranateTick_state", isChecked).apply()
        }

        G2500Tick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("G2500Tick_state", isChecked).apply()
        }

        G5000Tick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("G5000Tick_state", isChecked).apply()
        }

        G10000Tick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("G10000Tick_state", isChecked).apply()
        }

        G25000Tick.setOnCheckedChangeListener { _, isChecked ->
            sharedPref.edit().putBoolean("G25000Tick_state", isChecked).apply()
        }
    }
}