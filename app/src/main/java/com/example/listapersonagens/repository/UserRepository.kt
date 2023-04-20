package com.example.listapersonagens.repository

import com.example.listapersonagens.model.User

interface UserRepository {

    fun login(email: String, password: String): Boolean

    fun getUser(): User

}