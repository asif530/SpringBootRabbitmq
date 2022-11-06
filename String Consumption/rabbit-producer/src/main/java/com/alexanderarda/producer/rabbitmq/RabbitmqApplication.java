package com.alexanderarda.producer.rabbitmq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Timer;

@SpringBootApplication
public class RabbitmqApplication implements CommandLineRunner {

    @Autowired
    Producer producer;

    public static void main(String[] args) {
        SpringApplication.run(RabbitmqApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        String message = "Messed Up!!!!!!";
        for (int i = 1; i <10;){
            System.out.println("Producing message = " + message);
            producer.sendMessage(message);
            i++;
        }
    }
}
