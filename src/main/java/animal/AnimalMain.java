package animal;

public class AnimalMain {
    public static void main(String[] args) {
        Animal dog = new Dog("Remy");
        Animal cat = new Cat("Bear");
        System.out.println(cat.getName());
        ImaginaryCat myImaginaryCat = new ImaginaryCat();
        myImaginaryCat.wagsTail();

    }
}
