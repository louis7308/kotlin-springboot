package com.example.daegu.domain.sport.repository

import com.example.daegu.domain.sport.SportEntity
import org.springframework.data.jpa.repository.JpaRepository

interface SportRepository : JpaRepository<SportEntity, Int> {
    fun findByName(name: String) : SportEntity
}