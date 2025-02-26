import java.util.Scanner;

public class MenuDrivenProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) { // Loop until the user chooses to exit
            displayMenu(); // Display the menu
            int choice = scanner.nextInt();
            handleMenuChoice(choice, scanner); // Handle the choice

            if (choice == 3) { // Exit if choice is 3
                break;
            }
        }
        scanner.close();
    }

    // Method 1: displayMenu()
    public static void displayMenu() {
        System.out.println("Menu:");
        System.out.println("1. Greet User");
        System.out.println("2. Check Even/Odd");
        System.out.println("3. Exit");
        System.out.print("Enter your choice (1-3): ");
    }

    // Method 2: handleMenuChoice(choice)
    public static void handleMenuChoice(int choice, Scanner scanner) {
        if (choice == 1) {
            greetUser();
        } else if (choice == 2) {
            checkEvenOrOdd(scanner);
        } else if (choice == 3) {
            System.out.println("Exiting program. Goodbye!");
        } else {
            System.out.println("Invalid choice. Please enter a number between 1 and 3.");
        }
    }

    // Helper Method 1: greetUser()
    public static void greetUser() {
        System.out.println("Hello! Welcome!");
    }

    // Helper Method 2: checkEvenOrOdd()
    public static void checkEvenOrOdd(Scanner scanner) {
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println(number + " is an Even number.");
        } else {
            System.out.println(number + " is an Odd number.");
        }
    }
}