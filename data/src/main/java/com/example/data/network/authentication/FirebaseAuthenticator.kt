package com.example.data.network.authentication

import com.example.data.model.User
import com.example.data.network.LoginService

val registeredUsers = listOf(
    com.example.data.model.User("teste@teste.com", "123"),
    com.example.data.model.User("teste2@teste2.com", "456")
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