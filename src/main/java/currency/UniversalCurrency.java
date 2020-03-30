package currency;

public class UniversalCurrency implements ConvertibleCurrency {
    @Override
    public double Double(CurrencyType currencyType) {
        return currencyType.getRate() / getCurrencyType().getRate();
    }

    private CurrencyType type = CurrencyType.UNIVERSAL_CURRENCY;

    @Override
    public CurrencyType getCurrencyType() {
        return this.type;
    }
}
