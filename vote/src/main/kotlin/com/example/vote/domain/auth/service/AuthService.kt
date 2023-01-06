package com.example.vote.domain.auth.service

import com.example.vote.domain.auth.dto.request.SignInRequest
import com.example.vote.domain.auth.dto.request.SignUpRequest
import com.example.vote.domain.auth.dto.response.SignInResponse

interface AuthService {
    fun signUp(signUpRequest: SignUpRequest)

    fun signIn(signInRequest: SignInRequest) : SignInResponse
}