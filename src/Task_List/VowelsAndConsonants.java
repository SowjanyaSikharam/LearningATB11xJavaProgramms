package Task_List;

import java.util.Scanner;

public class VowelsAndConsonants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine().toLowerCase(); // Convert input to lowercase
        scanner.close();  // Close the scanner to prevent resource leaks
        int vowels = 0, consonants = 0;
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {  // Check if character is a letter
                if ("aeiou".contains(String.valueOf(c))) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        System.out.println("Vowels count: " + vowels);
        System.out.println("Consonants count: " + consonants);
    }
}

