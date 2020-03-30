package SuperHero;

public class SuperHeroTester {
    public static void main(String[] args) {
        SuperHero pantherMan = new PantherMan("panther Suit", "Black tights", "Panther whisperer.");
        System.out.println(pantherMan.useSpecialPower());
        System.out.println(pantherMan.putOnSuit());
        FriedEggMan friedEggMan = new FriedEggMan(true, "John");
        System.out.println(friedEggMan.getName());
        System.out.println(friedEggMan.getLikesEggs());

    }
}
