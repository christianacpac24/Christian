import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Currency Converter!");
        System.out.println("Available currencies:");
        System.out.println("1. USD (US Dollar)");
        System.out.println("2. EUR (Euro)");
        System.out.println("3. GBP (British Pound)");
        System.out.println("4. INR (Indian Rupee)");
        System.out.println("5. JPY (Japanese Yen)");
        System.out.println("6. AUD (Australian Dollar)");
        System.out.println("7. CAD (Canadian Dollar)");
        System.out.println("8. CNY (Chinese Yuan)");
        System.out.println("9. CHF (Swiss Franc)");
        System.out.println("10. PHP (Philippine Peso)");
        System.out.print("Enter the number corresponding to the currency you want to convert from: ");
        int fromCurrency = scanner.nextInt();
        System.out.print("Enter the number corresponding to the currency you want to convert to: ");
        int toCurrency = scanner.nextInt();
        System.out.print("Enter the amount you want to convert: ");
        double amount = scanner.nextDouble();
        double conversionRate = getConversionRate(fromCurrency, toCurrency);

        if (conversionRate != -1) {
            // Perform the conversion
            double convertedAmount = amount * conversionRate;
            System.out.printf("\n%.2f ", amount);
            System.out.print(getCurrencyName(fromCurrency));
            System.out.printf(" is equal to %.2f ", convertedAmount);
            System.out.println(getCurrencyName(toCurrency));
        } else {
            System.out.println("Invalid currency selection. Please try again.");
        }

        scanner.close();
    }

    // Method to get the conversion rate between two currencies
    public static double getConversionRate(int fromCurrency, int toCurrency) {
        // Conversion rates between different currencies
        // These are sample exchange rates, you can update them with real rates

        if (fromCurrency == 1 && toCurrency == 2) return 0.92;  // USD to EUR
        if (fromCurrency == 1 && toCurrency == 3) return 0.77;  // USD to GBP
        if (fromCurrency == 1 && toCurrency == 4) return 83.25; // USD to INR
        if (fromCurrency == 1 && toCurrency == 5) return 145.12; // USD to JPY
        if (fromCurrency == 1 && toCurrency == 6) return 1.49;  // USD to AUD
        if (fromCurrency == 1 && toCurrency == 7) return 1.36;  // USD to CAD
        if (fromCurrency == 1 && toCurrency == 8) return 7.14;  // USD to CNY
        if (fromCurrency == 1 && toCurrency == 9) return 0.91;  // USD to CHF
        if (fromCurrency == 1 && toCurrency == 10) return 56.12; // USD to PHP
        
        if (fromCurrency == 2 && toCurrency == 1) return 1.09;  // EUR to USD
        if (fromCurrency == 2 && toCurrency == 3) return 0.84;  // EUR to GBP
        if (fromCurrency == 2 && toCurrency == 4) return 90.55; // EUR to INR
        if (fromCurrency == 2 && toCurrency == 5) return 157.68; // EUR to JPY
        if (fromCurrency == 2 && toCurrency == 6) return 1.62;  // EUR to AUD
        if (fromCurrency == 2 && toCurrency == 7) return 1.49;  // EUR to CAD
        if (fromCurrency == 2 && toCurrency == 8) return 7.75;  // EUR to CNY
        if (fromCurrency == 2 && toCurrency == 9) return 0.99;  // EUR to CHF
        if (fromCurrency == 2 && toCurrency == 10) return 61.11; // EUR to PHP
        
        if (fromCurrency == 10 && toCurrency == 1) return 0.018; // PHP to USD
        if (fromCurrency == 10 && toCurrency == 2) return 0.016; // PHP to EUR
        if (fromCurrency == 10 && toCurrency == 3) return 0.014; // PHP to GBP
        if (fromCurrency == 10 && toCurrency == 4) return 1.48;  // PHP to INR
        if (fromCurrency == 10 && toCurrency == 5) return 2.59;  // PHP to JPY
        if (fromCurrency == 10 && toCurrency == 6) return 0.027; // PHP to AUD
        if (fromCurrency == 10 && toCurrency == 7) return 0.025; // PHP to CAD
        if (fromCurrency == 10 && toCurrency == 8) return 0.13;  // PHP to CNY
        if (fromCurrency == 10 && toCurrency == 9) return 0.015; // PHP to CHF

        // If no valid conversion is found
        return -1;
    }

    // Method to get the currency name by its number
    public static String getCurrencyName(int currencyNumber) {
        switch (currencyNumber) {
            case 1: return "USD (US Dollar)";
            case 2: return "EUR (Euro)";
            case 3: return "GBP (British Pound)";
            case 4: return "INR (Indian Rupee)";
            case 5: return "JPY (Japanese Yen)";
            case 6: return "AUD (Australian Dollar)";
            case 7: return "CAD (Canadian Dollar)";
            case 8: return "CNY (Chinese Yuan)";
            case 9: return "CHF (Swiss Franc)";
            case 10: return "PHP (Philippine Peso)";
            default: return "Unknown Currency";
        }
    }
}