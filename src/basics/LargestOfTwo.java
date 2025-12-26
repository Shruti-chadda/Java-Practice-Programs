package basics;

import java.util.Scanner;

// Program: Largest of Two Numbers
// Description: Finds the largest among two given numbers
// Input: a = 10, b = 20
// Output: Largest number is 20

public class LargestOfTwo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        // Comparing two numbers
        if (a > b) {
            System.out.println("Largest number is " + a);
        } else if (b > a) {
            System.out.println("Largest number is " + b);
        } else {
            System.out.println("Both numbers are equal");
        }

        sc.close();
    }
}
