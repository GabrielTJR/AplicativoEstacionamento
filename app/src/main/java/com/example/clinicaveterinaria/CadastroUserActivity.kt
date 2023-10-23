package com.example.clinicaveterinaria

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.clinicaveterinaria.databinding.ActivityCadastroUserBinding
import com.google.android.material.textfield.TextInputEditText

private lateinit var binding:ActivityCadastroUserBinding


class CadastroUserActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCadastroUserBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.caduBtnCadastrar.setOnClickListener {
            //criando intent e instanciando
            val intent = Intent(this, MenuActivity::class.java)
            //criando usuario java
//            val user1 = UsuarioKotlin(binding.caduItxtNome.text.toString(), binding.caduItxtEmail.text.toString(),
//                binding.caduItxtSenha.text.toString(), binding.caduItxtFone.text.toString())
//
//            //enviado usuário
//            intent.putExtra("user1", user1)
            //iniciando activity
            startActivity(intent)
        }

        binding.caduBtnCancelar.setOnClickListener {
            finish()
        }

    }

    override fun onRestart() {
        super.onRestart()
//        binding.caduTxtiNome = findViewById(R.id.cadu_itxt_nome)
//        binding.caduTxtiEmail = findViewById(R.id.cadu_itxt_email)
//        binding.caduTxtiSenha = findViewById(R.id.cadu_itxt_senha)
//        binding.caduTxtiTelefone = findViewById(R.id.cadu_itxt_fone)
//        binding.caduTxtiNome.setText("")
//        binding.caduTxtiEmail.setText("")
//        binding.caduTxtiSenha.setText("")
//        binding.caduTxtiTelefone.setText("")
        binding.caduItxtNome.setText("")
        binding.caduItxtEmail.setText("")
        binding.caduItxtSenha.setText("")
        binding.caduItxtFone.setText("")
    }
}