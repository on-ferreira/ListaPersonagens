package com.example.data.network.authentication

import com.example.data.model.User
import com.example.data.network.LoginService

object BackendAuthenticator {
    
    private val registeredUsers = listOf(
        com.example.data.model.User("teste3@gmail.com", "789"),
        com.example.data.model.User("teste4@gmail.com", "123")
    )

    fun login(email: String, password: String): Boolean =
        registeredUsers.any { it.email == email && it.password == password }

}
