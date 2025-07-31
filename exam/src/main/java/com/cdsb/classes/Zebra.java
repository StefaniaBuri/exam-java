package com.cdsb.classes;

import com.cdsb.enums.AnimalType;
import com.cdsb.enums.BehaviorType;
import com.cdsb.enums.Diet;
import com.cdsb.enums.HabitatType;
import com.cdsb.interfaces.IAnimals;

public class Zebra extends Animals{

    public Zebra(String name) {
        super(name, "Zebra", AnimalType.MAMMALS, HabitatType.TERRESTRIAL,
                Diet.HERBIVORE, 300, BehaviorType.SOCIAL,
                "Their diet consists of grass and hay daily. Check their hooves regularly", true);
    }

    @Override
    public boolean isCompatibleWith(IAnimals animal) {
        return animal.getHabitatType() == HabitatType.TERRESTRIAL
            && animal.getBehaviorType() == BehaviorType.SOCIAL;
    }

    @Override
    public String makeSound() {
        return "¡Jiii!";
    }
}
