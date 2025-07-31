package com.cdsb;

import com.cdsb.classes.Dolphin;
import com.cdsb.classes.Elephant;
import com.cdsb.classes.Habitat;
import com.cdsb.classes.Iguana;
import com.cdsb.classes.Lion;
import com.cdsb.classes.Parrot;
import com.cdsb.classes.Seal;
import com.cdsb.classes.Snake;
import com.cdsb.classes.Toucan;
import com.cdsb.classes.Zebra;
import com.cdsb.enums.HabitatType;


public final class App {

    public static void main(String[] args) {
        System.out.println("*** GESTIONANDO EL ZOO ***");
        System.out.println("-".repeat(40));

        // Primero creamos los habitats, uno de cada tipo
        Habitat savanna = new Habitat("Sabana", HabitatType.TERRESTRIAL);
        Habitat ocean = new Habitat("Océano", HabitatType.AQUATIC);
        Habitat terrarium = new Habitat("Terrario", HabitatType.TERRARIUM);
        System.out.println(savanna);
        System.out.println("-".repeat(40));

        // Creamos animales
        Elephant elephant = new Elephant("Elefante");
        Zebra zebra = new Zebra("Zebra");
        Lion lion = new Lion("León");
        Dolphin dolphin = new Dolphin("Delfín");
        Seal seal = new Seal("Foca");
        Parrot parrot = new Parrot("Loro");
        Toucan toucan = new Toucan("Tucan");
        Snake snake = new Snake("Serpiente");
        Iguana iguana = new Iguana("Iguana");
        System.out.println("Animal creado: " + elephant);

        System.out.println("-".repeat(40));

        //Hay compatibilidad entre ellos
        System.out.println("Hay Compatibilidad ?");
        System.out.println("Elefante y Zebra: " + elephant.isCompatibleWith(zebra));// true
        System.out.println("León y Zebra: " + lion.isCompatibleWith(zebra));// false
        System.out.println("Delfín y Foca: " + dolphin.isCompatibleWith(seal));// true
        System.out.println("Loro y Tucan: " + parrot.isCompatibleWith(toucan));// true
        System.out.println("Serpiente y Iguana: " + snake.isCompatibleWith(iguana));// false

        System.out.println("-".repeat(40));

        // Añadimos los animales a sus habitats
        System.out.println("Añado animales al habitat: ");
        savanna.addAnimal(zebra);
        savanna.addAnimal(elephant);

        savanna.addAnimal(lion); //no agregar si hay presa

        ocean.addAnimal(dolphin);
        ocean.addAnimal(seal);

        terrarium.addAnimal(parrot);
        terrarium.addAnimal(toucan);
        terrarium.addAnimal(iguana);
        terrarium.addAnimal(snake);
        System.out.println("-".repeat(40));

        //Probamos a eliminar un animal
        ocean.removeAnimal(seal);

        // Mostramos lo gestionado en el zoo
        System.out.println("\nESTADO DEL ZOO:");
        savanna.showAnimals();
        ocean.showAnimals();
        terrarium.showAnimals();
        System.out.println("-".repeat(40));

        //Mostramos funcionalidad extra sonidos animales

        System.out.println("Lion says: " + lion.makeSound());
        System.out.println("Elephant says: " + elephant.makeSound());
        System.out.println("Zebra says: " + zebra.makeSound());
        System.out.println("Parrot says: " + parrot.makeSound());
        System.out.println("Toucan says: " + toucan.makeSound());
        System.out.println("Snake says: " + snake.makeSound());
        System.out.println("Iguana says: " + iguana.makeSound());
        System.out.println("Dolphin says: " + dolphin.makeSound());
        System.out.println("Seal says: " + seal.makeSound());
    }
}
