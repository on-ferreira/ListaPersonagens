package com.example.listapersonagens.network.authentication

import com.example.listapersonagens.model.domain.User

object RegisteredUsers {

    val backend = listOf(
        User("teste3@gmail.com", "789"),
        User("teste4@gmail.com", "123")
    )

    val firebase = listOf(
        User("teste1@gmail.com", "123"),
        User("teste2@gmail.com", "456")
    )

}