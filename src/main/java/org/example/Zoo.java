
package org.example;

import java.util.ArrayList;

public class Zoo {

    private final ArrayList<Animal> animals = new ArrayList<>();



    public void addAnimal(Animal animal){
        animals.add(animal);

    }
    public void displayAllAnimals(){
        for (Animal animal:animals){
            animal.displayDetails();
        }
    }

    public Animal findAnimal(int animalId){
        for (Animal animal:animals){
            if (animal.getAnimalId()==animalId){
                return animal;
            }
        }
        return null;

    }
    public boolean removeAnimal(int animalID){
        Animal animalToRemove=findAnimal(animalID);
        if (animalToRemove!=null){
            animals.remove(animalToRemove);

            return true;
        }else
            return false;

    }

}
