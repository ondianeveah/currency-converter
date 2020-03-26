package TalkingPets;

import java.util.ArrayList;
import java.util.Scanner;

public class HowManyPets {
    public static void petsRun () {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> pets = new ArrayList<>();
        int numberOfPets;
        String kindsOfPets;
        String names = "";
        Pet pet1 = new Pet(names);
        Dog dog = new Dog(names);
        Cat cat = new Cat(names);
        Hamster hamster = new Hamster(names);


            System.out.println("How many pets do you have?");
            numberOfPets = sc.nextInt();
            for (int x = 0; x < numberOfPets; x++){
                System.out.println("What are their names?");
                names = sc.next();
                System.out.println("What are the kinds of pets you have?");
            kindsOfPets = sc.next().toLowerCase();
            switch(kindsOfPets){
                case "dog":
                    dog.setName(names);
                    pets.add(dog.getName() + " : " + dog.speak());
                    break;
                case "cat":
                    cat.setName(names);
                    pets.add(cat.getName() + " : " + cat.speak());
                    break;
                case "hamster":
                    hamster.setName(names);
                    pets.add(hamster.getName() + " : " + hamster.speak());
                    break;
                default:
                    pets.add(pet1.speak());
            }
        }
            for(String i: pets){
                System.out.println(i);
            }
        }
    }
