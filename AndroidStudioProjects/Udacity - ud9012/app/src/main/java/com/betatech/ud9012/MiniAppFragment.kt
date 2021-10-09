package com.betatech.ud9012

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.betatech.ud9012.databinding.FragmentMiniAppBinding

/**
 * A simple [Fragment] subclass.
 * Use the [MiniAppFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class MiniAppFragment : Fragment() {

    private var _binding: FragmentMiniAppBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentMiniAppBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.diceRollerBtn.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_miniAppFragment_to_diceRollerFragment))
        binding.triviaBtn.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_miniAppFragment_to_gameFragmentFragment))
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @return A new instance of fragment MiniAppFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) = MiniAppFragment()
    }
}