public class TipCalculator {
    public static void main(String[] args) {
        // Hardcoded values for subtotal and gratuity rate
        double subtotal = 45.0;    // Example subtotal
        double gratuityRate = 20.0; // Example gratuity rate (percentage)

        // Calculate the gratuity
        double gratuity = (gratuityRate / 100) * subtotal;

        // Calculate the total
        double total = subtotal + gratuity;

        // Display the results
        System.out.printf("Gratuity: $%.2f\n", gratuity);
        System.out.printf("Total: $%.2f\n", total);
    }
}

