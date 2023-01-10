package com.dh.server.api

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DhServerApplication

fun main(args: Array<String>) {
    runApplication<DhServerApplication>(*args)
}
