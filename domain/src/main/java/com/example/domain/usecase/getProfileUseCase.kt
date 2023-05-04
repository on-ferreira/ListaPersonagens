package com.example.domain.usecase

import com.example.data.model.User
import com.example.data.repository.UserRepository
import javax.inject.Inject

class GetProfileUseCase @Inject constructor(
    private val userRepository: UserRepository
) {

    fun execute(): User = userRepository.getUser()

}