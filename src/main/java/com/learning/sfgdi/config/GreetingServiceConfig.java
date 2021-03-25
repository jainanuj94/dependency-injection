package com.learning.sfgdi.config;

import com.learning.sfgdi.controllers.PropertyInjectedController;
import com.learning.sfgdi.services.ConstructorGreetingServiceImpl;
import com.learning.sfgdi.services.PropertyInjectedGreetingService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GreetingServiceConfig {

    @Bean
    ConstructorGreetingServiceImpl constructorGreetingServiceImpl(){
        return new ConstructorGreetingServiceImpl();
    }

    @Bean
    PropertyInjectedGreetingService propertyInjectedGreetingService(){
        return new PropertyInjectedGreetingService();
    }
}
