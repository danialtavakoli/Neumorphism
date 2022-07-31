package com.danialtavakoli.neumorphism

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.danialtavakoli.neumorphism.databinding.ActivityMain2Binding
import soup.neumorphism.ShapeType

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.neumorphImageViewBottom1.setOnClickListener {
            binding.neumorphImageViewBottom1.setShapeType(
                ShapeType.PRESSED
            )
        }
    }
}