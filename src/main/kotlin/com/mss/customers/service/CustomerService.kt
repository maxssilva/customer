package com.mss.customers.service

import com.mss.customers.request.CustomerRequest

interface CustomerService {
    fun saveCustomer(customerRequest: CustomerRequest)
}