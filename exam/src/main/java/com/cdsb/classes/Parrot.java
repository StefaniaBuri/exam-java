package com.cdsb.classes;

import com.cdsb.enums.AnimalType;
import com.cdsb.enums.BehaviorType;
import com.cdsb.enums.Diet;
import com.cdsb.enums.HabitatType;
import com.cdsb.interfaces.IAnimals;

public class Parrot extends Animals{

    public Parrot(String name) {
        super(name, "Loro", AnimalType.BIRDS, HabitatType.TERRARIUM, Diet.HERBIVORE, 5, BehaviorType.SOCIAL,
        "Its diet consists of fruits and seeds. It requires vocal interaction and feather care", true);
    }

    @Override
    public boolean isCompatibleWith(IAnimals animal) {
        return animal.getHabitatType() == HabitatType.TERRARIUM
            && animal.getBehaviorType() == BehaviorType.SOCIAL;
    }

    @Override
    public String makeSound() {
        return "trua trua!";
    }
}
