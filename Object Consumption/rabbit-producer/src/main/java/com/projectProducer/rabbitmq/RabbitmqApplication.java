package com.projectProducer.rabbitmq;

import com.projectProducer.rabbitmq.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Timer;

@SpringBootApplication
public class RabbitmqApplication implements CommandLineRunner{

    @Autowired
    Producer producer;

    public static void main(String[] args) {
        SpringApplication.run(RabbitmqApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        producer.sendJsonMessage();
    }
}
