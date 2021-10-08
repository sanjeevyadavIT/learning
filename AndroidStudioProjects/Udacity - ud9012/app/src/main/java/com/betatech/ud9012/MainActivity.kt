package com.betatech.ud9012

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.betatech.ud9012.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rollBtn.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice() {
        val randomInt = Random.nextInt(6) + 1
        binding.diceIv.setImageResource(getDiceImage(randomInt))
    }

    private fun getDiceImage(randomInt: Int): Int  = when(randomInt) {
        1 -> R.drawable.dice_1
        2 -> R.drawable.dice_2
        3 -> R.drawable.dice_3
        4 -> R.drawable.dice_4
        5 -> R.drawable.dice_5
        6 -> R.drawable.dice_6
        else -> R.drawable.empty_dice
    }
}