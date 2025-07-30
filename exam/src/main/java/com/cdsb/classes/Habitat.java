package com.cdsb.classes;

import java.util.ArrayList;
import java.util.List;

import com.cdsb.enums.HabitatType;
import com.cdsb.interfaces.IAnimals;
import com.cdsb.interfaces.IHabitat;

public class Habitat implements IHabitat{

    private String name;
    private HabitatType habitatType;
    private List<IAnimals> animals;

    public Habitat(String name, HabitatType habitatType) {
        this.name = name;
        this.habitatType = habitatType;
        this.animals = new ArrayList<>();
    }

    //GETTERS
    public String getName() {
        return name;
    }

    public HabitatType getHabitatType() {
        return habitatType;
    }

    //METHODS

    public void addAnimal(IAnimals specie) {
        //compruebo la compatibilidad entre animales y si el habitat es el mismo.
        boolean isCompatible = true;

        //recorremos la lista de animales para ver si un nuevo animal es compatible con los animales existentes, no compatible no lo añadimos
        for (IAnimals actual : animals) {
            if (!actual.isCompatibleWith(specie) || !specie.isCompatibleWith(actual)) {
                isCompatible = false; // devolvemos esto si no son compatibles
                break;
            }
        }

        if (isCompatible) {
            animals.add(specie); //añadimos el animal
            System.out.print("'%s' ha sido añadido al habitat: %s \n".formatted(specie.getSpecies(), name));
        } else {
            System.out.print("'%s' no es compatible con los animales del habitat: %s \n".formatted(specie.getSpecies(), name));
        }
    }

    public void showAnimals() { // mostramos los animales que viven en un habitat
        System.out.print("Animales en el habitat %s: ".formatted(name));
        for (IAnimals animal : animals) {
            System.out.println("- " + animal.getSpecies());
        }
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("Habitat [ ");
        sb.append("Name: " + name + ", ") ;
        sb.append(" HabitatType: " + habitatType);
        sb.append(" ]");
        return sb.toString();
    }

    @Override
    public void removeAnimal(IAnimals animal) {
        animals.remove(animal);
    }

}
