package com.example.hexagonalarchitecture.domain

enum class OrderState {
    PREPARE, COMPLET
}
class Order(
    val id: String,
    val money: Int
) {
    var orderState: OrderState = OrderState.PREPARE
        private set
    fun place() {
        orderState = OrderState.COMPLET
    }
}