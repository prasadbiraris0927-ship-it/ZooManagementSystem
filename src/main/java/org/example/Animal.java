package org.example;

public abstract class Animal {

    private int animalId;
    private String name;
    private int age;
    private String species;
    private String gender;
    private String healthStatus;

    public void setHealthStatus(String healthStatus) {
        if (healthStatus==null || healthStatus.isBlank()){
            throw new IllegalStateException("Health Status cant be Empty");
        }
        this.healthStatus = healthStatus;
    }

    public void setName(String name) {
        if (name==null || name.isBlank()){
            throw new IllegalArgumentException("name cant be null or blank ");
        }
        this.name = name;
    }

    public void setAge(int age) {
        if (age<0){
            throw new IllegalArgumentException("Age cant be Negative");
        }

        this.age = age;
    }



    public Animal(int animalId, String name, int age, String species, String gender, String healthStatus){
        this.animalId=animalId;
        this.name=name;
        if (age<0){
            throw new IllegalArgumentException("Age cant be Negative");
        }
        this.age=age;
        this.species=species;
        this.gender=gender;
        this.healthStatus=healthStatus;


    }

    public int getAnimalId() {
        return animalId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSpecies() {
        return species;
    }

    public String getGender() {
        return gender;
    }

    public String getHealthStatus() {
        return healthStatus;
    }

    public void displayDetails() {
        System.out.println("Animal ID: " + this.animalId);
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Species: " + this.species);
        System.out.println("Gender: " + this.gender);
        System.out.println("Health: " + this.healthStatus);

    }
    public abstract void makeSound();
    }


