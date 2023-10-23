package com.example.clinicaveterinaria

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.clinicaveterinaria.databinding.ActivityMenuBinding

private lateinit var binding: ActivityMenuBinding

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMenuBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.menuBtnServico.setOnClickListener {
            val intent = Intent(this, ServicosActivity::class.java)
            startActivity(intent)
        }

        binding.menuBtnCompras.setOnClickListener {
            val intent = Intent(this, ComprasActivity::class.java)
            startActivity(intent)
        }


        binding.menuBtnSair.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
