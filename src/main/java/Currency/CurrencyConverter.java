package Currency;

import Utilities.Console;

public class CurrencyConverter {
    public static final CurrencyConverter cc = new CurrencyConverter();
    private String currentCurrencyType;
    private String desiredCurrencyType;
    private Double currentAmount;

    public CurrencyConverter() {}

    public void setAllValues(String currentCurrencyType, String desiredCurrencyType, Double currentAmountOfMoney) {
        setCurrentCurrencyType(currentCurrencyType);
        setDesiredCurrencyType(desiredCurrencyType);
        setCurrentAmount(currentAmountOfMoney);
    }

    public void setCurrentCurrencyType(String currentCurrencyType) {
        this.currentCurrencyType = currentCurrencyType;
    }

    public void setDesiredCurrencyType(String desiredCurrencyType) {
        this.desiredCurrencyType = desiredCurrencyType;
    }

    public void setCurrentAmount(Double currentAmount) {
        this.currentAmount = currentAmount;
    }

    public enum ConversionRates {
        USD(1.00),
        EUR(0.94),
        GBP(0.82),
        INR(68.32),
        AUD(1.35),
        CAD(1.32),
        SGD(1.43),
        CHF(1.01),
        MYR(4.47),
        JPY(115.84),
        CNY(6.92);

        Double rate;

        ConversionRates(Double rate) {
            this.rate = rate;
        }

        public Double getRate() {
            return rate;
        }
    }

    public Double desiredCurrencyValue() {
        Double desiredCurrencyRate = getConversionRate(this.desiredCurrencyType);
        Double desiredCurrencyValue = currencyBaseAmount()*desiredCurrencyRate;
        return desiredCurrencyValue;
    }

    public Double currencyBaseAmount(){
        Double currentCurrencyRate = getConversionRate(this.currentCurrencyType);
        Double desiredCurrencyAmountInDollars = this.currentAmount/currentCurrencyRate;
        return desiredCurrencyAmountInDollars;
    }

    public String checkCurrencyType(String prompt){
        String currencyType = Console.getStringInput(prompt).toUpperCase();
        do {
            try {
                ConversionRates.valueOf(currencyType);
                return  currencyType;
            } catch (IllegalArgumentException e) {
                currencyType = Console.getStringInput("Please enter a valid type of currency.");
            }
        }while (true);
    }

    public static Double getConversionRate(String currencyType) {
        do {
            try {
                ConversionRates currencyFound = CurrencyConverter.ConversionRates.valueOf(currencyType);
                return currencyFound.getRate();
            } catch (IllegalArgumentException e) {
                currencyType = Console.getStringInput("Please enter a valid type of currency.");
            }
        }while (true);
    }

}
