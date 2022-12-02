package com.example.hexagonalarchitecture.adapter.`in`.presentation

import com.example.hexagonalarchitecture.application.order.port.`in`.GetReceiptUsecase
import com.example.hexagonalarchitecture.application.order.port.`in`.ReceiptResult
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class AdminReceiptController(
    val getReceiptUsecase: GetReceiptUsecase
) {
    @GetMapping("/receipt/{orderId}")
    fun getReceipt(@PathVariable orderId: String) : ReceiptResult {
        return getReceiptUsecase.getReceipt(orderId)
    }
}