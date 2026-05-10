import java.util.*;

public class electricity {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            System.out.println("Enter the units consumed: ");
            int units = sc.nextInt();

            double bill = 0; // store bill in a variable
            if (units <= 100) {
                bill = units * 10;
            } else if (units <= 200) {
                bill = 100 * 10 + (units - 100) * 20;
            } else if (units <= 300) {
                bill = 100 * 10 + 100 * 20 + (units - 200) * 30;
            } else {
                bill = 100 * 10 + 100 * 20 + 100 * 30 + (units - 300) * 40;
            }
            System.out.println("Bill is: " + bill);
            double tax = 0.18;
            double totalBill = bill + bill * tax; // FIX: was using undefined 'Bill'
            System.out.println("Total bill is: " + totalBill);
            System.out.println("Connection type: ");
            if (units <= 100) {
                System.out.println("1. Domestic");
            } else if (units <= 200) {
                System.out.println("2. Commercial");
            } else if (units <= 300) {
                System.out.println("3. Industrial");
            }
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Domestic");
                    break;
                case 2:
                    System.out.println("Commercial");
                    break;
                case 3:
                    System.out.println("Industrial");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}