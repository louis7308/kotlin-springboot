package com.example.jpa.controller

import com.example.jpa.entity.Member
import com.example.jpa.repository.MemberRepository
import lombok.RequiredArgsConstructor
import org.springframework.transaction.annotation.Transactional
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.lang.NullPointerException
import kotlin.reflect.jvm.internal.calls.ThrowingCaller.member

@RestController
@RequiredArgsConstructor
class MemberController(
    private val memberRepository: MemberRepository
) {

    @PostMapping("/member")
    @Transactional
    fun saveMember(@RequestParam("name") reqName: String) : Long {
        val member: Member = Member(
            id = 1L,
            username = reqName
        )
        return memberRepository.save(member)
    }

    @GetMapping("/member")
    @Transactional
    fun findAll(@RequestParam("id") id: Long) : Member {
        var member: Member = memberRepository.find(id)
        return member;
    }

}