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

    val n = findViewById<TextView>(R.id.Name).text.toString()
    val h = findViewById<TextView>(R.id.Height).text.toString()
    val w = findViewById<TextView>(R.id.Weight).text.toString()
    val a = findViewById<TextView>(R.id.Age).text.toString()
    val btn = findViewById<Button>(R.id.button)

    fun emptyCheck() {
        if (n.isEmpty() || h.isEmpty() || w.isEmpty() || a.isEmpty()) {
            btn.setOnClickListener() {
                var result = findViewById<TextView>(R.id.Salary)
                result.text = "Данные не введены"
            }
        }
    }

    fun main(view: View) {

        emptyCheck()

        val name = n
        val height = h.toInt()
        val weight = w.toDouble()
        val age = a.toInt()

        if (height in 1..250 && (weight > 0 && weight < 250) && age in 1..150) {
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