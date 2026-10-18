package org.example;

public class Elephant extends Animal {

    @Override
    public void makeSound(){
        System.out.println("trumpeting");
    }


    public Elephant(int animalId, String name, int age,
                   String gender, String healthStatus){
        super(animalId,name,age,"Elephant",gender,healthStatus);
    }


}
