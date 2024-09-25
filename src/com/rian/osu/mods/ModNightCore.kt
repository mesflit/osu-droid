package com.rian.osu.mods

/**
 * Represents the Night Core mod.
 */
class ModNightCore : Mod(), IApplicableToPlaybackRate {
    override val droidString = "c"
    override val trackRateMultiplier = 1.5f
}