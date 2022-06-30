package com.example.task1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun main() {

        val name = findViewById<TextView>(R.id.Name)
        val height = findViewById<TextView>(R.id.Height)
        val weight = findViewById<TextView>(R.id.Weight)
        val age = findViewById<TextView>(R.id.Age)
        var salary = (Integer.parseInt(height.text.toString()) + Integer.parseInt(weight.text.toString())) * Integer.parseInt(age.text.toString()) * Integer.parseInt(name.length().toString())
        val btn = findViewById<Button>(R.id.button)
        btn.setOnClickListener(){
            var result = findViewById<TextView>(R.id.Salary)
            result.setText(Integer.toString(salary));
        }
    }
}