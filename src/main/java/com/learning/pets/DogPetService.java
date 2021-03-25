package com.learning.pets;

public class DogPetService implements PetService {
    @Override
    public String petType() {
        return "DOG";
    }
}
