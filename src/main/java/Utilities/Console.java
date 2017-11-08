package Utilities;

import Currency.CurrencyConverter;

import java.util.Scanner;

public class Console {
    public static final Scanner sc = new Scanner(System.in);

    public static String getStringInput(String prompt) {
        System.out.println(prompt);
        String output = sc.nextLine();
        return output;
    }

    public static Double getDoubleInput(String prompt) {
        do {
            String originalString = getStringInput(prompt);
            try {
                Double output = Double.parseDouble(originalString);
                return output;
            }catch (IllegalArgumentException e) {
                Console.print("Please enter a number.");
            }
        }while (true);
    }

    public static Integer getIntegerInput(String prompt) {
        Double originalDouble = getDoubleInput(prompt);
        Integer output = originalDouble.intValue();
        return output;
    }

    public static void print(String input) {
        System.out.println(input);
    }

    public static void print(Double input) {
        System.out.println(input);
    }

    public static String currencyMenu() {
        String output =
                "============================================\n" +
                "USD EUR GBP INR AUD CAD SGD CHF MYR JPY CNY\n" +
                "============================================\n";
        return output;
    }



}
