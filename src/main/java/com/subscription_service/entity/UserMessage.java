package com.subscription_service.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserMessage {
    private Long id;
    private String email;
    private boolean enabled;
    private String userId;
}
