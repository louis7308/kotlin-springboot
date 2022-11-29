package com.example.hexagonalarchitecture.application.order.port.out

interface GetOrderRecordPort {
    fun getOrder(orderId: String)
}