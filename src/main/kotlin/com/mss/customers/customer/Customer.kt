package com.mss.customers.customer

import com.mss.customers.enums.Gender
import java.time.LocalDate
import java.util.*

class Customer (
    val id: String = UUID.randomUUID().toString(),
    val name: String?,
    val birth_date: LocalDate,
    val gender : Gender,

    )