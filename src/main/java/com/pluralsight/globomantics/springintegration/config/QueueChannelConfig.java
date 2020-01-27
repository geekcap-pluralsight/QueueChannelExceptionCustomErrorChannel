package com.pluralsight.globomantics.springintegration.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.channel.PublishSubscribeChannel;
import org.springframework.integration.channel.QueueChannel;
import org.springframework.integration.config.EnableIntegration;
import org.springframework.messaging.MessageChannel;

@Configuration
@EnableIntegration
public class QueueChannelConfig {
    @Bean
    public MessageChannel queueChannel() {
        return new QueueChannel(10);
    }

    @Bean
    public MessageChannel customErrorChannel() {
        return new PublishSubscribeChannel();
    }
}