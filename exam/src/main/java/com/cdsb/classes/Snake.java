package com.cdsb.classes;

import com.cdsb.enums.AnimalType;
import com.cdsb.enums.BehaviorType;
import com.cdsb.enums.Diet;
import com.cdsb.enums.HabitatType;
import com.cdsb.interfaces.IAnimals;

public class Snake extends Animals{

    public Snake(String name) {
        super(name, "Serpiente", AnimalType.REPTILES, HabitatType.TERRARIUM,
                Diet.CARNIVORE, 10, BehaviorType.TERRITORIAL,
                "Feed rodents weekly. Keep them warm and isolate them from other reptiles", false);
    }

    @Override
    public boolean isCompatibleWith(IAnimals animals) {
        return false; //false -> keep alone
    }

    @Override
    public String makeSound() {
        return "Hisssss...";
    }
}
