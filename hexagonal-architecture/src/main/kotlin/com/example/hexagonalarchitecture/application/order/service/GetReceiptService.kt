package com.example.hexagonalarchitecture.application.order.service

import com.example.hexagonalarchitecture.application.order.port.`in`.GetReceiptUsecase
import com.example.hexagonalarchitecture.application.order.port.`in`.ReceiptResult
import com.example.hexagonalarchitecture.application.order.port.out.GetOrderRecordPort
import com.example.hexagonalarchitecture.application.order.port.out.OrderRecord
import com.example.hexagonalarchitecture.domain.Receipt
import org.springframework.stereotype.Service

@Service
class GetReceiptService(
    val orderRecordPort: GetOrderRecordPort
) : GetReceiptUsecase {
    override fun getReceipt(orderId: String): ReceiptResult {
        val orderRecord: OrderRecord = orderRecordPort.getOrder(orderId)
        val receipt = Receipt(orderRecord.orderId, orderRecord.money)

        return ReceiptResult(receipt.orderId, receipt.money)
    }
}