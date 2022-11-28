package com.example.hexagonalarchitecture.application.order.port.`in`

interface PlaceOrderUserCase {
    fun placeOrder(orderDetail: OrderRequest) : OrderResult
}