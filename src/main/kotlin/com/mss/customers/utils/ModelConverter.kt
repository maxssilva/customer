package com.mss.customers.utils

import com.mss.customers.customer.Customer
import com.mss.customers.request.CustomerRequest

fun CustomerRequest.toModel() = Customer(name = name, birth_date = birth_date, gender = gender)