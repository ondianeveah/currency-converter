package currency;

public class Ringgit implements ConvertibleCurrency {
    @Override
    public double Double(CurrencyType currencyType) {
        return currencyType.getRate() / getCurrencyType().getRate();
    }

    private CurrencyType type = CurrencyType.RINGGIT;

    @Override
    public CurrencyType getCurrencyType() {
        return this.type;
    }
}
