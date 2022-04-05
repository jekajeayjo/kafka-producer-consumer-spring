package md.kafkaconsumer.service;

import md.kafkaconsumer.model.Message;

import java.util.List;

public interface KafkaConsumerService {
     void consume(Message message);
}
