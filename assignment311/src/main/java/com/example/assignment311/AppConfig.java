package com.example.assignment311;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean public Channel channel() {
        Channel channel = new Channel();
        channel.setType("SMS");
        return channel;
    }
}
