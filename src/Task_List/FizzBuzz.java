package Task_List;
import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter number");
        if (!a.hasNextInt()) {
            System.out.println("Invalid input. Only integers are allowed.");
            return;
        }
        int num = a.nextInt();
        if (num > 100) {
            System.out.println("Max limit is 100");
            return;
        }
        for (int i = 1; i <= num; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz " + i);
            } else if (i % 3 == 0) {
                System.out.println("Fizz " + i);
            } else if (i % 5 == 0) {
                System.out.println("Buzz " + i);
            } else {
                System.out.println(i);
            }
        }
    }
}
