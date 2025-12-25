package basics;
import java.util.Scanner;

// Program: Even or Odd Number
// Description: Checks whether a given number is even or odd
// Input: n = 7
// Output: Odd Number

public class EvenOdd {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }

        sc.close();
    }
}