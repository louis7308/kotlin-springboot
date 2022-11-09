package com.example.jpa.entity

import javax.persistence.Entity
import javax.persistence.Id

@Entity
class Member(
    @Id
    val id: Long,

    val username: String
) {
}