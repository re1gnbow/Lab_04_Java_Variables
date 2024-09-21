//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static double doubleOperandB;

    public static void main(String[] args) {

        {
            // Integer Variables
            int intOperandA = 5;
            int intOperandB = 10;
            int intSum, intProduct;
            int intDifference, intQuotient, intModulo;

            // Integer arithmetic operations
            intSum = intOperandA + intOperandB;
            intProduct = intOperandA * intOperandB;
            intDifference = intOperandA - intOperandB;
            intQuotient = intOperandA / intOperandB;
            intModulo = intOperandA % intOperandB;

            // Output integer results
            System.out.println("The sum using ints: " + intOperandA + "+" + intOperandB + "=" + intSum);
            System.out.println("The product using ints:" + intOperandA + "*" + intOperandB + "=" + intProduct);
            System.out.println("The difference using ints:" + intOperandA + "-" + intOperandB + "=" + intDifference);
            System.out.println("The quotient using ints:" + intOperandA + "/" + intOperandB + "=" + intQuotient);
            System.out.println("The modulo using ints:" + intOperandA + "%" + intOperandB + "=" + intModulo);

            // Double variables
            double doubleOperandA = 5.5;
            double doubleOperandB = 2.2;
            double doubleSum, doubleProduct, doubleDifference, doubleQuotient;

            // Double arithmetic operations
            doubleSum = doubleOperandA + doubleOperandB;
            doubleProduct = doubleOperandA * doubleOperandB;
            doubleDifference = doubleOperandA - doubleOperandB;
            doubleQuotient = doubleOperandA / doubleOperandB;

            //Output double results
            System.out.println("The sum using doubles: " + doubleOperandA + "+" + doubleOperandB + "=" + doubleSum);
            System.out.println("The product using doubles:" + doubleOperandA + "*" + doubleOperandB + "=" + doubleProduct);
            System.out.println("The difference using doubles:" + doubleOperandA + "-" + doubleOperandB + "=" + doubleDifference);
            System.out.println("The quotient using doubles:" + doubleOperandA + "/" + doubleOperandB + "=" + doubleQuotient);
        }
    }
}
