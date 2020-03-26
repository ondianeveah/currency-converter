package HumanBeing;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Bob", 21, "football", "Engineer", 100000);

        System.out.println(person1.printThisMessage());
        System.out.println(person1.originalSalary("Original salary:"));
        System.out.println(person1.getSalary());
        System.out.println(person1.newSalary());
        person1.setSalary(175000);
        System.out.println(person1.getSalary());
        System.out.println(person1.printBonusAdded());
        System.out.println(person1.yearlyBonusAdded(5000));

        if(true){
            System.out.println("He enjoys being an Engineer because he gets paidddddddd!!!!!");
        }

    }

}
