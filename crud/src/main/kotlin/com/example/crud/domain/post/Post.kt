package com.example.crud.domain.post

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class Post(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    @Column(length = 200, nullable = false)
    var title: String,

    @Column(columnDefinition = "TEXT", nullable = false)
    var content: String,

    val author: String? = null
)