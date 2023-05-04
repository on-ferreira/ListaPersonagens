package com.example.domain.mapper

import com.example.data.model.domain.Character
import com.example.data.model.api.DisneyCharacter
import com.example.data.model.api.RickyAndMortyCharacter

interface CharactersMapper<in T> {
    fun transform(apiCharacters: List<T>): List<Character>
}

class DisneyCharacterTransformer : CharactersMapper<DisneyCharacter> {
    override fun transform(apiCharacters: List<DisneyCharacter>): List<Character> {
        return apiCharacters.map {
            Character(
                name = it.name,
                imageUrl = it.imageUrl
            )
        }
    }
}

class RickyAndMortyCharacterTransformer : CharactersMapper<RickyAndMortyCharacter> {
    override fun transform(apiCharacters: List<RickyAndMortyCharacter>): List<Character> {
        return apiCharacters.map {
            Character(
                name = it.name,
                imageUrl = it.image
            )
        }
    }
}
