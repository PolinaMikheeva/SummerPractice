package com.example.task3

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.task3.databinding.FragmentMainBinding

class MainFragment : Fragment(R.layout.fragment_main) {

    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentMainBinding.bind(view)

        with(binding) {

            btnCities.setOnClickListener {
                findNavController().navigate(
                    R.id.action_mainFragment_to_citiesFragment)
            }

        }
    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }
}