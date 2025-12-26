package basics;

import java.util.Scanner;

// Program: Largest of Three Numbers
// Description: Finds the largest among three given numbers
// Input: a = 10, b = 25, c = 15
// Output: Largest number is 25

public class LargestOfThree {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        // Checking largest number
        if (a >= b && a >= c) {
            System.out.println("Largest number is " + a);
        } else if (b >= a && b >= c) {
            System.out.println("Largest number is " + b);
        } else {
            System.out.println("Largest number is " + c);
        }

        sc.close();
    }
}
