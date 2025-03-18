package com.mss.customers.request

import com.mss.customers.enums.Gender

class CustomerRequest(
    val name: String,
    val birth_date: String,
    val gender: Gender
)