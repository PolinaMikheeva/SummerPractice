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

        val name = Integer.parseInt(findViewById<TextView>(R.id.Name).length().toString())
        val height = Integer.parseInt(findViewById<TextView>(R.id.Height).text.toString())
        val weight = Integer.parseInt(findViewById<TextView>(R.id.Weight).text.toString())
        val age = Integer.parseInt(findViewById<TextView>(R.id.Age).text.toString())
        val btn = findViewById<Button>(R.id.button)
        if (name in 1..50) {
            if (height in 1..250) {
                if (weight in 1..250) {
                    if (age in 1..150) {
                        var salary = (height + weight) * age * name
                        btn.setOnClickListener(){
                            var result = findViewById<TextView>(R.id.Salary)
                            result.setText(Integer.toString(salary))
                        }
                    } else {
                        btn.setOnClickListener(){
                            var result = findViewById<TextView>(R.id.Salary)
                            result.setText("Данные введены некорректно")
                        }
                    }
                } else {
                    btn.setOnClickListener(){
                        var result = findViewById<TextView>(R.id.Salary)
                        result.setText("Данные введены некорректно")
                    }
                }
            } else {
                btn.setOnClickListener(){
                    var result = findViewById<TextView>(R.id.Salary)
                    result.setText("Данные введены некорректно")
                }
            }
        } else {
            btn.setOnClickListener(){
                var result = findViewById<TextView>(R.id.Salary)
                result.setText("Данные введены некорректно")
            }
        }

    }
}