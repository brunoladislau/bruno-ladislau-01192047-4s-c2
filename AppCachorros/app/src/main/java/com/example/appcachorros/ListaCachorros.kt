package com.example.appcachorros

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ListaCachorros : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_cachorros)

        val layoutLista1: LinearLayout = findViewById(R.id.layout_lista1)
        val layoutLista2: LinearLayout = findViewById(R.id.layout_lista2)

        val apiCachorros = ConexaoApiCachorros.criar()

        apiCachorros.get().enqueue(object : Callback<List<Cachorro>> {

            override fun onResponse(call: Call<List<Cachorro>>, response: Response<List<Cachorro>>) {

                response.body()?.forEach {

                    val cachorro = TextView(baseContext)
                    cachorro.text = "Raça: ${it.raca} Preço Médio: ${it.precoMedio}"
                    cachorro.setTextColor(Color.parseColor("#9911AA"))

                    if (it.indicadoCriancas == true){
                        layoutLista1.addView(cachorro)
                    } else {
                        layoutLista2.addView(cachorro)
                    }
                }
            }

            override fun onFailure(call: Call<List<Cachorro>>, t: Throwable) {
                Toast.makeText(baseContext, "Erro na chamada: ${t.message!!}", Toast.LENGTH_LONG).show()
            }
        })
    }
}