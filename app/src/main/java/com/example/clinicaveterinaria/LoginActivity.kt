package com.example.clinicaveterinaria

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.example.clinicaveterinaria.databinding.ActivityCadastroUserBinding
import com.example.clinicaveterinaria.databinding.ActivityLoginBinding
import com.google.android.material.textfield.TextInputEditText
import com.example.clinicaveterinaria.MenuActivity

private lateinit var binding:ActivityLoginBinding


class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.loguBtnLogar.setOnClickListener {
            val intent = Intent(this, MenuActivity::class.java)
            //enviando dados
            //intent.putExtra("email", binding.loguItxtEmail.text.toString())
            //intent.putExtra("senha", binding.loguItxtSenha.text.toString())
            //iniciando a activity
            startActivity(intent)
        }
        binding.loguBtnCancelar.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onRestart() {
        super.onRestart()
        binding.loguItxtEmail.setText("")
        binding.loguItxtSenha.setText("")
    }
}