import java.util.Scanner; // Import the Scanner class
public class ShipCostCalculatorjava {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Create a Scanner object

        System.out.print("Enter the price of the item: ");
        double itemPrice = 0;

        if (in.hasNextDouble()) { // Check if the input is a double
            itemPrice = in.nextDouble(); // Read the double value
            in.nextLine(); // Clear the buffer

            double shippingCost;
            if (itemPrice >= 100) {
                shippingCost = 0; // Free shipping for items $100 or more
            } else {
                shippingCost = itemPrice * 0.02; // 2% shipping for items less than $100
            }
            double totalCost = itemPrice + shippingCost;
            System.out.printf("Shipping Cost: $%.2f%n", shippingCost);
            System.out.printf("Total Cost: $%.2f%n", totalCost);
        } else {
            System.out.println("Invalid input. Please enter a numeric value.");
        }

        in.close(); // Close the scanner
    }
}