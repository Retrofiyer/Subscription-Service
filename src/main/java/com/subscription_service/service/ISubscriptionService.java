package com.subscription_service.service;

import com.subscription_service.entity.Subscription;

import java.util.List;

public interface ISubscriptionService {

    Subscription findById(Long id);

    Subscription createSubscription(Subscription subscription);

    List<Subscription> getSubscriptionsByUserId(String userId);

}
