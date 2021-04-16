package com.example.appcachorros

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun cadastrar(view: View) {
        val telaCadastro = Intent(this, TelaCadastro::class.java)
        startActivity(telaCadastro)
    }
    fun listar(view: View) {
        val listaCachorros = Intent(this, ListaCachorros::class.java)
        startActivity(listaCachorros)
    }
}