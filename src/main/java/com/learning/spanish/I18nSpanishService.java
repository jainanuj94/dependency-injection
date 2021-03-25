package com.learning.spanish;

import com.learning.sfgdi.services.GreetingService;

public class I18nSpanishService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hola Mundo - ES";
    }
}
