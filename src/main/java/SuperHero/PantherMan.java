package SuperHero;

public class PantherMan extends SuperHero {
    public PantherMan(String suit, String tights, String specialPower) {
        super(suit, tights, specialPower);
    }

    @Override
    public String useSpecialPower(){
        return "I don't like my special power which is: " + getSpecialPower();
    }

    @Override
    public String putOnSuit(){
        return "I put on my " + getSuit() + " everyday.";

    }
}
