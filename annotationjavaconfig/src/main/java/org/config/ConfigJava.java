package org.config;

import org.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigJava {
    @Bean
    public User getUser(){
        return new User();
    }
}
