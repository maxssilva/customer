package com.mss.customers.service

import com.mss.customers.request.CustomerRequest
import java.util.UUID

interface CustomerService {
    fun saveCustomer(customerRequest: CustomerRequest)
    fun getCustomer(id: String)
}