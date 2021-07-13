package com.thethirdeye.android_morse_code_light.utils

enum class StandardType{
    AmericanMorse,
    InternationalMorse,
}

sealed class MorseStandardCreator {
    companion object {
        fun create(stdType: StandardType): MorseStandard {
            return when (stdType) {
                StandardType.AmericanMorse -> AmericanMorseStandard
                StandardType.InternationalMorse -> InternationalMorseStandard
            }
        }
    }
}