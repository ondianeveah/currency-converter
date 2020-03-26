package animal;

public class Cat {
    private Integer legs;
    private Boolean hasFur;
    private String name;

    //constructor
    public Cat(Integer legs, Boolean hasFur, String name){
        this.legs = legs;
        this.hasFur = hasFur;
        this.name = name;
    }

    public String makesNoise(String sound){
        return "Meow";
    }
}
