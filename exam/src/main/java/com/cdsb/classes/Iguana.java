package com.cdsb.classes;

import com.cdsb.enums.AnimalType;
import com.cdsb.enums.BehaviorType;
import com.cdsb.enums.Diet;
import com.cdsb.enums.HabitatType;
import com.cdsb.interfaces.IAnimals;

public class Iguana extends Animals{

    public Iguana(String name) {
        super(name, "Iguana", AnimalType.REPTILES, HabitatType.TERRARIUM,
                Diet.HERBIVORE, 8, BehaviorType.TERRITORIAL,
                "It feeds on leafy greens. It requires ultraviolet light and temperature control", false);
    }

    @Override
    public boolean isCompatibleWith(IAnimals animals) {
        return false; //false -> keep alone
    }

    @Override
    public String makeSound() {
        return "Click-click!";
    }
}
