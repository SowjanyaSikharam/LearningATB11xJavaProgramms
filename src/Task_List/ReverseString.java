package Task_List;
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String:");
        String input = scanner.nextLine();
        scanner.close();

        StringBuilder result = new StringBuilder();
        for (String word : input.split(" ")) {
            String letters = word.replaceAll("[^a-zA-Z]", "");
            String reversed = new StringBuilder(letters).reverse().toString();
            int index = 0;
            for (char c : word.toCharArray()) {
                result.append(Character.isLetter(c) ? reversed.charAt(index++) : c);
            }
            result.append(" ");
        }
        System.out.println(result.toString().trim());
    }
}
