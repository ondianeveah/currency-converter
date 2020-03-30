package currency;

public class Franc implements ConvertibleCurrency {
    @Override
    public double Double(CurrencyType currencyType) {
        return currencyType.getRate() / getCurrencyType().getRate();
    }

    private CurrencyType type = CurrencyType.FRANC;

    @Override
    public CurrencyType getCurrencyType() {
        return this.type;
    }
}
