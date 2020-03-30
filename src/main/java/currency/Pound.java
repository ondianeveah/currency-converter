package currency;

public class Pound implements ConvertibleCurrency {
    @Override
    public double Double(CurrencyType currencyType) {
        return currencyType.getRate() / getCurrencyType().getRate();
    }

    private CurrencyType type = CurrencyType.POUND;

    @Override
    public CurrencyType getCurrencyType() {
        return this.type;
    }
}
