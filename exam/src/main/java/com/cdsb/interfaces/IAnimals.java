package com.cdsb.interfaces;

import com.cdsb.enums.HabitatType;
import com.cdsb.enums.Diet;

public interface IAnimals {

    // Getters
    String getName();
    String getSpecies();
    HabitatType getHabitatType();
    double getRequiredSpace(); // en m2


    // Lógica de negocio
    Diet getDiet();
    boolean isCompatibleWith(IAnimals animals);
    boolean needVeterinaryCare();


}
