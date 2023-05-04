package com.example.data.datasource

import com.example.data.model.User


interface UserLocalDataSource {
    
    fun getUser(): User
    
}
