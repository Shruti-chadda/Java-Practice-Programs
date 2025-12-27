package basics;

import java.util.Scanner;

// Program: ASCII Value of a Character
// Description: Finds the ASCII value of a given character
// Input: ch = A
// Output: ASCII value is 65

public class AsciiValue {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking character input
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        // Typecasting char to int
        int ascii = ch;

        System.out.println("ASCII value of " + ch + " is " + ascii);

        sc.close();
    }
}
