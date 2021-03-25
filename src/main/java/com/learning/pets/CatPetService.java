package com.learning.pets;

public class CatPetService implements PetService {
    @Override
    public String petType() {
        return "Cat";
    }
}
