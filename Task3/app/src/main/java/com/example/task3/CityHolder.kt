package com.example.task3

import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.RequestManager
import com.example.task3.databinding.ItemCityBinding

class CityHolder(
    private val binding: ItemCityBinding,
    private val glide: RequestManager,
    private val onItemClick: (City) -> Unit,
    ) : RecyclerView.ViewHolder(binding.root) {

    fun onBind(city: City) {
        with(binding) {
            tvName.text = city.name
            tvDescr.text = city.description
            root.setOnClickListener {
                onItemClick(city)
            }
            glide
                .load(city.url)
                .into(ivIm)
        }
    }
}