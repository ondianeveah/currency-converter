package currency;

public class Yen implements ConvertibleCurrency {
    @Override
    public double Double(CurrencyType currencyType) {
        return currencyType.getRate() / getCurrencyType().getRate();
    }

    private CurrencyType type = CurrencyType.YEN;

    @Override
    public CurrencyType getCurrencyType() {
        return this.type;
    }
}
