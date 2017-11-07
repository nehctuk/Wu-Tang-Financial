import Utilities.Console;

import java.util.InputMismatchException;

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
        UsDollar(1.00),
        Euro(0.94),
        BritishPound(0.82),
        IndianRupee(68.32),
        AustralianDollar(1.35),
        CanadianDollar(1.32),
        SingaporeDollar(1.43),
        SwissFranc(1.01),
        MalaysianRinggit(4.47),
        JapaneseYen(115.84),
        ChineseYuanRenminbi(6.92);

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
        Double desiredCurrencyValue = currencyAmountInDollars()*desiredCurrencyRate;
        return desiredCurrencyValue;
    }

    public Double currencyAmountInDollars(){
        Double currentCurrencyRate = getConversionRate(this.currentCurrencyType);
        Double desiredCurrencyAmountInDollars = this.currentAmount/currentCurrencyRate;
        return desiredCurrencyAmountInDollars;
    }

    public String checkCurrencyType(String prompt){
        String currencyType = Console.getStringInput(prompt);
        do {
            try {
                ConversionRates.valueOf(currencyType);
                return currencyType;
            } catch (IllegalArgumentException e) {
                currencyType = Console.getStringInput("Please enter a valid type of currency.");
            }
        }while (true);
    }

    public Double getConversionRate(String currency) {
        Double conversionRate = null;

        switch (ConversionRates.valueOf(currency)) {
            case UsDollar:
                conversionRate = ConversionRates.UsDollar.getRate();
                break;
            case Euro:
                conversionRate = ConversionRates.Euro.getRate();
                break;
            case BritishPound:
                conversionRate = ConversionRates.BritishPound.getRate();
                break;
            case IndianRupee:
                conversionRate = ConversionRates.IndianRupee.getRate();
                break;
            case AustralianDollar:
                conversionRate = ConversionRates.AustralianDollar.getRate();
                break;
            case CanadianDollar:
                conversionRate = ConversionRates.CanadianDollar.getRate();
                break;
            case SingaporeDollar:
                conversionRate = ConversionRates.SingaporeDollar.getRate();
                break;
            case SwissFranc:
                conversionRate = ConversionRates.SwissFranc.getRate();
                break;
            case MalaysianRinggit:
                conversionRate = ConversionRates.MalaysianRinggit.getRate();
                break;
            case JapaneseYen:
                conversionRate = ConversionRates.JapaneseYen.getRate();
                break;
            case ChineseYuanRenminbi:
                conversionRate = ConversionRates.ChineseYuanRenminbi.getRate();
                break;
            default:
                String correctCurrency = Console.getStringInput("Please enter a valid currency type.");
                getConversionRate(correctCurrency);
                break;
        }
        return conversionRate;
    }

}
