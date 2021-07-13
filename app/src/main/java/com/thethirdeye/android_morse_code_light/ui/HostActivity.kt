package com.thethirdeye.android_morse_code_light.ui

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import com.thethirdeye.android_morse_code_light.utils.MorseCharacter
import com.thethirdeye.android_morse_code_light.utils.MorseStandard
import com.thethirdeye.android_morse_code_light.utils.MorseUnits
import com.thethirdeye.android_morse_code_light.utils.MorseWord

class HostActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)

        var mC = MorseCharacter('a',object:MorseStandard{
            override fun getSymbol(character: Char): String {
                TODO("Not yet implemented")
            }

            override fun getUnits(character: Char): MorseUnits {
                TODO("Not yet implemented")
            }

            override fun isCharacter(character: Char): Boolean {
                TODO("Not yet implemented")
            }
        })

        mC.character


        var mW = MorseWord("jello",object:MorseStandard{
            override fun getSymbol(character: Char): String {
                TODO("Not yet implemented")
            }

            override fun getUnits(character: Char): MorseUnits {
                TODO("Not yet implemented")
            }

            override fun isCharacter(character: Char): Boolean {
                TODO("Not yet implemented")
            }
        })


    }

}