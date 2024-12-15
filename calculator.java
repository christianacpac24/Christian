import java.util.Scanner;

public class LoginSystemCalculator {

    public static void main(String[] args) {
        
        String correctUsername = "Christian";
        String correctPassword = "Acpac";

        try (
                Scanner scanner = new Scanner(System.in)) {
            boolean loggedIn = false;
            int attempts = 0;
            
            while (!loggedIn && attempts < 3) {
                
                System.out.print("Enter username: ");
                String enteredUsername = scanner.nextLine();
                
                
                System.out.print("Enter password: ");
                String enteredPassword = scanner.nextLine();
                
                
                if (enteredUsername.equals(correctUsername) && enteredPassword.equals(correctPassword)) {
                    System.out.println("Login successful!");
                    loggedIn = true;
                    displayCalculator(scanner);  
                } else {
                    System.out.println("Invalid username or password. Please try again.");
                    attempts++;
                }
            }   if (!loggedIn) {
                System.out.println("Too many failed attempts. Exiting program.");
            }
            
        }
    }

    
    public static void displayCalculator(Scanner scanner) {
        while (true) {
            System.out.println("\nSimple Calculator");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");

            
            System.out.print("Choose an option (1-5): ");

            if (scanner.hasNextInt()) {
                int choice = scanner.nextInt();

                
                if (choice == 5) {
                    System.out.println("Exiting calculator. Goodbye!");
                    break;
                }

                
                System.out.print("Enter first number: ");
                if (!scanner.hasNextDouble()) {
                    System.out.println("Invalid input. Please enter a valid number.");
                    scanner.next(); 
                    continue;
                }
                double num1 = scanner.nextDouble();

                System.out.print("Enter second number: ");
                if (!scanner.hasNextDouble()) {
                    System.out.println("Invalid input. Please enter a valid number.");
                    scanner.next(); 
                    continue;
                }
                double num2 = scanner.nextDouble();

                
                switch (choice) {
                    case 1:
                        System.out.println("Result: " + (num1 + num2));
                        break;
                    case 2:
                        System.out.println("Result: " + (num1 - num2));
                        break;
                    case 3:
                        System.out.println("Result: " + (num1 * num2));
                        break;
                    case 4:
                        
                        if (num2 != 0) {
                            System.out.println("Result: " + (num1 / num2));
                        } else {
                            System.out.println("Error: Division by zero is not allowed.");
                        }
                        break;
                    default:
                        System.out.println("Invalid option. Please try again.");
                        break;
                }
            } else {
                System.out.println("Invalid input. Please enter a number between 1 and 5.");
                scanner.next(); 
            
        }
    }
}
	
}