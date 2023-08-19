package com.microservices.kafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {
    @Bean
    public NewTopic createTopic(){
        return TopicBuilder.name("ratings")
                .partitions(2)
                .replicas(2)
                .build();                   // create topic
    }
}
