package com.danielfreitasbs.kafkademoproject.messaging

import org.apache.kafka.clients.consumer.ConsumerRecord
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Component

@Component
class Consumer {

    @KafkaListener(topics = ["test"], groupId = "test")
    fun consumeMessage(record: ConsumerRecord<String, String>) {
        print("Message Received with key [${record.key()}] and value [${record.value()}]")
    }
}