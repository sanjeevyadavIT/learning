package com.betatech.ud9012.diceroller

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.betatech.ud9012.R
import com.betatech.ud9012.databinding.FragmentDiceRollerBinding
import kotlin.random.Random

/**
 * A simple [Fragment] subclass.
 * Use the [DiceRollerFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class DiceRollerFragment : Fragment() {

    private var _binding: FragmentDiceRollerBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentDiceRollerBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.rollBtn.setOnClickListener {
            rollDice()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @return A new instance of fragment DiceRollerFragment.
         */
        @JvmStatic
        fun newInstance() = DiceRollerFragment()
    }

    private fun rollDice() {
        val randomInt = Random.nextInt(6) + 1
        binding.diceIv.setImageResource(getDiceImage(randomInt))
    }

    private fun getDiceImage(randomInt: Int): Int = when (randomInt) {
        1 -> R.drawable.dice_1
        2 -> R.drawable.dice_2
        3 -> R.drawable.dice_3
        4 -> R.drawable.dice_4
        5 -> R.drawable.dice_5
        6 -> R.drawable.dice_6
        else -> R.drawable.empty_dice
    }
}