package com.learning.sfgdi.config;

import com.learning.pets.DogPetService;
import com.learning.pets.PetService;
import com.learning.pets.PetServiceFactory;
import com.learning.sfgdi.controllers.PropertyInjectedController;
import com.learning.sfgdi.repositories.EnglishGreetingRepository;
import com.learning.sfgdi.repositories.EnglishGreetingRepositoryImpl;
import com.learning.sfgdi.services.ConstructorGreetingServiceImpl;
import com.learning.sfgdi.services.I18nEnglishGreetingService;
import com.learning.sfgdi.services.PrimaryGreetingService;
import com.learning.sfgdi.services.PropertyInjectedGreetingService;
import com.learning.spanish.I18nSpanishService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

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

    @Bean
    @Primary
    PrimaryGreetingService primaryGreetingService(){
        return new PrimaryGreetingService();
    }

    @Bean
    EnglishGreetingRepository englishGreetingRepository(){
        return new EnglishGreetingRepositoryImpl();
    }

    @Bean
    @Profile("EN")
    I18nEnglishGreetingService i18nService(EnglishGreetingRepository englishGreetingRepository){
        return new I18nEnglishGreetingService(englishGreetingRepository);
    }

    @Bean("i18nService")
    @Profile({"ES", "default"})
    I18nSpanishService i18nSpanishService(){
        return new I18nSpanishService();
    }

    @Bean
    PetServiceFactory petServiceFactory(){
        return new PetServiceFactory();
    }

    @Bean
    PetService dogPetService(PetServiceFactory petServiceFactory){
        return petServiceFactory.getPetService("dog");
    }

    @Bean
    PetService catPetService(PetServiceFactory petServiceFactory){
        return petServiceFactory.getPetService("cat");
    }
}
