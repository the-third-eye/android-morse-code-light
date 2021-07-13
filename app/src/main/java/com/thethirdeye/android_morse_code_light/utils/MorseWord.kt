package com.thethirdeye.android_morse_code_light.utils

class MorseWord(word: String,
                private var _standard: MorseStandard,) {

    val characters: List<MorseCharacter> by lazy {
        MorseUtility.cleanInput(word, standard).map { it -> MorseCharacter(it,standard) }
    }

    val standard: MorseStandard get() = _standard

//    init{
//        MorseUtility.cleanInput(word, standard).forEach(){
//            characters.add(MorseCharacter(it,standard))
//        }
//    }

    fun getLength(): Int{
        return characters.size
    }

    override fun toString(): String{
        return characters.map{ it.toString() }.joinToString{" "}
    }
}