package TalkingPets;

import java.util.ArrayList;
import java.util.Scanner;

public class HowManyPets {
    public static void petsRun() { //called in "PetTester" to run program
        Scanner sc = new Scanner(System.in); //scans for user's input
        ArrayList<String> pets = new ArrayList<>();
        int numberOfPets; // allows user to input number of pets
        String kindsOfPets; //stores information(user's input for kind of pets they have
        String names = ""; //stores information(user's input names) & initializes names
        Pet pet1 = new Pet(names); //makes new pet object called "pet1"
        Dog dog = new Dog(names); //makes new dog object called "dog"
        Cat cat = new Cat(names); //makes new cat object called "cat"
        Hamster hamster = new Hamster(names); //makes new hamster object called "hamster"


        System.out.println("How many pets do you have?");
        numberOfPets = sc.nextInt(); //when user inputs how many pets it is stored here
        for (int x = 0; x < numberOfPets; x++) { //allows to keep asking kinds of pets and names when given # of pets
            System.out.println("What are the kinds of pets you have?");
            kindsOfPets = sc.next().toLowerCase(); //when user inputs what kind of pet it is stored here
            System.out.println("What are their names?");
            names = sc.next(); //when user inputs name of pet it is stored here
            switch (kindsOfPets) {
                case "dog": //
                    dog.setName(names); // set name of object "dog"
                    pets.add(dog.getName() + " : " + dog.speak()); //adds object's name and the result of the speak method to ArrayList
                    break;
                case "cat":
                    cat.setName(names);
                    pets.add(cat.getName() + " : " + cat.speak()); //adds object's name and the result of the speak method to ArrayList
                    break;
                case "hamster":
                    hamster.setName(names);
                    pets.add(hamster.getName() + " : " + hamster.speak()); //adds object's name and the result of the speak method to ArrayList
                    break;
                default:
                    pet1.setName(names);
                    pets.add(pet1.getName() + " : " + pet1.speak()); //if anything else added will be given this
            }
            for (String i : pets) { //for each pet it prints out ArrayList
                System.out.println(i);
            }
        }
    }
}
