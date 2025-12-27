package basics;

import java.util.Scanner;

// Program: Vowel or Consonant
// Description: Checks whether a given character is a vowel or a consonant
// Input: ch = a
// Output: Vowel

public class VowelOrConsonant {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking character input
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        // Convert character to lowercase
        ch = Character.toLowerCase(ch);

        // Check vowel or consonant
        if (ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u') {
            System.out.println("Vowel");
        } else {
            System.out.println("Consonant");
        }

        sc.close();
    }
}
