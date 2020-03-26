package TalkingPets;

public class Cat extends Pet {
    private Boolean tail;
    public Cat(String name) {
        super(name);
        this.tail = tail;
    }

    @Override
    public String speak(){
        return "Meow, Meow";
    }
}
