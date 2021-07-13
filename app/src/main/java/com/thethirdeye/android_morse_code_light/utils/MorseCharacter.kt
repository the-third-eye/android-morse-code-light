package com.thethirdeye.android_morse_code_light.utils

data class MorseCharacter(private var _character: Char,
                     private var _standard: MorseStandard,) {

    val character: Char get() = _character
    val standard: MorseStandard get() = _standard

    fun getUnits(): MorseUnits{
        return _standard.getUnits(character = _character)
    }

    override fun toString(): String{
        return standard.getSymbol(character)
    }
}