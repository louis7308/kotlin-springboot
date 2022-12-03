package com.example.daegu.domain.user.repository

import com.example.daegu.domain.user.UserEntity
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository : JpaRepository<UserEntity, Int> {
    fun findByName(name: String) : UserEntity
}