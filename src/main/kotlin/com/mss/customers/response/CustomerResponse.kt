package com.mss.customers.response

import com.mss.customers.enums.Gender
import java.time.LocalDate

data class CustomerResponse (  val name: String,
                               val birth_date: String,
                               val gender : Gender?)