package com.example.clinicaveterinaria

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.clinicaveterinaria.databinding.ActivityComprasBinding

private lateinit var binding:ActivityComprasBinding

class ComprasActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityComprasBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.comprasBtnVoltar.setOnClickListener {
            finish()
        }
        val meuTextView = findViewById<TextView>(R.id.compras_text_plano)
        val TextoDiario = "Possui pagamento diário"
        val TextoMensal = "Possui pagamento mensal"
        val TextoNada = "Não foi obtido nada"
        if(Diario == true){
            trocarTextoDoTextView(meuTextView, TextoDiario)
        }else if(Mensal == true){
            trocarTextoDoTextView(meuTextView, TextoMensal)
        }else{
            trocarTextoDoTextView(meuTextView, TextoNada)
        }
    }
    fun trocarTextoDoTextView(textView: TextView, novoTexto: String){
        textView.text = novoTexto
    }
}