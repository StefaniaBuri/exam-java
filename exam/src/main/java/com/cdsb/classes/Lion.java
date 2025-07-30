package com.cdsb.classes;

import com.cdsb.enums.AnimalType;
import com.cdsb.enums.BehaviorType;
import com.cdsb.enums.Diet;
import com.cdsb.enums.HabitatType;
import com.cdsb.interfaces.IAnimals;

public class Lion extends Animals{

    public Lion(String name) {
        super(name, "León", AnimalType.MAMMALS, HabitatType.TERRESTRIAL, Diet.CARNIVORE, 400, BehaviorType.PREDATOR,
        "He requires regular checks of claws and teeth and is fed a meat-based diet twice a day", false);
    }

    @Override
    public boolean isCompatibleWith(IAnimals animals) {
        // compatible con animales del mismo habitat y comportamiento, no con elefante o cebra
        return this.getHabitatType() == animals.getHabitatType()
            && this.getBehaviorType() == animals.getBehaviorType()
            && (animals.getSpecies().equals("León"));
    }

    @Override
    public String makeSound() {
        return "Roarrr!";
    }
}
