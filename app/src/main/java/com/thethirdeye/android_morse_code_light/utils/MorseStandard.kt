package com.thethirdeye.android_morse_code_light.utils

interface MorseStandard {
    fun getSymbol(character:Char): String
    fun getUnits(character:Char): MorseUnits
    fun isCharacter(character:Char): Boolean
}