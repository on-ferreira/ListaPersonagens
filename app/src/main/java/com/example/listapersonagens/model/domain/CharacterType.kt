package com.example.listapersonagens.model.domain

import androidx.annotation.ColorRes
import com.example.listapersonagens.R

//Antes
// enum class CharacterType(
//    val title: String,
//    val imageUrl: String,
//    @ColorRes val colorRes: Int,
//) {
//    DISNEY(
//        title = "Disney",
//        imageUrl = "https://icon-library.com/images/disney-icon-png/disney-icon-png-20.jpg",
//        colorRes = R.color.red_disney
//    ),
//    RICKY_AND_MORTY(
//        title = "Ricky And Morty",
//        imageUrl = "https://logosmarcas.net/wp-content/uploads/2022/01/Rick-And-Morty-Logo.png",
//        colorRes = R.color.blue_ricky_and_morty
//    )
//}

interface CharacterType {
    val title: String
    val imageUrl: String

    @get:ColorRes
    val colorRes: Int
}

object DISNEY : CharacterType {
    override val title = "Disney"
    override val imageUrl = "https://icon-library.com/images/disney-icon-png/disney-icon-png-20.jpg"
    override val colorRes = R.color.red_disney
}

object RICKY_AND_MORTY : CharacterType {
    override val title = "Ricky And Morty"
    override val imageUrl =
        "https://logosmarcas.net/wp-content/uploads/2022/01/Rick-And-Morty-Logo.png"
    override val colorRes = R.color.blue_ricky_and_morty
}

data class DisneyCharacter (
    val name: String,
    val image: String
) : CharacterType by DISNEY

data class RickyAndMortyCharacter (
    val name: String,
    val image: String
) : CharacterType by RICKY_AND_MORTY

/*
O princípio Aberto/Fechado indica que um módulo ou classe deve ser aberto para extensão, mas
fechado para modificação. Podemos aplicar esse princípio à enumeração CharacterType. Em vez de
codificar diretamente os valores de título, URL da imagem e cor para cada universo, podemos criar
uma interface que define essas propriedades e, em seguida, criar objetos específicas para cada
universo de personagem.

 */