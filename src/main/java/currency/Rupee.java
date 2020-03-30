package currency;

public class Rupee implements ConvertibleCurrency {
    @Override
    public double Double(CurrencyType currencyType) {
        return currencyType.getRate() / getCurrencyType().getRate();
    }

    private CurrencyType type = CurrencyType.RUPEE;

    @Override
    public CurrencyType getCurrencyType() {
        return this.type;
    }
}
