package com.example.hexagonalarchitecture.application.order.service

import com.example.hexagonalarchitecture.application.order.port.`in`.GetReceiptUsecase
import com.example.hexagonalarchitecture.application.order.port.`in`.ReceiptResult
import com.example.hexagonalarchitecture.application.order.port.out.GetOrderRecordPort
import org.springframework.stereotype.Service

@Service
class GetReceiptService(
    private val orderRecordPort: GetOrderRecordPort
) : GetReceiptUsecase {
    override fun getReceipt(orderId: String): ReceiptResult {
        TODO("Not yet implemented")
    }
}