package basics;

import java.util.Scanner;

// Program: Positive or Negative Number
// Description: Checks whether a given number is positive, negative, or zero
// Input: n = -5
// Output: Negative Number

public class PositiveNegative {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Checking the number
        if (n > 0) {
            System.out.println("Positive Number");
        } else if (n < 0) {
            System.out.println("Negative Number");
        } else {
            System.out.println("Zero");
        }

        sc.close();
    }
}

