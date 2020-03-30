package currency;

public class Euro implements ConvertibleCurrency {
    @Override
    public double Double(CurrencyType currencyType) {
        return currencyType.getRate() / getCurrencyType().getRate();
    }

    private CurrencyType type = CurrencyType.EURO;

    @Override
    public CurrencyType getCurrencyType() {
        return this.type;
    }
}
