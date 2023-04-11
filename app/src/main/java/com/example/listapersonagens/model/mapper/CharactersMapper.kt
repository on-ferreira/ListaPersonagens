package com.example.listapersonagens.model.mapper

import com.example.listapersonagens.model.domain.Character
import com.example.listapersonagens.model.api.DisneyCharacter
import com.example.listapersonagens.model.api.RickyAndMortyCharacter

// Antes
//@JvmName("toDisneyDomain")
//fun List<DisneyCharacter>.toDomain(): List<Character> {
//    return this.map {
//        Character(
//            name = it.name,
//            imageUrl = it.imageUrl
//        )
//    }
//}
//
//@JvmName("toRickyAndMortyDomain")
//fun List<RickyAndMortyCharacter>.toDomain(): List<Character> {
//    return this.map {
//        Character(
//            name = it.name,
//            imageUrl = it.image
//        )
//    }
//}

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

/* Motivo da mudança
Responsabilidade Única (SRP)
SRP: A classe atualmente tem duas responsabilidades: transformar listas de DisneyCharacter e
RickyAndMortyCharacter em listas de Character. Para seguir o SRP, podemos separar essas duas
responsabilidades em classes diferentes.

Aberto/Fechado (OCP):
OCP: Para permitir a extensão da classe sem modificação, podemos utilizar o polimorfismo, criando
uma interface CharacterTransformer que define um método para transformar uma lista de personagens
de uma API em uma lista de personagens de domínio. Em seguida, podemos criar duas classes que
implementam essa interface: DisneyCharacterTransformer e RickyAndMortyCharacterTransformer.

 */