package currency;

public class NewCurrencyConverter {
    public static Double amountOfBaseCurrency;
    public static Double convertibleCurrency;
    public static Double currencyType;
    public static Double targetCurrencyType;
    public static Double sourceCurrencyType;

    public NewCurrencyConverter(Double amountOfBaseCurrency, Double convertibleCurrency, Double currencyType, Double targetCurrencyType, Double sourceCurrencyType){
        this.amountOfBaseCurrency = amountOfBaseCurrency;
        this.convertibleCurrency = convertibleCurrency;
        this.currencyType = currencyType;
        this.targetCurrencyType = targetCurrencyType;
        this.sourceCurrencyType = sourceCurrencyType;
    }

    public Double getAmountOfBaseCurrency() {
        return amountOfBaseCurrency;
    }

    public void setAmountOfBaseCurrency(Double amountOfBaseCurrency) {
        this.amountOfBaseCurrency = amountOfBaseCurrency;
    }

    public Double getConvertibleCurrency() {
        return convertibleCurrency;
    }

    public void setConvertibleCurrency(Double convertibleCurrency) {
        this.convertibleCurrency = convertibleCurrency;
    }

    public Double getCurrencyType() {
        return currencyType;
    }

    public void setCurrencyType(Double currencyType) {
        this.currencyType = currencyType;
    }

    public Double getTargetCurrencyType() {
        return targetCurrencyType;
    }

    public void setTargetCurrencyType(Double targetCurrencyType) {
        this.targetCurrencyType = targetCurrencyType;
    }

    public Double getSourceCurrencyType() {
        return sourceCurrencyType;
    }

    public void setSourceCurrencyType(Double sourceCurrencyType) {
        this.sourceCurrencyType = sourceCurrencyType;
    }
}
