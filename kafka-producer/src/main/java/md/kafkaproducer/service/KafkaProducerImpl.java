package md.kafkaproducer.service;

import md.kafkaproducer.model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducerImpl implements KafkaProducer {

    @Autowired
    private KafkaTemplate<String, Message> kafkaTemplate;

    @Override
    public void produce(Message message) {
        System.out.println("Producing the message: " + message);
        kafkaTemplate.send("messages",message.getMessage(),message);
        System.out.printf("sended message");
    }
}
