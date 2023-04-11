package com.example.listapersonagens.network.authentication

import com.example.listapersonagens.model.domain.InMemoryUserRepository
import com.example.listapersonagens.model.domain.UserRepository

class Authenticator(private val userRepository: UserRepository) {
    fun login(email: String, password: String): Boolean =
        userRepository.getUserByEmail(email)?.password == password
}

// FirebaseAuthenticator depende agora do novo objeto Authenticator
object FirebaseAuthenticator {
    private val authenticator = Authenticator(InMemoryUserRepository())

    fun login(email: String, password: String): Boolean =
        authenticator.login(email, password)
}

// BackendAuthenticator também depende do novo objeto Authenticator
object BackendAuthenticator {
    private val authenticator = Authenticator(InMemoryUserRepository())

    fun login(email: String, password: String): Boolean =
        authenticator.login(email, password)
}

/*
Com essas mudanças, os objetos FirebaseAuthenticator e BackendAuthenticator não precisam mais se
preocupar com a implementação concreta do repositório de usuários, pois essa responsabilidade foi
transferida para a classe Authenticator. Além disso, a classe Authenticator é responsável apenas
pela autenticação, seguindo o princípio de responsabilidade única.
 */