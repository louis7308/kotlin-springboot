package com.example.hexagonalarchitecture.application.order.port.`in`

interface PlaceOrderUseCase {
    fun placeOrder(orderDetail: OrderRequest) : OrderResult
}