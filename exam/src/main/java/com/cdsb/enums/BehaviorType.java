package com.cdsb.enums;

public enum BehaviorType {

    PREDATOR("Depredador"),
    PREY("Presa"),
    SOCIAL("Sociable"),
    TERRITORIAL("Territorial");

    String name;

    BehaviorType(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
