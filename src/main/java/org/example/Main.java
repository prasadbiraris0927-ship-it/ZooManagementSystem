package org.example;


import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Zoo zoo=ZooFactory.createZoo();

        int choice = 0;
        do {


            System.out.println("===== ZOO MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Animal");
            System.out.println("2. Display All Animals");
            System.out.println("3. Search Animal by ID");
            System.out.println("4. Update Animal Health");
            System.out.println("5. Remove Animal");
            System.out.println("6. Exit");
            System.out.println("=================================");
            System.out.print("Enter your choice: ");
            if (sc.hasNextInt()){
                choice=sc.nextInt();

            }else{
                System.out.println("PLEASE ENTER A VALID NUMBER");
                sc.nextLine();
                continue;
            }

            switch (choice){
                case 1:
                    System.out.println("Enter the animal to add: \n1. Lion\n2.Elephant");
                    if (!sc.hasNextInt()) {
                        System.out.println("Invalid input! Please enter 1 or 2.");
                        sc.nextLine();
                        continue;
                    }

                    int animalOpt = sc.nextInt();
                    sc.nextLine();
                    if(animalOpt == 1){
                        System.out.println("enter the Lion ID: ");
                        if (!sc.hasNextInt()) {
                            System.out.println("Invalid ID! Please enter a number.");
                            sc.nextLine();
                            continue;
                        }

                        int animalId = sc.nextInt();
                        sc.nextLine();
                        if (zoo.findAnimal(animalId)!=null) {
                            System.out.println("Animal ID already exists!");
                            continue;
                        }

                        System.out.println("Enter Lion Name: ");
                        String name=sc.nextLine();
                        if (name.isBlank() || !name.matches("[a-zA-Z ]+")) {
                            System.out.println("Invalid name! Use letters and spaces only.");
                            continue;
                        }


                        System.out.println("Enter Lion Age: ");
                        if (!sc.hasNextInt()) {
                            System.out.println("Invalid age! Please enter a number.");
                            sc.nextLine();
                            continue;
                        }

                        int age=sc.nextInt();
                        sc.nextLine();

                        if (age < 0) {
                            System.out.println("Age cannot be negative!");
                            continue;
                        }

                        System.out.println("Enter Gender: ");
                        String gender=sc.nextLine();
                        if (!gender.equalsIgnoreCase("Male") &&
                                !gender.equalsIgnoreCase("Female")) {
                            System.out.println("Invalid gender! Enter Male or Female.");
                            continue;
                        }

                        System.out.println("Enter Health Status: ");
                        String healthStatus=sc.nextLine();
                        if (!healthStatus.equalsIgnoreCase("Healthy") &&
                                !healthStatus.equalsIgnoreCase("Unhealthy") &&
                                !healthStatus.equalsIgnoreCase("Under Observation")) {
                            System.out.println("Invalid health status!");
                            continue;
                        }

                        Lion lion=new Lion(animalId,name,age,gender,healthStatus);
                        zoo.addAnimal(lion);

                        System.out.println("Lion Added Successfully");

                    } else if (animalOpt==2) {
                        System.out.println("Enter the Elephant ID: ");
                        if (!sc.hasNextInt()) {
                            System.out.println("Invalid ID! Please enter a number.");
                            sc.nextLine();
                            continue;
                        }
                        int animalID=sc.nextInt();
                        sc.nextLine();
                        if (zoo.findAnimal(animalID) != null) {
                            System.out.println("Animal ID already exists!");
                            continue;
                        }

                        System.out.println("Enter Elephant Name: ");
                        String name=sc.nextLine();
                        if (name.isBlank() || !name.matches("[a-zA-Z ]+")) {
                            System.out.println("Invalid name! Use letters and spaces only.");
                            continue;
                        }

                        System.out.println("Enter Elephant Age: ");
                        if (!sc.hasNextInt()) {
                            System.out.println("Invalid age! Please enter a number.");
                            sc.nextLine();
                            continue;
                        }

                        int age=sc.nextInt();
                        sc.nextLine();

                        if (age < 0) {
                            System.out.println("Age cannot be negative!");
                            continue;
                        }

                        System.out.println("Elephant Gender: ");
                        String gender=sc.nextLine();
                        if (!gender.equalsIgnoreCase("Male") &&
                                !gender.equalsIgnoreCase("Female")) {
                            System.out.println("Invalid gender! Enter Male or Female.");
                            continue;
                        }

                        System.out.println("Enter Health Status: ");
                        String healthStatus=sc.nextLine();
                        if (!healthStatus.equalsIgnoreCase("Healthy") &&
                                !healthStatus.equalsIgnoreCase("Unhealthy") &&
                                !healthStatus.equalsIgnoreCase("Under Observation")) {
                            System.out.println("Invalid health status!");
                            continue;
                        }

                        Elephant elephant=new Elephant(animalID,name,age,gender,healthStatus);
                        zoo.addAnimal(elephant);

                        System.out.println("Elephant Added Sucessfully");

                    }else {
                        System.out.println("Invalid animal selection! Choose 1 or 2.");
                    }
                    break;

                case 2:
                    System.out.println("Display All Animals selected");
                    zoo.displayAllAnimals();
                    break;

                case 3:
                    System.out.println("Search Animal selected ");
                    int searchID=sc.nextInt();
                    Animal found= zoo.findAnimal(searchID);

                    if(found!=null){
                        System.out.println("Animal Found");
                        found.displayDetails();
                    }else {
                        System.out.println("Animal Not Found with ID: "+searchID);
                    }
                    break;

                case 4:
                    System.out.println("Enter Animal ID to Update Health: ");
                    int aniId = sc.nextInt();
                    sc.nextLine();
                    if (zoo.findAnimal(aniId) !=null){
                        System.out.println("Enter health Status");
                        String updateStatus=sc.nextLine();
                        zoo.findAnimal(aniId).setHealthStatus(updateStatus);

                    }else {
                        System.out.println("Animal Doesnt Exist");
                    }


                    break;

                case 5:
                    System.out.println("Enter Id of the animal you want to remove: ");
                    int removeId=sc.nextInt();
                    if (zoo.removeAnimal(removeId)){
                        System.out.println("Animal Removed Successfully");
                    }else {
                        System.out.println("No Such Animal ID exists");
                    }

                    break;

                case 6:
                    System.out.println("Exit selected");
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        }while(choice!=6);
        sc.close();

        }









    }
