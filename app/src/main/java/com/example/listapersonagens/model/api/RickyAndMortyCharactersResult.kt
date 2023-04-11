package com.example.listapersonagens.model.api

import com.example.listapersonagens.model.domain.Character

data class RickyAndMortyCharacters(
    val results: List<RickyAndMortyCharacter>
)

data class RickyAndMortyCharacter (
    val name: String,
    val image: String
){
    fun toCharacter(): Character {
        return Character(name = name, imageUrl = image)
    }
}
