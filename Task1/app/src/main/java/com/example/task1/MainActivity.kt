package com.example.task1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun main(view: View) {

        val h = findViewById<TextView>(R.id.Height).text.toString()
        val w = findViewById<TextView>(R.id.Weight).text.toString()
        val a = findViewById<TextView>(R.id.Age).text.toString()

        val name = findViewById<TextView>(R.id.Name).text.toString()
        val height = Integer.parseInt(h)
        val weight = w.toDouble()
        val age = Integer.parseInt(a)
        val btn = findViewById<Button>(R.id.button)

        if (name.isEmpty() || h.isEmpty() || w.isEmpty() || a.isEmpty()) {
            btn.setOnClickListener() {
                var result = findViewById<TextView>(R.id.Salary)
                result.text = "Данные не введены"
            }
        } else if (name.isNotEmpty() && height in 1..250 && (weight > 0 && weight < 250) && age in 1..150) {
            var salary = (height + weight) * age * name.length
            btn.setOnClickListener(){
                var result = findViewById<TextView>(R.id.Salary)
                result.text = salary.toString()
            }
        } else {
            btn.setOnClickListener() {
                var result = findViewById<TextView>(R.id.Salary)
                result.text = "Данные введены некорректно"
            }
        }
    }
}