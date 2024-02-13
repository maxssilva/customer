package com.mss.customers.customer

import com.mss.customers.enums.Gender
import jakarta.persistence.Entity
import jakarta.persistence.Id
import java.util.*

@Entity
class Customer(

    @Id
    val id: String = UUID.randomUUID().toString(),
    val name: String,
    val birth_date: String,
    val gender: Gender?

)