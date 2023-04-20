package com.example.listapersonagens.network.authentication

import com.example.listapersonagens.model.User
import com.example.listapersonagens.network.LoginService

val registeredUsers = listOf(
    User("teste@teste.com", "123"),
    User("teste2@teste2.com", "456")
)

object FirebaseAuthenticator {

    fun provideLoginService(): LoginService {
        return object : LoginService {
            override fun login(email: String, password: String): Boolean {
                return registeredUsers.any { it.email == email && it.password == password }
            }
        }
    }
}