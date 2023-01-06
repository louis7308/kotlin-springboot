package com.example.vote.domain.auth.service.Impl

import com.example.vote.domain.auth.dto.request.SignInRequest
import com.example.vote.domain.auth.dto.request.SignUpRequest
import com.example.vote.domain.auth.dto.response.SignInResponse
import com.example.vote.domain.auth.service.AuthService
import com.example.vote.domain.user.User
import com.example.vote.domain.user.repository.UserRepository
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service
import java.lang.RuntimeException
import java.util.*

@Service
class AuthServiceImpl(
    val userRepository: UserRepository
) : AuthService {
    override fun signUp(signUpRequest: SignUpRequest) {
        if(userRepository.existsById(signUpRequest.id)) { // 존재하면 true 존재하지 않으면 false
            throw RuntimeException("유저가 존재합니다.");
        }
        val user: User = signUpRequest.of()
        userRepository.save(user)
    }

