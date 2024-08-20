package com.subscription_service.message;

import com.subscription_service.entity.UserMessage;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubscriptionMessageProducer {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void sendUserUpdateMessage(UserMessage userMessage) {
        rabbitTemplate.convertAndSend("user.update.queue", userMessage);
    }
}
