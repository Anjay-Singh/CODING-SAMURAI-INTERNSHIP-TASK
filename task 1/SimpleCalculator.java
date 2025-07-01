import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double num1, num2, result;
        int choice;

        System.out.println("Simple Calculator in Java");
        System.out.print("Enter first number: ");
        num1 = input.nextDouble();

        System.out.print("Enter second number: ");
        num2 = input.nextDouble();

        System.out.println("\nChoose an operation:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");

        System.out.print("Enter your choice (1-4): ");
        choice = input.nextInt();

        switch (choice) {
            case 1:
                result = num1 + num2;
                System.out.println("Result = " + result);
                break;
            case 2:
                result = num1 - num2;
                System.out.println("Result = " + result);
                break;
            case 3:
                result = num1 * num2;
                System.out.println("Result = " + result);
                break;
            case 4:
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result = " + result);
                } else {
                    System.out.println("Error: Cannot divide by zero!");
                }
                break;
            default:
                System.out.println("Invalid choice!");
        }

        input.close();
    }
}
