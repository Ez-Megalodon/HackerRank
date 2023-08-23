package Java;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyConversion {
    public static NumberFormat usa = NumberFormat.getCurrencyInstance(Locale.US);
    public static NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
    public static NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);
    public static String indiaConvert(double num) {
        DecimalFormatSymbols sep = new DecimalFormatSymbols(Locale.ENGLISH);
        sep.setGroupingSeparator(',');
        sep.setDecimalSeparator('.');

        DecimalFormat decimalFormat = new DecimalFormat("#,##0.00", sep);

        return "Rs." + decimalFormat.format(num);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();


        System.out.println("US: " + usa.format(payment));
        System.out.println("India: " + indiaConvert(payment));
        System.out.println("China: " + china.format(payment));
        System.out.println("France: " + france.format(payment));
    }
}
