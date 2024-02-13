package com.mss.customers.controller

import com.mss.customers.request.CustomerRequest
import com.mss.customers.response.CustomerResponse
import com.mss.customers.service.CustomerServiceImpl
import com.mss.customers.utils.responseConverter
import com.mss.customers.utils.toModel
import jakarta.validation.Valid
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/customer")
class   CustomerController (@Autowired private val customerServiceImpl: CustomerServiceImpl){

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun createCustomer(@RequestBody @Valid customerRequest: CustomerRequest) : CustomerResponse{
        customerServiceImpl.saveCustomer(customerRequest)
       return customerRequest.toModel().responseConverter()
    }
    
}