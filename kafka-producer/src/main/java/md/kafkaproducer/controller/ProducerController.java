package md.kafkaproducer.controller;

import md.kafkaproducer.model.Message;
import md.kafkaproducer.service.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(ProducerController.URL_PREFIX)
public class ProducerController {
    public static final String URL_PREFIX="/kafka";
    private static final String GENERATE="/generate";

    @Autowired
    private KafkaProducer  kafkaProducer;

    @PostMapping(GENERATE)
    public void generate(Message message)
    {
        kafkaProducer.produce(message);
    }
}
