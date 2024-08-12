package com.subscription_service.repository;

import com.subscription_service.entity.Subscription;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SubscriptionRepository extends CrudRepository<Subscription, Long> {
    List<Subscription> findByUserId(String userId);
    boolean existsByUserId(String userId);

}
