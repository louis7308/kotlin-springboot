package com.example.vote.domain.user.presentation

import com.example.vote.domain.user.presentation.dto.request.MemberReq
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController() {
    @PostMapping("abcd")
    fun save(@RequestBody req: MemberReq): String {
        return "Bad Request 안뜨고 Succ"
    }
}