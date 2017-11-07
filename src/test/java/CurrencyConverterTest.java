import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

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
//        CurrencyConverter.ConversionRates[] currency = CurrencyConverter.ConversionRates.values();
//        System.out.println(Arrays.toString(currency));
//
//        for(CurrencyConverter.ConversionRates aCurrency:currency) {
//            for (CurrencyConverter.ConversionRates eachCurrency:currency) {
//                System.out.println(aCurrency);
//                System.out.println(eachCurrency);
//                System.out.println(CurrencyConverter.cc.desiredCurrencyValue(amount,aCurrency.toString(),eachCurrency.toString()));
//            }
//        }
//    }

    @Test
    public void desiredCurrencyValueTest_DollarToEuro() {
        Double expected = 540.50;
        CurrencyConverter.cc.setAllValues("UsDollar", "Euro", 575.00);
        Double actual = CurrencyConverter.cc.desiredCurrencyValue();
        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void desiredCurrencyValueTest_EuroToDollar() {
        Double expected = 611.70;
        CurrencyConverter.cc.setAllValues("Euro", "UsDollar", 575.00);
        Double actual = CurrencyConverter.cc.desiredCurrencyValue();
        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void desiredCurrencyValueTest_EuroToBritishPound() {
        Double expected = 501.59;
        CurrencyConverter.cc.setAllValues("Euro", "BritishPound", 575.00);
        Double actual = CurrencyConverter.cc.desiredCurrencyValue();
        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void desiredCurrencyValueTest_BritishPoundToIndianRupee() {
        Double expected = 47907.32;
        CurrencyConverter.cc.setAllValues("BritishPound", "IndianRupee", 575.00);
        Double actual = CurrencyConverter.cc.desiredCurrencyValue();
        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void desiredCurrencyValueTest_IndianRupeeToCanadianDollar() {
        Double expected = 11.11;
        CurrencyConverter.cc.setAllValues("IndianRupee", "CanadianDollar", 575.00);
        Double actual = CurrencyConverter.cc.desiredCurrencyValue();
        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void desiredCurrencyValueTest_CanadianDollarToSingaporeDollar() {
        Double expected = 622.92;
        CurrencyConverter.cc.setAllValues("CanadianDollar", "SingaporeDollar", 575.00);
        Double actual = CurrencyConverter.cc.desiredCurrencyValue();
        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void desiredCurrencyValueTest_SingaporeDollarToSwissFranc() {
        Double expected = 406.12;
        CurrencyConverter.cc.setAllValues("SingaporeDollar", "SwissFranc", 575.00);
        Double actual = CurrencyConverter.cc.desiredCurrencyValue();
        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void desiredCurrencyValueTest_SwissFrancToMalaysianRinggit() {
        Double expected = 2544.80;
        CurrencyConverter.cc.setAllValues("SwissFranc", "MalaysianRinggit", 575.00);
        Double actual = CurrencyConverter.cc.desiredCurrencyValue();
        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void desiredCurrencyValueTest_MalaysianRinggitToJapaneseYen() {
        Double expected = 14901.12;
        CurrencyConverter.cc.setAllValues("MalaysianRinggit", "JapaneseYen", 575.00);
        Double actual = CurrencyConverter.cc.desiredCurrencyValue();
        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void desiredCurrencyValueTest_JapaneseYenToChineseYuanRenminbi() {
        Double expected = 34.35;
        CurrencyConverter.cc.setAllValues("JapaneseYen", "ChineseYuanRenminbi", 575.00);
        Double actual = CurrencyConverter.cc.desiredCurrencyValue();
        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void currencyAmountInDollarsTest() {
        Double expected = 611.70;
        CurrencyConverter.cc.setAllValues("Euro", "UsDollar", 575.00);
        Double actual = CurrencyConverter.cc.currencyAmountInDollars();
        Assert.assertEquals(expected,actual,0.01);
    }

    @Test
    public void getConversionRateTest() {
        Double expected = 0.94;
        Double actual = cc.getConversionRate("Euro");
        Assert.assertEquals(expected, actual, 0.01);
    }
}
