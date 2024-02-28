import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Currency Converter");
        System.out.println("1. USD to EUR");
        System.out.println("2. USD to GBP");
        System.out.println("3. EUR to USD");
        System.out.println("4. GBP to USD");

        System.out.print("Enter the option (1-4): ");
        int option = scanner.nextInt();

        System.out.print("Enter the amount: ");
        double amount = scanner.nextDouble();

        double result = convertCurrency(option, amount);
        System.out.println("Result: " + result);
    }

    public static double convertCurrency(int option, double amount) {
        double conversionRate = 0;

        switch (option) {
            case 1:
                conversionRate = 0.85; // USD to EUR
                break;
            case 2:
                conversionRate = 0.73; // USD to GBP
                break;
            case 3:
                conversionRate = 1.18; // EUR to USD
                break;
            case 4:
                conversionRate = 1.37; // GBP to USD
                break;
            default:
                System.out.println("Invalid option");
                System.exit(0);
        }

        return amount * conversionRate;
    }
}