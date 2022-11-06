package com.projectConsumer.rabbitmq;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

    private final String jsonQueue = "jsonQueue";

    @RabbitListener(queues = jsonQueue)
    public void listen(User user) {
        System.out.println("Consuming message = " + user.getFirstName());
    }

}
