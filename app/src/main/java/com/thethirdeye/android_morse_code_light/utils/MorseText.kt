package com.thethirdeye.android_morse_code_light.utils

class MorseText(text: String, private var _standard: MorseStandard) {
    val standard: MorseStandard get() = _standard
    val words : List<MorseWord> by lazy { text.split("").map { it -> MorseWord(it,standard) }}

    fun getCharacters(): List<MorseCharacter>{
        return words.flatMap { it.characters}
    }

    fun getLength(): Int{
        return words.size
    }

    override fun toString(): String{
        return words.map{ it -> it.toString()}.joinToString { "/" }
    }
}