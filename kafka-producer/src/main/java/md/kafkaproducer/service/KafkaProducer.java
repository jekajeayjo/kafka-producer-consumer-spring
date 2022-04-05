package md.kafkaproducer.service;

import md.kafkaproducer.model.Message;

public interface KafkaProducer {
     void produce(Message message);
}
