package SuperHero;

public class FriedEggMan {
   private Boolean likesEggs;
   private String name;

   public FriedEggMan(Boolean likesEggs, String name){
       this.likesEggs = likesEggs;
       this.name = name;
   }

    public Boolean getLikesEggs() {
        return likesEggs;
    }

    public String getName() {
        return "My name is: " + name;
    }
}
