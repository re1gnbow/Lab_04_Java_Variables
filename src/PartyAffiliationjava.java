import java.util.Scanner; // Import the Scanner class

public class PartyAffiliationjava {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Create a Scanner object

        System.out.print("Enter your party affiliation (D/R/I): ");
        String affiliation = in.nextLine(); // Read the entire line as a String

        if (affiliation.equalsIgnoreCase("D")) {
            System.out.println("You get a Democratic Donkey.");
        } else if (affiliation.equalsIgnoreCase("R")) {
            System.out.println("You get a Republican Elephant.");
        } else if (affiliation.equalsIgnoreCase("I")) {
            System.out.println("You get an Independent Person.");
        } else {
            System.out.println("You get an Other.");
        }

        in.close(); // Close the scanner
    }
}
