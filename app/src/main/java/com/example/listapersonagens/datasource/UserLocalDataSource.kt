package com.example.controleloginhiltapp.data.datasource

import com.example.listapersonagens.model.User


interface UserLocalDataSource {
    
    fun getUser(): User
    
}