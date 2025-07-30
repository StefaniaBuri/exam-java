package com.cdsb.enums;

public enum AnimalType {
    MAMMALS("Mamíferos"),
    BIRDS("Aves"),
    REPTILES("Reptiles"),
    AQUATICS("Animales Acuáticos");

    String name;

    AnimalType(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
