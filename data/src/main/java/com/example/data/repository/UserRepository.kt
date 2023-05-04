package com.example.data.repository

import com.example.data.model.User

interface UserRepository {

    fun login(email: String, password: String): Boolean

    fun getUser(): User

}