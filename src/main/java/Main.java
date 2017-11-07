import Utilities.Console;

public class Main {

    public static void main(String[] args) {
        String currentCurrencyType = CurrencyConverter.cc.checkCurrencyType("Please enter the type of currency you currently have.");
        String desiredCurrencyType = CurrencyConverter.cc.checkCurrencyType("Please enter the type of currency you would like to have.");
        Double currentAmountOfMoney = Console.getDoubleInput("Please enter the amount of money you would like to convert.");

        CurrencyConverter.cc.setAllValues(currentCurrencyType,desiredCurrencyType,currentAmountOfMoney);
        Double convertedValueOfCurrency = CurrencyConverter.cc.desiredCurrencyValue();
        Console.print(convertedValueOfCurrency);

    }
}
