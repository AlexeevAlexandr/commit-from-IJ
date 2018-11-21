import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class CurrentPayment {

    private String displayCurrency(Locale locale, double payment){
        Currency.getInstance(locale);
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);
        return currencyFormatter.format(payment);
    }

    public static void main(String[] args) {
        double payment = 12324.134;

        System.out.println("US: " + new CurrentPayment().displayCurrency(Locale.US ,payment));
        System.out.println("India: " + new CurrentPayment().displayCurrency(new Locale("en","IN") ,payment));
        System.out.println("China: " + new CurrentPayment().displayCurrency(Locale.CHINA ,payment));
        System.out.println("France: " + new CurrentPayment().displayCurrency(Locale.FRANCE ,payment));
    }
}