package currency;

public class AustralianDollar implements ConvertibleCurrency {
    @Override
    public double Double(CurrencyType currencyType) {
        return currencyType.getRate() / getCurrencyType().getRate();
    }

    private CurrencyType type = CurrencyType.AUSTRALIAN_DOLLAR;

    @Override
    public CurrencyType getCurrencyType() {
        return this.type;
    }
}
