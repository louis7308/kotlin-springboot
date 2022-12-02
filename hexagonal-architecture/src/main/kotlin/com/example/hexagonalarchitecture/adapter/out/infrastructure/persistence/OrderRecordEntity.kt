package com.example.hexagonalarchitecture.adapter.out.infrastructure.persistence

import com.example.hexagonalarchitecture.application.order.port.out.OrderRecord
import javax.persistence.*

@Entity
class OrderRecordEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Int = 0

    @Column(unique = true)
    val orderId: String
    val money: Int

    private constructor(orderId: String, money: Int) {
        this.orderId = orderId
        this.money = money
    }

    companion object {
        fun from(orderRecord: OrderRecord): OrderRecordEntity {
            return OrderRecordEntity(orderRecord.orderId, orderRecord.money)
        }
    }

}