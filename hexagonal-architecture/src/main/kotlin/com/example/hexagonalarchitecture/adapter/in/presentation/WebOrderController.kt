package com.example.hexagonalarchitecture.adapter.`in`.presentation

import com.example.hexagonalarchitecture.application.order.port.`in`.OrderRequest
import com.example.hexagonalarchitecture.application.order.port.`in`.OrderResult
import com.example.hexagonalarchitecture.application.order.port.`in`.PlaceOrderUseCase
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class WebOrderController(
    val placeOrderUseCase: PlaceOrderUseCase
) {
    @GetMapping("/web/{money}")
    fun order(@PathVariable money: Int): OrderResult {
        val orderRequest: OrderRequest = OrderRequest(money)
        return placeOrderUseCase.placeOrder(orderRequest)
    }
}