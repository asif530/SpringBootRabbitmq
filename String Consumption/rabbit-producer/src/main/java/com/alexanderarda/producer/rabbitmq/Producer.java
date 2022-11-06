package com.alexanderarda.producer.rabbitmq;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Timer;

@Service
public class Producer {


    @Autowired
    private RabbitTemplate rabbitTemplate;


    public void sendMessage(String message) throws InterruptedException {

        // routing key = "hello"
        rabbitTemplate.convertAndSend("hello", message);
    }

}
