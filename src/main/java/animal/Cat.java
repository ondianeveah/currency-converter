package animal;

public class Cat extends Feline {
    public Cat(String name) {
        super(name);
    }
    @Override
    public  void eat(){
        System.out.println("Drinks milk");
    }
}
