package com.cdsb.classes;

import com.cdsb.enums.AnimalType;
import com.cdsb.enums.BehaviorType;
import com.cdsb.enums.Diet;
import com.cdsb.enums.HabitatType;
import com.cdsb.interfaces.IAnimals;

public class Elephant extends Animals{

    public Elephant(String name) {
        super(name, "Elefante", AnimalType.MAMMALS, HabitatType.TERRESTRIAL,
            Diet.HERBIVORE, 600, BehaviorType.SOCIAL,"Bathing and feeding daily with fruit, grass, and hay. Skin and joint checks are provided weekly", true);
    }

    @Override
    public boolean isCompatibleWith(IAnimals animal) {
        return animal.getHabitatType() == HabitatType.TERRESTRIAL
            && animal.getBehaviorType() == BehaviorType.SOCIAL;
    }

    @Override
    public String makeSound() {
        return "¡Bram!";
    }
}
