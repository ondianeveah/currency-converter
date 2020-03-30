package currency;

public class usDollar implements ConvertibleCurrency {
    @Override
    public double Double(CurrencyType currencyType) {
        return currencyType.getRate() / getCurrencyType().getRate();
    }

    private CurrencyType type = CurrencyType.US_DOLLAR;

    @Override
    public CurrencyType getCurrencyType() {
        return this.type;
    }
}
