package org.example;

public class ZooFactory {

    public static Zoo createZoo(){

        Zoo zoo=new Zoo();
        Lion l1=new Lion(101,"Simba",5,"Male","Healthy");
        Lion l2=new Lion(102,"Leo",3,"Male","Healthy");
        Lion l3=new Lion(103,"Rambo",8,"Male","Unhealthy");
        Elephant e1=new Elephant(201,"Rani",7,"Female","Unhealthy");
        Elephant e2=new Elephant(202,"Hans",6,"Male","Healthy");
        Elephant e3=new Elephant(203,"Jumbo",9,"Male","Healthy");

        zoo.addAnimal(l1);
        zoo.addAnimal(l2);
        zoo.addAnimal(l3);
        zoo.addAnimal(e1);
        zoo.addAnimal(e2);
        zoo.addAnimal(e3);

        return zoo;
    }
}
