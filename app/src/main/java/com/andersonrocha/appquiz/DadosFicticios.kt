package com.andersonrocha.appquiz

class DadosFicticios {

    companion object{
        fun recuperarListaPerguntas() : Array<Pergunta>{
            val pergunta1 = Pergunta(
                1, "Qual foi a duração do primeiro vídeo do YouTube?",
                "3 minutos", "1 minuto", "18 segundos",
                3
            )

            val pergunta2 = Pergunta(
                1, "Quantas pesquisas totalmente novas são feitas no Google todo dia?",
                "450 milhões", "1 bilhão", "10 bilhões",
                1
            )

            val pergunta3 = Pergunta(
                1, "Qual foi a primeira rede social da história da internet?",
                "MySpace", "ClassMate", "Orkut",
                2
            )

            val pergunta4 = Pergunta(
                1, "Quantos Bits cabem em um Byte?",
                "1 bit", "4 bits", "8 bits",
                3
            )

            return arrayOf(pergunta1, pergunta2, pergunta3, pergunta4)
        }
    }

}