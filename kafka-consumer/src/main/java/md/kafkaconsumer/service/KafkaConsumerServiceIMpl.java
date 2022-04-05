package md.kafkaconsumer.service;

import md.kafkaconsumer.model.Message;
import org.springframework.integration.annotation.Payloads;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerServiceIMpl {

    @KafkaListener(topics = "messages", groupId = "message_group_id")
    public void consume(@Payload Message message, @Header(KafkaHeaders.RECEIVED_PARTITION_ID) int partition) {
        System.out.println("message = " + message);
    }

}
