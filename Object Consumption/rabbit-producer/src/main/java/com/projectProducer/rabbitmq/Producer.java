package com.projectProducer.rabbitmq;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Timer;

@Service
public class Producer {

    private String exchange = "jsonExchange";
    private String routingJsonKey = "jsonRoute";

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void sendJsonMessage(){
        rabbitTemplate.convertAndSend(exchange, routingJsonKey, createUser());
    }

    private User createUser(){
        User user = new User();
        user.setId(2);
        user.setFirstName("Saif");
        user.setLastName("Chowdhury");
        return  user;
    }

}
