
public class MonthlyCCBalance {
    public static void main(String[] args)
    {
        double balance = 5000;
        double interestRate = 0.17;
        double interestOneMonth = balance * interestRate;
        double interestTwoMonths = balance * Math.pow(1 + interestRate, 2) - balance;

        System.out.println("Interest after one month: $" + interestOneMonth);
        System.out.println("Interest after two months: $" + interestTwoMonths);
    }
}