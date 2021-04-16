package com.example.appcachorros

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class TelaCadastro : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_cadastro)
    }

    fun cadastrarCachorro(view: View) {
        val apiCachorros = ConexaoApiCachorros.criar()

        /*val cachorroCad = Cachorro()

        apiCachorros.post()*/
    }
}