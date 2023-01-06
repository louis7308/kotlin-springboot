package com.example.vote.domain.auth.presentation

import com.example.vote.domain.auth.dto.request.SignInRequest
import com.example.vote.domain.auth.dto.request.SignUpRequest
import com.example.vote.domain.auth.dto.response.SignInResponse
import com.example.vote.domain.auth.service.AuthService
import com.example.vote.global.response.SuccessResponse
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/auth")
class AuthController(
    val authService: AuthService
) {
    @PostMapping("/signup")
    fun signUp(@RequestBody signUpRequest: SignUpRequest): ResponseEntity<SuccessResponse> {
        authService.signUp(signUpRequest)
        return ResponseEntity(SuccessResponse, HttpStatus.OK)
    }

    @PostMapping("/signIn")
    fun signIn(@RequestBody signInRequest: SignInRequest) : ResponseEntity<SignInResponse> {
        val signIn = authService.signIn(signInRequest)
        return ResponseEntity(signIn, HttpStatus.OK)
    }
}