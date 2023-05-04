package com.example.data.model.api

import com.example.domain.domain.Character


data class DisneyCharactersResult(
    val data: List<DisneyCharacter>
)

data class DisneyCharacter(
    val name: String,
    val imageUrl: String
){
    fun toCharacter(): com.example.domain.domain.Character {
        return com.example.domain.domain.Character(name = name, imageUrl = imageUrl)
    }
}
