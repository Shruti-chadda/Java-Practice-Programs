package basics;

import java.util.Scanner;

// Program: Simple Calculator
// Description: Performs basic arithmetic operations using switch case
// Input: a = 10, b = 5, operator = +
// Output: Result = 15

public class SimpleCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);

        // Switch case for calculation
        switch (operator) {
            case '+':
                System.out.println("Result = " + (a + b));
                break;

            case '-':
                System.out.println("Result = " + (a - b));
                break;

            case '*':
                System.out.println("Result = " + (a * b));
                break;

            case '/':
                if (b != 0) {
                    System.out.println("Result = " + (a / b));
                } else {
                    System.out.println("Division by zero is not allowed");
                }
                break;

            default:
                System.out.println("Invalid operator");
        }

        sc.close();
    }
}
