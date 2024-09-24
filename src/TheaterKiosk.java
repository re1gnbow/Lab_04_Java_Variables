import java.util.Scanner; // Import the Scanner class

public class TheaterKiosk {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Create a Scanner object

        System.out.print("Enter your age: ");
        int age = 0;

        if (in.hasNextInt()) { // Check if the input is an integer
            age = in.nextInt(); // Read the integer value
            in.nextLine(); // Clear the buffer

            if (age >= 21) {
                System.out.println("You get a wrist band.");
            }
        } else {
            System.out.println("Invalid input. Please enter an integer.");
        }

        in.close(); // Close the scanner
    }
}
