package com.learning.pets;

import org.springframework.context.annotation.Configuration;

public class PetServiceFactory {

    public PetService getPetService(String petType){

        switch (petType){
            case "dog":
                return new DogPetService();
            case "cat":
                return new CatPetService();
            default:
                return new DogPetService();
        }
    }
}
