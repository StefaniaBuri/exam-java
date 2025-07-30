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
    public boolean isCompatibleWith(IAnimals animals) {
        return this.getHabitatType() == animals.getHabitatType()
            && animals.canLiveTogether()
            && (animals.getSpecies().equals("Delfín") || animals.getSpecies().equals("Foca"));
    }

    @Override
    public String makeSound() {
        return "Arf! Arf!";
    }
}
