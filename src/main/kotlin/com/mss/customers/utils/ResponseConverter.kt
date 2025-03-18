package com.mss.customers.utils

import com.mss.customers.customer.Customer
import com.mss.customers.enums.Gender
import com.mss.customers.response.CustomerResponse

fun Customer.responseConverter() = CustomerResponse(name = name, birth_date = birth_date, gender = gender )
