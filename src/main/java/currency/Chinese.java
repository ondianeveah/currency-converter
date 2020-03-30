package currency;

public class Chinese implements ConvertibleCurrency {
    @Override
    public double Double(CurrencyType currencyType) {
        return currencyType.getRate() / getCurrencyType().getRate();
    }

    private CurrencyType type = CurrencyType.CHINESE_YR;

    @Override
    public CurrencyType getCurrencyType() {
        return this.type;
    }
}
