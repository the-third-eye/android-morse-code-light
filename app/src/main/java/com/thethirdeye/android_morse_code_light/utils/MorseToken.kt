package com.thethirdeye.android_morse_code_light.utils

typealias Token = MorseToken
typealias MorseUnits = ArrayList<Token>

enum class TokenType{
    SYM,SPACE
}

data class MorseToken(private var _type: TokenType, private var _length: Int) {
    val type: TokenType get() = _type
    val length: Int get() = _length
}