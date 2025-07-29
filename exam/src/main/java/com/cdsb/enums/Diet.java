package com.cdsb.enums;

public enum Diet {

    HERBIVORE("Herbívoro"),
    CARNIVORE("Carnívoro"),
    OMNIVORE("omnivore");

    String name;

    Diet(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
