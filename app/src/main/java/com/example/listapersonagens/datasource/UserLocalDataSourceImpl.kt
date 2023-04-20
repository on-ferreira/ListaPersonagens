package com.example.controleloginhiltapp.data.datasource

import android.content.Context
import com.example.listapersonagens.model.User
import com.example.listapersonagens.network.authentication.registeredUsers
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

class UserLocalDataSourceImpl @Inject constructor(
    @ApplicationContext private val context: Context
): UserLocalDataSource {
    
    override fun getUser(): User {
        return registeredUsers.last()
    }
    
}