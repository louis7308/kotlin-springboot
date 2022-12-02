package com.example.hexagonalarchitecture.adapter.out.infrastructure.persistence

import com.example.hexagonalarchitecture.application.order.port.out.GetOrderRecordPort
import com.example.hexagonalarchitecture.application.order.port.out.OrderRecord
import com.example.hexagonalarchitecture.application.order.port.out.RecordOrderPort
import org.springframework.stereotype.Repository

@Repository
class RecordOrderAdapter(
    val orderRecordRepository: OrderRecordRepository
) : RecordOrderPort, GetOrderRecordPort {
    override fun getOrder(orderId: String): OrderRecord {
        val orderRecord: OrderRecordEntity = orderRecordRepository.findByOrderId(orderId)
        return OrderRecord(orderRecord.orderId, orderRecord.money)
    }

}