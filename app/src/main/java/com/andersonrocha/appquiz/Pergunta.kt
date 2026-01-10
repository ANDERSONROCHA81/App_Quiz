package com.andersonrocha.appquiz

data class Pergunta(
    val codigo: Int,
    val titulo: String,
    val resposta01: String,
    val resposta02: String,
    val resposta03: String,
    val respostaCerta: Int,
)
