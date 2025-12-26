package basics;

import java.util.Scanner;

// Program: Check Leap Year
// Description: Checks whether a given year is a leap year or not
// Input: year = 2024
// Output: Leap Year

public class LeapYear {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        // Leap year logic
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not a Leap Year");
        }

        sc.close();
    }
}
