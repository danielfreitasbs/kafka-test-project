package com.danielfreitasbs.kafkademoproject

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KafkaDemoProjectApplication

fun main(args: Array<String>) {
	runApplication<KafkaDemoProjectApplication>(*args)
}
