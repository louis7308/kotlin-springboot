package com.example.daegu.domain.sport

import com.example.daegu.domain.user.UserEntity
import com.fasterxml.jackson.annotation.JsonIgnore
import java.time.LocalDateTime
import javax.persistence.*

@Entity
class   SportEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val idx: Int,

    val name: String,

    val startAt: LocalDateTime,

    val finish: Boolean,

    @Column(nullable = false)
    val score: Int? = null,

    val sportIndex: Int,

    @JsonIgnore
    @OneToMany(mappedBy = "sportEntity", fetch = FetchType.LAZY)
    var userEntity: MutableList<UserEntity> = mutableListOf()
) {
}