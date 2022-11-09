package com.example.jpa.repository

import com.example.jpa.entity.Member
import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import javax.transaction.Transactional

@SpringBootTest
internal class MemberRepositoryTest {

    @Autowired
    lateinit var memberRepository: MemberRepository

    @Transactional
    @Test
    fun testSave() {
        //given
        var member: Member = Member(
            id = 1L,
            username = "전승원"
        );

        // when
        var saveId: Long = memberRepository.save(member)

        // then
        Assertions.assertThat(saveId).isEqualTo(member.id)
    }
}
