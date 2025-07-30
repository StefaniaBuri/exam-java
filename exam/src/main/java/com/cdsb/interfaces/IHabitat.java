package com.cdsb.interfaces;

import com.cdsb.enums.HabitatType;

public interface IHabitat {

    //definimos lo debe tener un habitat.
    //GETTERS
   String getName(); //nombre
   HabitatType getHabitatType(); // tipo de habitat(TERRESTRIAL,etc)

    //LÓGICA
   void addAnimal(IAnimals animal); //añadimos un animal al habitat, solo compatible
   void removeAnimal(IAnimals animal); //eliminamos animales
   void showAnimals(); //mostramos los animales actuales en ese hábitat
}
