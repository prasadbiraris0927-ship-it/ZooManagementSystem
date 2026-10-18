package org.example;

public class Lion extends Animal {

    @Override
    public void makeSound(){
        System.out.println("Roars");
    }

    public Lion(int animalId, String name, int age,
                String gender, String healthStatus){
        super(animalId,name,age,"Lion",gender,healthStatus);

    }

}
