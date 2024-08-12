package com.subscription_service.controller;

import com.subscription_service.entity.Subscription;
import com.subscription_service.service.SubscriptionService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/subscriptions")
public class SubscriptionController {

    @Autowired
    private SubscriptionService subscriptionService;

    @PostMapping
    @Operation(summary = "This endpoint is used to register subscription")
    public Subscription createSubscription(@RequestBody Subscription subscription) {
        return subscriptionService.createSubscription(subscription);
    }

    @GetMapping("/{userId}")
    @Operation(summary = "This endpoint is used to find userId")
    public ResponseEntity<?> getSubscriptionByUserId(@PathVariable String userId) {
        List<Subscription> subscriptions = subscriptionService.getSubscriptionsByUserId(userId);
        return ResponseEntity.ok(subscriptions);
    }

    @GetMapping("/{id}")
    @Operation(summary = "This endpoint is used to find user for Id")
    public ResponseEntity<?> getSubscriptionById(@PathVariable Long id) {
        try {
            Subscription subscription = subscriptionService.findById(id);
            return ResponseEntity.ok(subscription);
        }catch(RuntimeException e){
            return ResponseEntity.notFound().build();
        }
    }

}
