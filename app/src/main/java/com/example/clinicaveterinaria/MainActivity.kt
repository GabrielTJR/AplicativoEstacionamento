package com.example.clinicaveterinaria

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.clinicaveterinaria.databinding.ActivityCadastroUserBinding
import com.example.clinicaveterinaria.databinding.ActivityMainBinding

public var Diario = false
public var Mensal = false

private lateinit var binding:ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

//        setContentView(R.layout.activity_main)
//        logBtnCadastrar = findViewById(R.id.logu_btn_cadastrar2)
//        logBtnEntrar = findViewById(R.id.logu_btn_entrar)

        binding.mainBtnEntrar.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

        binding.mainBtnCadastrar.setOnClickListener {
            val intent = Intent(this, CadastroUserActivity::class.java)
            startActivity(intent)
        }
    }


}