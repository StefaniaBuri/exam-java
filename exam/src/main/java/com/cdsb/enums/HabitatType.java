package com.cdsb.enums;

public enum HabitatType {

    TERRESTRIAL("Terrestre"),
    AQUATIC("Acuáticos"),
    TERRARIUM("Terrario");

    String name;

    HabitatType(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
