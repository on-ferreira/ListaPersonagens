package com.example.listapersonagens.model.api

import com.example.listapersonagens.model.domain.Character


data class DisneyCharactersResult(
    val data: List<DisneyCharacter>
)

data class DisneyCharacter(
    val name: String,
    val imageUrl: String
){
    fun toCharacter(): Character {
        return Character(name = name, imageUrl = imageUrl)
    }
}
