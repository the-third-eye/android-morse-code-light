package com.thethirdeye.android_morse_code_light.utils

object AmericanMorseStandard: MorseStandard {
    private val symbolsMap = hashMapOf<Char,String>(
        'a' to ".-",
        'b' to "-...",
        'c' to ".. .",
        'd' to "-..",
        'e' to ".",
        'f' to ".-.",
        'g' to "--.",
        'h' to "....",
        'i' to "..",
        'j' to "-.-.",
        'k' to "-.-",
        'l' to "–",
        'm' to "--",
        'n' to "-.",
        'o' to ". .",
        'p' to ".....",
        'q' to "..-.",
        'r' to ". ..",
        's' to "...",
        't' to "-",
        'u' to "..-",
        'v' to "...-",
        'w' to ".--",
        'x' to ".-..",
        'y' to ".. ..",
        'z' to "... .",
        '0' to "—",
        '1' to ".--.",
        '2' to "..-..",
        '3' to "...-.",
        '4' to "....-",
        '5' to "---",
        '6' to "......",
        '7' to "--..",
        '8' to "-....",
        '9' to "-..-"
    )

    private val unitsMap = hashMapOf<Char, MorseUnits>(
        'a' to arrayListOf(Token(TokenType.SYM, 1), Token(TokenType.SYM, 2)),
        'b' to arrayListOf(Token(TokenType.SYM, 2), Token(TokenType.SYM, 1), Token(TokenType.SYM, 1), Token(TokenType.SYM, 1)),
        'c' to arrayListOf(Token(TokenType.SYM, 1), Token(TokenType.SYM, 1), Token(TokenType.SPACE, 1), Token(TokenType.SYM, 1)),
        'd' to arrayListOf(Token(TokenType.SYM, 2), Token(TokenType.SYM, 1), Token(TokenType.SYM, 1)),
        'e' to arrayListOf(Token(TokenType.SYM, 1)),
        'f' to arrayListOf(Token(TokenType.SYM, 1), Token(TokenType.SYM, 2), Token(TokenType.SYM, 1)),
        'g' to arrayListOf(Token(TokenType.SYM, 2), Token(TokenType.SYM, 2), Token(TokenType.SYM, 1)),
        'h' to arrayListOf(Token(TokenType.SYM, 1), Token(TokenType.SYM, 1), Token(TokenType.SYM, 1), Token(TokenType.SYM, 1)),
        'i' to arrayListOf(Token(TokenType.SYM, 1), Token(TokenType.SYM, 1)),
        'j' to arrayListOf(Token(TokenType.SYM, 2), Token(TokenType.SYM, 1), Token(TokenType.SYM, 2), Token(TokenType.SYM, 1)),
        'k' to arrayListOf(Token(TokenType.SYM, 2), Token(TokenType.SYM, 1), Token(TokenType.SYM, 2)),
        'l' to arrayListOf(Token(TokenType.SYM, 4)),
        'm' to arrayListOf(Token(TokenType.SYM, 2), Token(TokenType.SYM, 2)),
        'n' to arrayListOf(Token(TokenType.SYM, 2), Token(TokenType.SYM, 1)),
        'o' to arrayListOf(Token(TokenType.SYM, 1), Token(TokenType.SPACE, 2), Token(TokenType.SYM, 1)),
        'p' to arrayListOf(Token(TokenType.SYM, 1), Token(TokenType.SYM, 1), Token(TokenType.SYM, 1), Token(TokenType.SYM, 1), Token(TokenType.SYM, 1)),
        'q' to arrayListOf(Token(TokenType.SYM, 1), Token(TokenType.SYM, 1), Token(TokenType.SYM, 2), Token(TokenType.SYM, 1)),
        'r' to arrayListOf(Token(TokenType.SYM, 1), Token(TokenType.SPACE, 1), Token(TokenType.SYM, 1), Token(TokenType.SYM, 1)),
        's' to arrayListOf(Token(TokenType.SYM, 1), Token(TokenType.SYM, 1), Token(TokenType.SYM, 1)),
        't' to arrayListOf(Token(TokenType.SYM, 2)),
        'u' to arrayListOf(Token(TokenType.SYM, 1), Token(TokenType.SYM, 1), Token(TokenType.SYM, 2)),
        'v' to arrayListOf(Token(TokenType.SYM, 1), Token(TokenType.SYM, 1), Token(TokenType.SYM, 1), Token(TokenType.SYM, 2)),
        'w' to arrayListOf(Token(TokenType.SYM, 1), Token(TokenType.SYM, 2), Token(TokenType.SYM, 2)),
        'x' to arrayListOf(Token(TokenType.SYM, 1), Token(TokenType.SYM, 2), Token(TokenType.SYM, 1), Token(TokenType.SYM, 1)),
        'y' to arrayListOf(Token(TokenType.SYM, 1), Token(TokenType.SYM, 1), Token(TokenType.SPACE, 1), Token(TokenType.SYM, 1), Token(TokenType.SYM, 1)),
        'z' to arrayListOf(Token(TokenType.SYM, 1), Token(TokenType.SYM, 1), Token(TokenType.SYM, 1), Token(TokenType.SPACE, 1), Token(TokenType.SYM, 1)),
        '0' to arrayListOf(Token(TokenType.SYM, 5)),
        '1' to arrayListOf(Token(TokenType.SYM, 1), Token(TokenType.SYM, 2), Token(TokenType.SYM, 2), Token(TokenType.SYM, 1)),
        '2' to arrayListOf(Token(TokenType.SYM, 1), Token(TokenType.SYM, 1), Token(TokenType.SYM, 2), Token(TokenType.SYM, 1), Token(TokenType.SYM, 1)),
        '3' to arrayListOf(Token(TokenType.SYM, 1), Token(TokenType.SYM, 1), Token(TokenType.SYM, 1), Token(TokenType.SYM, 2), Token(TokenType.SYM, 1)),
        '4' to arrayListOf(Token(TokenType.SYM, 1), Token(TokenType.SYM, 1), Token(TokenType.SYM, 1), Token(TokenType.SYM, 1), Token(TokenType.SYM, 2)),
        '5' to arrayListOf(Token(TokenType.SYM, 2), Token(TokenType.SYM, 2), Token(TokenType.SYM, 2)),
        '6' to arrayListOf(Token(TokenType.SYM, 1), Token(TokenType.SYM, 1), Token(TokenType.SYM, 1), Token(TokenType.SYM, 1), Token(TokenType.SYM, 1), Token(TokenType.SYM, 1)),
        '7' to arrayListOf(Token(TokenType.SYM, 2), Token(TokenType.SYM, 2), Token(TokenType.SYM, 1), Token(TokenType.SYM, 1)),
        '8' to arrayListOf(Token(TokenType.SYM, 2), Token(TokenType.SYM, 1), Token(TokenType.SYM, 1), Token(TokenType.SYM, 1), Token(TokenType.SYM, 1)),
        '9' to arrayListOf(Token(TokenType.SYM, 2), Token(TokenType.SYM, 1), Token(TokenType.SYM, 1), Token(TokenType.SYM, 2))
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