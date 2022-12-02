package com.example.hexagonalarchitecture.application.order.service

import com.example.hexagonalarchitecture.application.order.port.`in`.OrderRequest
import com.example.hexagonalarchitecture.application.order.port.`in`.OrderResult
import com.example.hexagonalarchitecture.application.order.port.`in`.PlaceOrderUseCase
import com.example.hexagonalarchitecture.application.order.port.out.OrderRecord
import com.example.hexagonalarchitecture.application.order.port.out.RecordOrderPort
import com.example.hexagonalarchitecture.domain.Order
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import java.util.*

@Service
class PlaceOrderService(
    val recordOrderPort: RecordOrderPort
) : PlaceOrderUseCase {
    @Transactional
    override fun placeOrder(orderDetail: OrderRequest): OrderResult {
        val order: Order = Order(UUID.randomUUID().toString(), orderDetail.money)
        order.place()

        recordOrderPort.recordOrder(OrderRecord(order.id, order.money))

        return OrderResult(order.id, order.money)
    }
}