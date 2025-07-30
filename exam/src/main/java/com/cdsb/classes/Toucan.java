package com.cdsb.classes;

import com.cdsb.enums.AnimalType;
import com.cdsb.enums.BehaviorType;
import com.cdsb.enums.Diet;
import com.cdsb.enums.HabitatType;
import com.cdsb.interfaces.IAnimals;

public class Toucan extends Animals{

    public Toucan(String name) {
        super(name, "Tucan", AnimalType.BIRDS, HabitatType.TERRARIUM,
                Diet.OMNIVORE, 5, BehaviorType.SOCIAL,
                "It feeds on fruits, insects, and lizards. It requires tropical humidity. It requires monthly beak care", true);
    }

    @Override
    public boolean isCompatibleWith(IAnimals animals) {
        return this.getHabitatType() == animals.getHabitatType()
            && this.getBehaviorType() == animals.getBehaviorType()
            && (animals.getSpecies().equals("Loro") || animals.getSpecies().equals("Tucan"));
    }

    @Override
    public String makeSound() {
        return "Croak!";
    }
}
