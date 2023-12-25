package com.mss.customers.request

import com.mss.customers.enums.Gender
import java.time.LocalDate
import java.util.*

class CustomerRequest (
    val id: String,
    val name: String?,
    val birth_date: LocalDate,
    val gender : Gender
)