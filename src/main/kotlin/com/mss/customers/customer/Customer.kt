package com.mss.customers.customer

import com.mss.customers.enums.Gender
import jakarta.persistence.Entity
import java.time.LocalDate
import java.util.*

@Entity
class Customer (
    val id: String = UUID.randomUUID().toString(),
    val name: String?,
    val birth_date: LocalDate?,
    val gender : Gender?

    )