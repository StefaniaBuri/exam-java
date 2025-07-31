package com.cdsb.classes;

import com.cdsb.enums.AnimalType;
import com.cdsb.enums.BehaviorType;
import com.cdsb.enums.Diet;
import com.cdsb.enums.HabitatType;
import com.cdsb.interfaces.IAnimals;

public class Dolphin extends Animals{

    public Dolphin(String name) {
        super(name, "Delfín", AnimalType.AQUATICS, HabitatType.AQUATIC,
                Diet.CARNIVORE, 500, BehaviorType.SOCIAL,
                "Feeds fish twice a day. Keep them in a group. Monitor their swimming patterns and sonar communication", true);
    }

    @Override
    public boolean isCompatibleWith(IAnimals animal) {
        return animal.getHabitatType() == HabitatType.AQUATIC
            && animal.canLiveTogether()
            && animal.getBehaviorType() == BehaviorType.SOCIAL;

    }

    @Override
    public String makeSound() {
        return "Eeeeee!";
    }
}
