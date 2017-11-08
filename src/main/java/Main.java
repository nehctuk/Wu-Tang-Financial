import Currency.CurrencyConverter;
import Utilities.Console;

public class Main {

    public static void main(String[] args) {
        convertMoney();

    }

    private static void convertMoney() {
        String currentCurrencyType = CurrencyConverter.cc.checkCurrencyType(Console.currencyMenu()+"Please enter the type of currency you currently have.");
        String desiredCurrencyType = CurrencyConverter.cc.checkCurrencyType(Console.currencyMenu()+"Please enter the type of currency you would like to have.");
        Double currentAmountOfMoney = Console.getDoubleInput("Please enter the amount of money you would like to convert.");

        CurrencyConverter.cc.setAllValues(currentCurrencyType,desiredCurrencyType,currentAmountOfMoney);
        Double convertedValueOfCurrency = CurrencyConverter.cc.desiredCurrencyValue();
        Console.print(String.format("%.2f %s",convertedValueOfCurrency, desiredCurrencyType));

        String continueProgramAnswer;
        do {
            continueProgramAnswer = Console.getStringInput("Would you like to perform another conversion?");
            if (continueProgramAnswer=="yes"){
                convertMoney();
            }
        }while (continueProgramAnswer=="yes");
    }


}
