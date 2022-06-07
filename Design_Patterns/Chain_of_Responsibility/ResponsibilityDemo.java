import java.util.Scanner;

public class ResponsibilityDemo {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            do {
                System.out.println(
                        "Please enter amount to withdraw " +
                                "(500,1000,2000,5000, max 100,000/=, Press Ctrl + C to end): ");
                int amount = scanner.nextInt();
                if (isValid(amount)) {
                    ATMWithdrawal.withdraw(new PaperCurrency(amount));
                }
            } while (true);
        }
    }
    private static boolean isValid(int amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount. Try again!");
            return false;
        } else if (amount > 100000) {
            System.out.println("Daily withdrawal limit is 100,000/=. Try again!");
            return false;
        } else if (amount % 500 != 0) {
            System.out.println("Amount must be multiple of 500s, Try again!");
            return false;
        }
        return true;
    }

}