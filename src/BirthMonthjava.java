import java.util.Scanner; // Import the Scanner class

public class BirthMonthjava {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Create a Scanner object

        System.out.print("Enter your birth month (1-12): ");
        int month = 0;

        if (in.hasNextInt()) { // Check if the input is an integer
            month = in.nextInt(); // Read the integer value
            in.nextLine(); // Clear the buffer

            if (month >= 1 && month <= 12) {
                System.out.println("Your birth month is: " + month);
            } else {
                System.out.println("You entered an incorrect month value: " + month);
            }
        } else {
            System.out.println("Invalid input. Please enter an integer.");
        }

        in.close(); // Close the scanner
    }
}