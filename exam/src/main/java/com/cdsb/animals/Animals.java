package com.cdsb.animals;

import com.cdsb.interfaces.IAnimals;
import com.cdsb.enums.HabitatType;
import com.cdsb.enums.Diet;

public abstract class Animals implements IAnimals {

    private String name;
    private String species;
    private Diet typeDiet; // herbivore, carnivore, omnivore
    private HabitatType habitatType;
    private double requiredSpace;

    private String behavior; //comportamiento (normales, (depredador/presa).
    private int feedingFrequencyPerDay;
    private String type;
    private boolean needVeterinaryCare;


    public Animals(String name, Diet typeDiet, HabitatType habitatType, double requiredSpace,
            boolean needVeterinaryCare) {
        this.name = name;
        this.typeDiet = typeDiet;
        this.habitatType = habitatType;
        this.requiredSpace = requiredSpace;
        this.needVeterinaryCare = needVeterinaryCare;
    }


    //GETTERS
    @Override
    public Diet getDiet() {
        return typeDiet;
    }

    @Override
    public HabitatType getHabitatType() {
        return habitatType;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getRequiredSpace() {
        return requiredSpace;
    }

    @Override
    public String getSpecies() {
        return species;
    }

    // METHODS
    @Override
    public boolean isCompatibleWith(IAnimals animals) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean needVeterinaryCare() {
        return needVeterinaryCare;
    }

}
