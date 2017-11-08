import Currency.CurrencyConverter;
import org.junit.Assert;
import org.junit.Test;

public class CurrencyConverterTest {
    CurrencyConverter cc;

    @org.junit.Before
    public void setUp() throws Exception {
        cc = new CurrencyConverter();
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }


//    @Test
//    public void desiredCurrencyValueTest() throws Exception {
//        Double amount = 575.00;
//        Currency.CurrencyConverter.ConversionRates[] currency = Currency.CurrencyConverter.ConversionRates.values();
//        System.out.println(Arrays.toString(currency));
//
//        for(Currency.CurrencyConverter.ConversionRates aCurrency:currency) {
//            for (Currency.CurrencyConverter.ConversionRates eachCurrency:currency) {
//                System.out.println(aCurrency);
//                System.out.println(eachCurrency);
//                System.out.println(Currency.CurrencyConverter.cc.desiredCurrencyValue(amount,aCurrency.toString(),eachCurrency.toString()));
//            }
//        }
//    }

    @Test
    public void desiredCurrencyValueTest_DollarToEuro() {
        Double expected = 540.50;
        CurrencyConverter.cc.setAllValues("USD", "EUR", 575.00);
        Double actual = CurrencyConverter.cc.desiredCurrencyValue();
        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void desiredCurrencyValueTest_EuroToDollar() {
        Double expected = 611.70;
        CurrencyConverter.cc.setAllValues("EUR", "USD", 575.00);
        Double actual = CurrencyConverter.cc.desiredCurrencyValue();
        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void desiredCurrencyValueTest_EuroToBritishPound() {
        Double expected = 501.59;
        CurrencyConverter.cc.setAllValues("EUR", "GBP", 575.00);
        Double actual = CurrencyConverter.cc.desiredCurrencyValue();
        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void desiredCurrencyValueTest_BritishPoundToIndianRupee() {
        Double expected = 47907.32;
        CurrencyConverter.cc.setAllValues("GBP", "INR", 575.00);
        Double actual = CurrencyConverter.cc.desiredCurrencyValue();
        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void desiredCurrencyValueTest_IndianRupeeToCanadianDollar() {
        Double expected = 11.11;
        CurrencyConverter.cc.setAllValues("INR", "CAD", 575.00);
        Double actual = CurrencyConverter.cc.desiredCurrencyValue();
        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void desiredCurrencyValueTest_CanadianDollarToSingaporeDollar() {
        Double expected = 622.92;
        CurrencyConverter.cc.setAllValues("CAD", "SGD", 575.00);
        Double actual = CurrencyConverter.cc.desiredCurrencyValue();
        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void desiredCurrencyValueTest_SingaporeDollarToSwissFranc() {
        Double expected = 406.12;
        CurrencyConverter.cc.setAllValues("SGD", "CHF", 575.00);
        Double actual = CurrencyConverter.cc.desiredCurrencyValue();
        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void desiredCurrencyValueTest_SwissFrancToMalaysianRinggit() {
        Double expected = 2544.80;
        CurrencyConverter.cc.setAllValues("CHF", "MYR", 575.00);
        Double actual = CurrencyConverter.cc.desiredCurrencyValue();
        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void desiredCurrencyValueTest_MalaysianRinggitToJapaneseYen() {
        Double expected = 14901.12;
        CurrencyConverter.cc.setAllValues("MYR", "JPY", 575.00);
        Double actual = CurrencyConverter.cc.desiredCurrencyValue();
        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void desiredCurrencyValueTest_JapaneseYenToChineseYuanRenminbi() {
        Double expected = 34.35;
        CurrencyConverter.cc.setAllValues("JPY", "CNY", 575.00);
        Double actual = CurrencyConverter.cc.desiredCurrencyValue();
        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void currencyBaseAmountTest() {
        Double expected = 611.70;
        CurrencyConverter.cc.setAllValues("EUR", "USD", 575.00);
        Double actual = CurrencyConverter.cc.currencyBaseAmount();
        Assert.assertEquals(expected,actual,0.01);
    }

    @Test
    public void getConversionRateTest() {
        Double expected = 0.94;
        Double actual = cc.getConversionRate("EUR");
        Assert.assertEquals(expected, actual, 0.01);
    }
}
