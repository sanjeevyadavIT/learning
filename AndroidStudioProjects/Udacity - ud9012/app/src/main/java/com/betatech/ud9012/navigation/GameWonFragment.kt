package com.betatech.ud9012.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.betatech.ud9012.R
import com.betatech.ud9012.databinding.FragmentGameBinding
import com.betatech.ud9012.databinding.FragmentGameWonBinding

class GameWonFragment : Fragment() {

    private var _binding: FragmentGameWonBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentGameWonBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.homeBtn.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_gameWonFragment_to_miniAppFragment))
    }

    companion object {
        @JvmStatic
        fun newInstance() =
            GameWonFragment()
    }
}