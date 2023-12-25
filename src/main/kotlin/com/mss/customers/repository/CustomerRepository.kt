package com.mss.customers.repository

import com.mss.customers.customer.Customer
import org.springframework.data.jpa.repository.JpaRepository

interface CustomerRepository : JpaRepository<Customer,String> {
    fun saveCustomer(customer: Customer)
}