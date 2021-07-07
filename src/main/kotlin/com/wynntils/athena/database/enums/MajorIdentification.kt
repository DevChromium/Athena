package com.wynntils.athena.database.enums

import com.wynntils.athena.core.utils.JSONOrderedObject

enum class MajorIdentification(

    val displayname: String,
    val description: String

) {

    PLAGUE("Plague", "Poisoned mobs spread their poison to nearby mobs"),
    HAWKEYE("Hawkeye", "Arrow storm fires 5 arrows each dealing 80% damage"),
    GREED("Greed", "Picking up emeralds heals you and nearby players for 15% max health"),
    CAVALRYMAN("Cavalryman", "You may cast spells and attack with a 70% damage penalty while on a horse"),
    GUARDIAN("Guardian", "50% of damage taken by nearby allies is redirected to you"),
    ALTRUISM("Heart of the Pack", "Nearby players gain 35% of the health you naturally regenerate"),
    HERO("Saviour's Sacrifice", "While under 50% maximum health, nearby allies gain 50% bonus damage and defence"),
    ARCANES("Transcendence", "50% chance for spells to cost no mana when casted"),
    ENTROPY("Entropy", "Meteor falls three times faster"),
    ROVINGASSASSIN("Roving Assassin", "Vanish no longer drains mana while invisible"),
    MAGNET("Magnet", "Pulls items within an 8 block radius towards you"),
    MADNESS("Madness", "Casts a random ability every 3 seconds"),
    LIGHTWEIGHT("Lightweight", "You no longer take fall damage"),
    SORCERY("Sorcery", "30% chance for spells and attacks to cast a second time at no additional cost"),
    TAUNT("Taunt", "Mobs within 12 blocks target you upon casting War Scream"),
    FREERUNNER("Freerunner", "Double your sprint speed when your sprint bar is under 30%"),
    RALLY("Rally", "Charge heals you by 10% and nearby allies by 15% on impact, but becomes harmless"),
    CHERRY_BOMBS("Cherry Bombs", "Your Smoke Bombs explode instantly on contact, dealing 110% damage each"),
    PEACEFUL_EFFIGY("Peaceful Effigy", "Your Totem will last twice as long"),
    FURIOUS_EFFIGY("Furious Effigy", "Totem effects are twice as fast, but duration is halved"),
    FLASHFREEZE("Flash Freeze", "Ice Snake is instant but has a reduced range"),
    FISSION("Fission", "Explosions from your \"Exploding\" ID are twice as big and twice as strong"),
    EXPLOSIVE_IMPACT("Explosive Impact", "Your \"Exploding\" ID can trigger when hitting mobs with your basic attack");

    fun getJSON() : JSONOrderedObject {
        val result = JSONOrderedObject()

        result["name"] = displayname
        result["description"] = description

        return result
    }

}