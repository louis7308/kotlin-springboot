package com.example.cleanarchitecture.core.use_cases.post

enum class enummmm {
    PAYMENT_WAITING {
        override fun isShippingChangeable() = true
    },
    PREPARING {
        override fun isShippingChangeable() = true
    },
    SHIPPED, DELIVERING, DELIVERY_COMPLETED;

    open fun isShippingChangeable() = false
}