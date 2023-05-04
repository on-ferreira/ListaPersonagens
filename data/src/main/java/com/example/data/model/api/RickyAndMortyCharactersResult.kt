package com.example.data.model.api

import com.example.domain.domain.Character

data class RickyAndMortyCharacters(
    val results: List<RickyAndMortyCharacter>
)

data class RickyAndMortyCharacter (
    val name: String,
    val image: String
){
    fun toCharacter(): com.example.domain.domain.Character {
        return com.example.domain.domain.Character(name = name, imageUrl = image)
    }
}
