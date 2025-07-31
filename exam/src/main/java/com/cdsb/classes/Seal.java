package com.cdsb.classes;

import com.cdsb.enums.AnimalType;
import com.cdsb.enums.BehaviorType;
import com.cdsb.enums.Diet;
import com.cdsb.enums.HabitatType;
import com.cdsb.interfaces.IAnimals;

public class Seal extends Animals{

    public Seal(String name) {
        super(name, "Foca", AnimalType.AQUATICS, HabitatType.AQUATIC,
                Diet.CARNIVORE, 400, BehaviorType.SOCIAL,
                "They feed on fish. They are social animals and can coexist with dolphins. They need resting areas near the water", true);
    }

    @Override
    public boolean isCompatibleWith(IAnimals animal) {
        return animal.getHabitatType() == HabitatType.AQUATIC
            && animal.canLiveTogether()
            && animal.getBehaviorType() == BehaviorType.SOCIAL;
    }

    @Override
    public String makeSound() {
        return "oh-oh-oh!";
    }
}
