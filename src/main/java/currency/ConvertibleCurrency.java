package currency;

public interface ConvertibleCurrency {
    default double Double(CurrencyType currencyType) {
        return Double.MAX_VALUE;
    }
    CurrencyType getCurrencyType();
}
