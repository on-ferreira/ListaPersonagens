package com.example.data.datasource

import com.example.data.network.LoginService
import javax.inject.Inject

class UserRemoteDataSourceImpl @Inject constructor(
    private val loginService: LoginService
): UserRemoteDataSource {
    
    override fun login(email: String, password: String): Boolean {
        return loginService.login(email, password)
    }
    
}