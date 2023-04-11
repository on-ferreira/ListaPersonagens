package com.example.listapersonagens.model.domain

data class Character (
    val name: String,
    val imageUrl: String
)

/*

Princípio de Responsabilidade Única (SRP)

Como essa classe não vai representar os characters dos dois universos ao mesmo tempo, ela só vai ter
uma responsabilidade, respeitando os principios do SRP.

 */