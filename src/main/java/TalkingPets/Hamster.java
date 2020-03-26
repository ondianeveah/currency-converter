package TalkingPets;

public class Hamster extends Pet {
    private Integer age;
    public Hamster(String name) {
        super(name);
        this.age = age;
    }
    @Override
    public String speak(){
        return "Nibble..nibble";
    }
}
