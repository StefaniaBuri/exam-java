package com.cdsb.classes;

import com.cdsb.enums.AnimalType;
import com.cdsb.enums.BehaviorType;
import com.cdsb.enums.Diet;
import com.cdsb.enums.HabitatType;
import com.cdsb.interfaces.IAnimals;

public abstract class Animals implements IAnimals {

    private String name;
    private String species;
    private AnimalType animalType;
    private HabitatType habitatType;
    private Diet dietType;
    private int requiredSpace;
    private BehaviorType behaviorType;
    private String needVeterinaryCare;
    private boolean canCoexist;

    public Animals(String name, String species, AnimalType animalType, HabitatType habitatType,
            Diet dietType, int requiredSpace, BehaviorType behaviorType, String needVeterinaryCare,
            boolean canCoexist) {
        this.name = name;
        this.species = species;
        this.animalType = animalType;
        this.habitatType = habitatType;
        this.dietType = dietType;
        this.requiredSpace = requiredSpace;
        this.behaviorType = behaviorType;
        this.needVeterinaryCare = needVeterinaryCare;
        this.canCoexist = canCoexist;
    }

    // GETTERS

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getSpecies() {
        return species;
    }

    @Override
    public AnimalType getAnimalType() {
        return animalType;
    }

    @Override
    public HabitatType getHabitatType() {
        return habitatType;
    }

    @Override
    public Diet getDietType() {
        return dietType;
    }

    @Override
    public int getRequiredSpace() {
        return requiredSpace;
    }

    @Override
    public BehaviorType getBehaviorType() {
        return behaviorType;
    }

    @Override
    public String getVeterinaryCare() {
        return needVeterinaryCare;
    }

    // METHODS

    @Override
    public boolean canLiveTogether() {
        return canCoexist;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("Animal [ " + "\n");
        sb.append("Name: " + name + "\n") ;
        sb.append("AnimalType: " + animalType + "\n");
        sb.append("HabitatType: " + habitatType + "\n");
        sb.append("DietType: " + dietType + "\n");
        sb.append("BehaviorType: " + behaviorType + "\n");
        sb.append("RequiredSpace: " + requiredSpace + "\n");
        sb.append("NeedVeterinaryCare: " + needVeterinaryCare + "\n");
        sb.append("CanCoexist: " + canCoexist);
        sb.append(" ]");
        return sb.toString();
    }
}
