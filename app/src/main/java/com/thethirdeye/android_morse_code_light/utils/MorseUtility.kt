package com.thethirdeye.android_morse_code_light.utils

class MorseUtility {
    companion object{
        fun cleanInput(text: String, standard: MorseStandard): String{
            return text.lowercase().filter { standard.isCharacter(it) || it.isWhitespace() }
        }
    }
}