package com.cdsb.classes;

import com.cdsb.enums.AnimalType;
import com.cdsb.enums.BehaviorType;
import com.cdsb.enums.Diet;
import com.cdsb.enums.HabitatType;
import com.cdsb.interfaces.IAnimals;

public class Zebra extends Animals{

    public Zebra(String name) {
        super(name, "Zebra", AnimalType.MAMMALS, HabitatType.TERRESTRIAL,
                Diet.HERBIVORE, 300, BehaviorType.PREY,
                "Their diet consists of grass and hay daily. Check their hooves regularly", true);
    }

    @Override
    public boolean isCompatibleWith(IAnimals animals) {
        return this.getHabitatType() == animals.getHabitatType()
            && this.getBehaviorType() == animals.getBehaviorType()
            && (animals.getSpecies().equals("Elefante") || animals.getSpecies().equals("Zebra"));
    }

    @Override
    public String makeSound() {
        return "Whinny!";
    }
}
