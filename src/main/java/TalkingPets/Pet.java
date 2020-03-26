package TalkingPets;

public class Pet {

    private String name;

    public Pet( String name) {
        this.name = name;
    }

    public String petsSpeak(String sound) {
        return sound;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String speak(){
        return "pets make sounds";
    }
}
