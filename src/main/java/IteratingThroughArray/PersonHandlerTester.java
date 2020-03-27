package IteratingThroughArray;



public class PersonHandlerTester {
    public static void main(String[] args) {
        Person person1 = new Person("Ondia", "Brown.");
        Person person2 = new Person("What's", "Up.");
        Person person3 = new Person("Good", "Morning.");
        Person[] people = {person1, person2, person3};

        PersonHandler whatever = new PersonHandler(people);
        System.out.println(whatever.whileLoop());
        System.out.println("++++++++++++++++++++++++");

        System.out.println(whatever.forLoop());
        System.out.println("++++++++++++++++++++++++");

        System.out.println(whatever.forEachLoop());
        System.out.println("++++++++++++++++++++++++");
    }
    }



