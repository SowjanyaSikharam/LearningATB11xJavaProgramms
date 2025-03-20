package Loops;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("enter number");
        int number = a.nextInt();
        int fact = 1;
        if(number <= 0) {
            System.out.print(fact);
        }
        else {
            for (int i = 1; i < number; i++) {
                fact = fact * i;
                System.out.println(fact);
            }
        }

    }
}
