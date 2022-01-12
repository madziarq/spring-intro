package com.example;

import org.springframework.context.annotation.*;

@Configuration
public class MessageServiceConfig {
    @Bean
    public MessageService messageService() {
        return new MessageService() {
            @Override
            public String getMessage() { return "Bean message"; };
        };
    }
}
