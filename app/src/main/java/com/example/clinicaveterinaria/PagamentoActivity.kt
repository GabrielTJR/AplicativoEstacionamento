package com.example.clinicaveterinaria

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.Toast
import com.example.clinicaveterinaria.databinding.ActivityLoginBinding
import com.example.clinicaveterinaria.databinding.ActivityPagamentoBinding

private lateinit var binding: ActivityPagamentoBinding

class PagamentoActivity :AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPagamentoBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val radioButtonCredito = findViewById<RadioButton>(R.id.pag_btn_credito)
        val radioButtonDebito = findViewById<RadioButton>(R.id.pag_btn_debito)
        val radioButtonPix = findViewById<RadioButton>(R.id.pag_btn_pix)

        radioButtonCredito.setOnClickListener {
            radioButtonCredito.isChecked = true
            radioButtonDebito.isChecked = false
            radioButtonPix.isChecked = false
        }

        radioButtonDebito.setOnClickListener {
            radioButtonDebito.isChecked = true
            radioButtonCredito.isChecked = false
            radioButtonPix.isChecked = false
        }

        radioButtonPix.setOnClickListener {
            radioButtonPix.isChecked = true
            radioButtonCredito.isChecked = false
            radioButtonDebito.isChecked = false
        }

        binding.pagBtnPagar.setOnClickListener {
            if (radioButtonCredito.isChecked || radioButtonDebito.isChecked || radioButtonPix.isChecked) {
                val intent = Intent(this, MenuActivity::class.java)
//                if(radioButtonCredito.isChecked){
//
//                }else if(radioButtonDebito.isChecked){
//
//                } else{
//
//                }

                startActivity(intent)
            } else {
                showToast("Por favor, selecione uma opção antes de confirmar.")
            }
        }

        binding.pagBtnSair.setOnClickListener {
            val intent = Intent(this, MenuActivity::class.java)
            Mensal = false
            Diario = false
            startActivity(intent)
        }
    }


    fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}