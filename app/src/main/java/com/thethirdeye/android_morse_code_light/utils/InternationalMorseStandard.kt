package com.thethirdeye.android_morse_code_light.utils

object InternationalMorseStandard: MorseStandard {

    private val symbolsMap = hashMapOf<Char,String>(
        'a' to ".-",
        'b' to "-...",
        'c' to "-.-.",
        'd' to "-..",
        'e' to ".",
        'f' to "..-.",
        'g' to "--.",
        'h' to "....",
        'i' to "..",
        'j' to ".---",
        'k' to "-.-",
        'l' to ".-..",
        'm' to "--",
        'n' to "-.",
        'o' to "---",
        'p' to ".--.",
        'q' to "--.-",
        'r' to ".-.",
        's' to "...",
        't' to "-",
        'u' to "..-",
        'v' to "---.",
        'w' to ".--",
        'x' to "-..-",
        'y' to "-.--",
        'z' to "--..",
        '0' to "-----",
        '1' to ".----",
        '2' to "..---",
        '3' to "...--",
        '4' to "....-",
        '5' to ".....",
        '6' to "-....",
        '7' to "--...",
        '8' to "---..",
        '9' to "----."
    )

    val unitsMap = hashMapOf<Char, MorseUnits>(
        'a' to arrayListOf(Token(TokenType.SYM, 1), Token(TokenType.SYM, 3)),
        'b' to arrayListOf(Token(TokenType.SYM, 3), Token(TokenType.SYM, 1), Token(TokenType.SYM, 1), Token(TokenType.SYM, 1)),
        'c' to arrayListOf(Token(TokenType.SYM, 3), Token(TokenType.SYM, 1), Token(TokenType.SYM, 3), Token(TokenType.SYM, 1)),
        'd' to arrayListOf(Token(TokenType.SYM, 3), Token(TokenType.SYM, 1), Token(TokenType.SYM, 1)),
        'e' to arrayListOf(Token(TokenType.SYM, 1)),
        'f' to arrayListOf(Token(TokenType.SYM, 1), Token(TokenType.SYM, 1), Token(TokenType.SYM, 3), Token(TokenType.SYM, 1)),
        'g' to arrayListOf(Token(TokenType.SYM, 3), Token(TokenType.SYM, 3), Token(TokenType.SYM, 1)),
        'h' to arrayListOf(Token(TokenType.SYM, 1), Token(TokenType.SYM, 1), Token(TokenType.SYM, 1), Token(TokenType.SYM, 1)),
        'i' to arrayListOf(Token(TokenType.SYM, 1), Token(TokenType.SYM, 1)),
        'j' to arrayListOf(Token(TokenType.SYM, 1), Token(TokenType.SYM, 3), Token(TokenType.SYM, 3), Token(TokenType.SYM, 3)),
        'k' to arrayListOf(Token(TokenType.SYM, 3), Token(TokenType.SYM, 1), Token(TokenType.SYM, 3)),
        'l' to arrayListOf(Token(TokenType.SYM, 1), Token(TokenType.SYM, 3), Token(TokenType.SYM, 1), Token(TokenType.SYM, 1)),
        'm' to arrayListOf(Token(TokenType.SYM, 3), Token(TokenType.SYM, 3)),
        'n' to arrayListOf(Token(TokenType.SYM, 3), Token(TokenType.SYM, 1)),
        'o' to arrayListOf(Token(TokenType.SYM, 3), Token(TokenType.SYM, 3), Token(TokenType.SYM, 3)),
        'p' to arrayListOf(Token(TokenType.SYM, 1), Token(TokenType.SYM, 3), Token(TokenType.SYM, 3), Token(TokenType.SYM, 1)),
        'q' to arrayListOf(Token(TokenType.SYM, 3), Token(TokenType.SYM, 3), Token(TokenType.SYM, 1), Token(TokenType.SYM, 3)),
        'r' to arrayListOf(Token(TokenType.SYM, 1), Token(TokenType.SYM, 3), Token(TokenType.SYM, 1)),
        's' to arrayListOf(Token(TokenType.SYM, 1), Token(TokenType.SYM, 1), Token(TokenType.SYM, 1)),
        't' to arrayListOf(Token(TokenType.SYM, 3)),
        'u' to arrayListOf(Token(TokenType.SYM, 1), Token(TokenType.SYM, 1), Token(TokenType.SYM, 3)),
        'v' to arrayListOf(Token(TokenType.SYM, 3), Token(TokenType.SYM, 3), Token(TokenType.SYM, 3), Token(TokenType.SYM, 1)),
        'w' to arrayListOf(Token(TokenType.SYM, 1), Token(TokenType.SYM, 3), Token(TokenType.SYM, 3)),
        'x' to arrayListOf(Token(TokenType.SYM, 3), Token(TokenType.SYM, 1), Token(TokenType.SYM, 1), Token(TokenType.SYM, 3)),
        'y' to arrayListOf(Token(TokenType.SYM, 3), Token(TokenType.SYM, 1), Token(TokenType.SYM, 3), Token(TokenType.SYM, 3)),
        'z' to arrayListOf(Token(TokenType.SYM, 3), Token(TokenType.SYM, 3), Token(TokenType.SYM, 1), Token(TokenType.SPACE, 1)),
        '0' to arrayListOf(Token(TokenType.SYM, 3), Token(TokenType.SYM, 3), Token(TokenType.SYM, 3), Token(TokenType.SYM, 3), Token(TokenType.SYM, 3)),
        '1' to arrayListOf(Token(TokenType.SYM, 1), Token(TokenType.SYM, 3), Token(TokenType.SYM, 3), Token(TokenType.SYM, 3), Token(TokenType.SYM, 3)),
        '2' to arrayListOf(Token(TokenType.SYM, 1), Token(TokenType.SYM, 1), Token(TokenType.SYM, 3), Token(TokenType.SYM, 3), Token(TokenType.SYM, 3)),
        '3' to arrayListOf(Token(TokenType.SYM, 1), Token(TokenType.SYM, 1), Token(TokenType.SYM, 1), Token(TokenType.SYM, 3), Token(TokenType.SYM, 3)),
        '4' to arrayListOf(Token(TokenType.SYM, 1), Token(TokenType.SYM, 1), Token(TokenType.SYM, 1), Token(TokenType.SYM, 1), Token(TokenType.SYM, 3)),
        '5' to arrayListOf(Token(TokenType.SYM, 1), Token(TokenType.SYM, 1), Token(TokenType.SYM, 1), Token(TokenType.SYM, 1), Token(TokenType.SYM, 1)),
        '6' to arrayListOf(Token(TokenType.SYM, 3), Token(TokenType.SYM, 1), Token(TokenType.SYM, 1), Token(TokenType.SYM, 1), Token(TokenType.SYM, 1)),
        '7' to arrayListOf(Token(TokenType.SYM, 3), Token(TokenType.SYM, 3), Token(TokenType.SYM, 1), Token(TokenType.SYM, 1), Token(TokenType.SYM, 1)),
        '8' to arrayListOf(Token(TokenType.SYM, 3), Token(TokenType.SYM, 3), Token(TokenType.SYM, 3), Token(TokenType.SYM, 1), Token(TokenType.SYM, 1)),
        '9' to arrayListOf(Token(TokenType.SYM, 3), Token(TokenType.SYM, 3), Token(TokenType.SYM, 3), Token(TokenType.SYM, 3), Token(TokenType.SYM, 1))
    )

    override fun getSymbol(char: Char): String{
        return symbolsMap.getOrDefault(char, "")
    }

    override fun getUnits(char: Char): MorseUnits{
        return unitsMap.getOrDefault(char, arrayListOf())
    }

    override fun isCharacter(char: Char): Boolean{
        return symbolsMap.containsKey(char)
    }
}