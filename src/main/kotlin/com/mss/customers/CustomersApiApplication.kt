package com.mss.customers

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CustomersApiApplication

fun main(args: Array<String>) {
	runApplication<CustomersApiApplication>(*args)
}
