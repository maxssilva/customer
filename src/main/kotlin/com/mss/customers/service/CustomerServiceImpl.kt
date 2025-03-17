package com.mss.customers.service

import com.mss.customers.repository.CustomerRepository
import com.mss.customers.request.CustomerRequest
import com.mss.customers.utils.toModel
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class CustomerServiceImpl(@Autowired private val customerRepository: CustomerRepository) : CustomerService {

    override fun saveCustomer(customerRequest: CustomerRequest)  {
        validateCustomer()
        customerRepository.save(customerRequest.toModel())

    }

    override fun getCustomer(id: String) {
        TODO("Not yet implemented")
    }

    private fun validateCustomer() {
        TODO()
        //require(true) { "Name must be informed" }
//        require(true) { "Gender must be informed" }
//        require(true) { "Birth date must be informed" }
    }
}