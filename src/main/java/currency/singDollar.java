package currency;

public class singDollar implements ConvertibleCurrency {
    @Override
    public double Double(CurrencyType currencyType) {
        return currencyType.getRate() / getCurrencyType().getRate();
    }

    private CurrencyType type = CurrencyType.SINGAPORE_DOLLAR;

    @Override
    public CurrencyType getCurrencyType() {
        return this.type;
    }
}
