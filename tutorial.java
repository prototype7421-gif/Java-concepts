import java.util.Scanner;

 public class tutorial {

    public static void main(String[] args ) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Select operation.");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            
            System.out.print("Enter choice (1/2/3/4): ");
            String choice = sc.nextLine();
            
            System.out.print("Enter first number: ");
            double num1 = sc.nextDouble();
            
            System.out.print("Enter second number: ");
            double num2 = sc.nextDouble();
            double result;
            switch (choice) {
                case "1" :
                    result = num1 + num2;
                    break;
                
                case "2" :
                    result = num1 - num2;
                    break;
                case "3" :
                    result = num1 * num2;
                    break;
                case "4" :
                    result = num1 / num2;
                    break;
                default :
                    System.out.println("Invalid input");
                    return;
            }
            
            System.out.println("Result: " + result);
        }
    }
}
