package com.cdsb.interfaces;

import com.cdsb.enums.AnimalType;
import com.cdsb.enums.BehaviorType;
import com.cdsb.enums.Diet;
import com.cdsb.enums.HabitatType;

public interface IAnimals {

    // GETTERS
    String getName();

    String getSpecies();

    AnimalType getAnimalType();

    HabitatType getHabitatType();

    Diet getDietType();

    int getRequiredSpace();

    BehaviorType getBehaviorType();

    String getVeterinaryCare();


    // LÓGICA DE NEGOCIO
    boolean isCompatibleWith(IAnimals animals);

    boolean canLiveTogether();// puede convivir mismo habitat?

    String makeSound(); // funcionalidad extra
}
