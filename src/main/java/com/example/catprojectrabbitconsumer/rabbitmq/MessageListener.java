package com.example.catprojectrabbitconsumer.rabbitmq;

import com.example.catprojectrabbitconsumer.model.Cat;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MessageListener {

    @RabbitListener(queues = RabbitMQConfig.MESSAGE_QUEUE)
    public void receiveMessage(Cat cat) {
        System.out.println("Received <" + cat + ">");
    }
}
