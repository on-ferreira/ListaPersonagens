package com.example.listapersonagens.model.domain

import com.example.listapersonagens.network.authentication.RegisteredUsers

interface UserRepository {
    fun getUserByEmail(email: String): User?
    fun saveUser(user: User)
}

class InMemoryUserRepository : UserRepository {
    private var users = mutableListOf<User>()

    init {
        users += RegisteredUsers.backend + RegisteredUsers.firebase
    }

    override fun getUserByEmail(email: String): User? {
        return users.find { it.email == email }
    }

    override fun saveUser(user: User) {
        if (getUserByEmail(user.email) == null) {
            users.add(user)
        }
    }
}

/*
Princípio de Inversão de Dependência (DIP):

Em vez de criar um modelo diretamente no código de 'User', podemos criar uma interface
UserRepository que defina métodos para recuperar usuários e, em seguida, criar uma
implementação dessa interface que interaja com uma fonte de dados, como um banco de dados ou um
 serviço de autenticação externo.

 */