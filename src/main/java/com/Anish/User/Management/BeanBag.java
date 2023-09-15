package com.Anish.User.Management;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration

public class BeanBag {
    @Bean
    List<User> getDataSource() {
        return new ArrayList<>();
    }
}
