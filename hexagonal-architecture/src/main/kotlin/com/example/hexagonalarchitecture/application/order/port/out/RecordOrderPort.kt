package com.example.hexagonalarchitecture.application.order.port.out

interface RecordOrderPort {
    fun recordOrder(orderRecord: OrderRecord)
}