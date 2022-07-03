package com.example.task3

import android.content.Context
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.bumptech.glide.Glide
import com.example.task3.databinding.FragmentCitiesBinding

class CitiesFragment : Fragment(R.layout.fragment_cities) {

    private var _binding: FragmentCitiesBinding? = null
    private val binding get() = _binding!!

    private var adapter: CityAdapter? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentCitiesBinding.bind(view)

//        val text = arguments?.getString(ARG_TEXT).orEmpty()
        initAdapter()
    }

    private fun initAdapter() {
        adapter = CityAdapter(
            CityRepository.cities,
            Glide.with(this)
        ) {
            binding.root.showSnackbar("${it.name}: ${it.description}")
        }
        binding.tvCities.setOnClickListener {
            CityRepository.cities.removeAt(0)
            adapter?.updateData(CityRepository.cities)
        }
        binding.rvCities.adapter = adapter

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}