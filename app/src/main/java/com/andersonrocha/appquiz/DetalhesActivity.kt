package com.andersonrocha.appquiz

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DetalhesActivity : AppCompatActivity() {

    private lateinit var textTotalRespostas: TextView
    private lateinit var btnReiniciar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detalhes)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        textTotalRespostas = findViewById(R.id.text_total_respostas)
        btnReiniciar = findViewById(R.id.btn_reiniciar)

        val bundle = intent.extras
        val respostasCertas = bundle?.getInt("total_respostas_corretas") ?: 0

        textTotalRespostas.text = "Respostas corretas: $respostasCertas"

        btnReiniciar.setOnClickListener {
            finish()
        }
    }
}