package com.example.hexagonalarchitecture.adapter.out.infrastructure.persistence

import org.springframework.data.jpa.repository.JpaRepository

interface OrderRecordRepository : JpaRepository< OrderRecordEntity, Int> {
    fun findByOrderId(orderId: String) : OrderRecordEntity
}