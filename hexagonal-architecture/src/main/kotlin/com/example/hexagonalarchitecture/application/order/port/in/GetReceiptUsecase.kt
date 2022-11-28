package com.example.hexagonalarchitecture.application.order.port.`in`

interface GetReceiptUsecase {
    fun getReceipt(orderId: String) : ReceiptResult
}