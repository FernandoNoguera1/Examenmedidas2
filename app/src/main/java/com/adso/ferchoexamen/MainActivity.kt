package com.adso.ferchoexamen

import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.adso.ferchoexamen.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(),OnClickListener {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.botonMm.setOnClickListener(this)
        binding.botonCm.setOnClickListener(this)
        binding.botonDm.setOnClickListener(this)
        binding.botonKm.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        var metros = binding.inputMetros.text.toString().toFloat()
        when(v){
            binding.botonMm->
                binding.equivalencia.text = (metros*1000).toString()

            binding.botonCm->
                binding.equivalencia.text = (metros*100).toString()

            binding.botonDm->
                binding.equivalencia.text = (metros/10).toString()

            binding.botonKm->
                binding.equivalencia.text = (metros/1000).toString()

        }
    }
}

