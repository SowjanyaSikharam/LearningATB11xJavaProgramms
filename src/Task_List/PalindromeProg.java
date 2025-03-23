package Task_List;

import java.util.Scanner;

public class PalindromeProg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String original = scanner.nextLine();
        scanner.close(); // Close scanner to prevent resource leak

        // Reverse the string
        String reversed = new StringBuilder(original).reverse().toString();

        // Check if the original and reversed strings are the same
        if (original.equalsIgnoreCase(reversed)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is NOT a palindrome.");
        }
    }
}
