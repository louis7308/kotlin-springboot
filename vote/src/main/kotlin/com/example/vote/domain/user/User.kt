package com.example.vote.domain.user

import javax.persistence.*

@Entity
class User(
    @Id
    val id: String,

    @Column(nullable = false)
    val password: String,

    @Column(nullable = true)
    val username: String? = null,

    @Column(nullable = true)
    val rank: String

) {

}