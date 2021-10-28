package com.example.affirmations.data


import com.example.affirmations.model.Affirmation
import com.example.affirmations.R


class Datasource {
    fun loadAffirmations():List<Affirmation>{
        return listOf<Affirmation>( //List Of cria uma lista - <>Isto aqui é um Generics, permite retornar uma lista de qlq objeto
            Affirmation(R.string.affirmation1),
            Affirmation(R.string.affirmation2),
            Affirmation(R.string.affirmation3),
            Affirmation(R.string.affirmation4),
            Affirmation(R.string.affirmation5),
            Affirmation(R.string.affirmation6),
            Affirmation(R.string.affirmation7),
            Affirmation(R.string.affirmation8),
            Affirmation(R.string.affirmation9),
            Affirmation(R.string.affirmation10)
        )
    }
}