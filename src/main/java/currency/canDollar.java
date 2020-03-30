package currency;

public class canDollar implements ConvertibleCurrency {
    @Override
    public double Double(CurrencyType currencyType) {
        return currencyType.getRate() / getCurrencyType().getRate();
    }

    private CurrencyType type = CurrencyType.CANADIAN_DOLLAR;

    @Override
    public CurrencyType getCurrencyType() {
        return this.type;
    }
}
