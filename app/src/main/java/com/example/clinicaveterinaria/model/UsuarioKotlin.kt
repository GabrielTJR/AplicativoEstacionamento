package com.example.clinicaveterinaria

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class UsuarioKotlin(val nome:String,
                  val email:String,
                  val senha:String,
                  val telefone:String):Parcelable