import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        // FIX 1: Use Scanner to actually read the PIN from user input
        // (previously PIN was hardcoded to 1234 — user input was never used)
        try (Scanner sc = new Scanner(System.in)) {
            int PIN = 1234;

            System.out.print("Enter your PIN: ");
            int enteredPIN = sc.nextInt();

            if (enteredPIN == PIN) {
                System.out.println("Correct PIN!");
            } else {
                System.out.println("Incorrect PIN. Exiting.");
                return; // stop here if PIN is wrong
            }

            System.out.println("\n1. CHECK BALANCE");
            System.out.println("2. WITHDRAW");
            System.out.println("3. DEPOSIT");
            System.out.println("4. EXIT");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            double amount = 10000;

            switch (choice) {
                case 1:
                    // FIX 2: Show actual 'amount' variable, not hardcoded "10000"
                    System.out.println("Balance is: " + amount);
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdraw = sc.nextDouble();
                    // FIX 3: Check withdraw against 'amount', not hardcoded 10000
                    if (withdraw > amount) {
                        System.out.println("Insufficient balance.");
                    } else {
                        amount = amount - withdraw;
                        System.out.println("Amount withdrawn successfully.");
                        System.out.println("Remaining balance: " + amount);
                    }
                    break;

                case 3:
                    System.out.print("Enter amount to deposit: ");
                    double deposit = sc.nextDouble();
                    amount = amount + deposit;
                    // FIX 4: Show updated balance after deposit
                    System.out.println("Amount deposited successfully.");
                    System.out.println("New balance: " + amount);
                    break;

                case 4:
                    System.out.println("Thank you. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }
        // FIX 5: Removed stray 's' after the closing brace (line 48)
    }
}