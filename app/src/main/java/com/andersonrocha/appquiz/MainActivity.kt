package com.andersonrocha.appquiz

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var editNome: EditText
    private lateinit var btnIniciar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        editNome = findViewById(R.id.edit_nome)
        btnIniciar = findViewById(R.id.btn_iniciar)

        btnIniciar.setOnClickListener {
            val nome = editNome.text.toString()

            if(nome.isNotEmpty()){
                val intent = Intent(this, PerguntasActivity::class.java)
                intent.putExtra("nome_usuario", nome)

                startActivity(intent)
            }else{
                Toast.makeText(this, "Preencha o nome", Toast.LENGTH_SHORT).show()
            }
        }
    }
}