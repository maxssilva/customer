package com.mss.customers.service

import com.mss.customers.repository.CustomerRepository
import com.mss.customers.request.CustomerRequest
import com.mss.customers.utils.toModel
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class CustomerServiceImpl(@Autowired private val customerRepository: CustomerRepository) : CustomerService {

    override fun saveCustomer(customerRequest: CustomerRequest)  {
        validateCustomer(customerRequest)
        customerRepository.save(customerRequest.toModel())

    }

    private fun validateCustomer(customerRequest: CustomerRequest) {
        require(customerRequest.name != null) { "Name must be informed" }
        require(customerRequest.gender != null) { "Gender must be informed" }
        require(customerRequest.birth_date != null) { "Birth date must be informed" }
    }
}