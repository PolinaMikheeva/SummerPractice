package com.example.task1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import java.lang.Math.ceil

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun main(view: View) {
        val name = findViewById<TextView>(R.id.Name).text.toString().length
        val height = Integer.parseInt(findViewById<TextView>(R.id.Height).text.toString())
        val weight = Integer.parseInt(findViewById<TextView>(R.id.Weight).text.toString()).toDouble()
        val age = Integer.parseInt(findViewById<TextView>(R.id.Age).text.toString())
        val btn = findViewById<Button>(R.id.button)
        if (name in 1..50) {
            if (height in 1..250) {
                if (weight in 1.0..250.0) {
                    if (age in 1..150) {
                        var salary = (height + ceil(weight)) * age * name
                        btn.setOnClickListener(){
                            var result = findViewById<TextView>(R.id.Salary)
                            result.setText(salary.toString())
                        }
                    } else {
                        errorData()
                    }
                } else {
                    errorData()
                }
            } else {
                errorData()
            }
        } else {
            errorData()
        }

    }
    fun errorData(){
        val btn = findViewById<Button>(R.id.button)
        btn.setOnClickListener() {
            var result = findViewById<TextView>(R.id.Salary)
            result.setText("Данные введены некорректно")
        }
    }
}