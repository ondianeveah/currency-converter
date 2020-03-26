package TalkingPets;

public class Dog extends Pet {
    private Integer legs;
    public Dog(String name) {
        super(name);
        this.legs = legs;
    }
    @Override
    public String speak(){
        return "Bark!!! Bark!!! Bark!!!";
    }

}
