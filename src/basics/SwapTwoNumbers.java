package basics;
import java.util.Scanner;

// Program: Swap Two Numbers
// Description: Swaps two numbers using a temporary variable
// Input: a = 5, b = 10
// Output: After swapping a = 10, b = 5

public class SwapTwoNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        // Swapping using temporary variable
        int temp = a;
        a = b;
        b = temp;

        // Display result
        System.out.println("After swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        sc.close();
    }
}
