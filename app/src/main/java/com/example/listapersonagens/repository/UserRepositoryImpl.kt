package com.example.listapersonagens.repository

import com.example.controleloginhiltapp.data.datasource.UserLocalDataSource
import com.example.controleloginhiltapp.data.datasource.UserRemoteDataSource
import com.example.listapersonagens.model.User
import javax.inject.Inject


class UserRepositoryImpl @Inject constructor(
    private val userLocalDataSource: UserLocalDataSource,
    private val userRemoteDataSource: UserRemoteDataSource,
): UserRepository {

    override fun login(email: String, password: String): Boolean {
        return userRemoteDataSource.login(email, password)
    }

    override fun getUser(): User {
        return userLocalDataSource.getUser()
    }
}