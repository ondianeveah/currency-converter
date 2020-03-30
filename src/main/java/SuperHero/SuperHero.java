package SuperHero;

public abstract class SuperHero {
    private String suit;
    private String tights;
    private String specialPower;

    public SuperHero(String suit, String tights, String specialPower){
        this.suit = suit;
        this.tights = tights;
        this.specialPower = specialPower;
    }

    public abstract String useSpecialPower();

    public abstract String putOnSuit();

    public String getSuit() {
        return suit;
    }

    public String getTights() {
        return tights;
    }

    public String getSpecialPower() {
        return specialPower;
    }
}
