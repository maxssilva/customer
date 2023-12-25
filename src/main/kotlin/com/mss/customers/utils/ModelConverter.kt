package com.mss.customers.utils

import com.mss.customers.customer.Customer
import com.mss.customers.enums.Gender
import com.mss.customers.request.CustomerRequest
import java.time.LocalDate
import java.util.UUID

fun CustomerRequest.toModel() = Customer(UUID.randomUUID().toString(), name = "name", LocalDate.now(), Gender.MALE)