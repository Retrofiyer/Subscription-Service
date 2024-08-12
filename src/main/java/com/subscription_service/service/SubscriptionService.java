package com.subscription_service.service;

import com.subscription_service.entity.Subscription;
import com.subscription_service.repository.SubscriptionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class SubscriptionService implements ISubscriptionService {

    @Autowired
    private SubscriptionRepository subscriptionRepository;

    @Override
    public Subscription findById(Long id) {
        return subscriptionRepository.findById(id).orElseThrow(() -> new RuntimeException("Id not found"));
    }

    @Override
    public Subscription createSubscription(Subscription subscription) {
        subscription.setStartData(LocalDateTime.now());
        subscription.setEndData(subscription.getStartData().plusMonths(1));
        subscription.setActive(true);
        return subscriptionRepository.save(subscription);
    }

    @Override
    public List<Subscription> getSubscriptionsByUserId(String userId) {
        return subscriptionRepository.findByUserId(userId);
    }
}
