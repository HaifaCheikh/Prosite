package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;
import tn.esprit.gestionzoo.exceptions.InvalidAgeException;
import tn.esprit.gestionzoo.exceptions.ZooFullException;

public class ZooManagement {

    public static void main(String[] args) {

        try {
            Animal dolphin = new Dolphin("Delphinidae", "Dolphin", 15, true, "sea", 55.5f);
            Animal penguin = new Penguin("Spheniscidae", "Penguin", 10, false, "polar", 20f);
            Animal lion = new Terrestrial("Felidae", "Lion", 8, true, 4);
            Zoo zoo = new Zoo("Esprit Zoo", "Tunis");

            zoo.addAnimal(dolphin);
            zoo.addAnimal(penguin);
            zoo.addAnimal(lion);

            zoo.displayAnimals();

            System.out.println("Maximum Penguin Swimming Depth: " + zoo.maxPenguinSwimmingDepth());
            zoo.displayNumberOfAquaticsByType();

        } catch (InvalidAgeException | ZooFullException e) {
            e.printStackTrace();
        }
    }
}

