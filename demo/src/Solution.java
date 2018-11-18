import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class Solution {

    private String displayCurrency(Locale locale, double payment){
        Currency.getInstance(locale);
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);
        return currencyFormatter.format(payment);
    }

    public static void main(String[] args) {
        double payment = 12324.134;

        System.out.println("US: " + new Solution().displayCurrency(Locale.US ,payment));
        System.out.println("India: " + new Solution().displayCurrency(new Locale("en","IN") ,payment));
        System.out.println("China: " + new Solution().displayCurrency(Locale.CHINA ,payment));
        System.out.println("France: " + new Solution().displayCurrency(Locale.FRANCE ,payment));
    }
}