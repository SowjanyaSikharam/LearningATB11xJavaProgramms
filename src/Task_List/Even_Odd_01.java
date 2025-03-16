package Task_List;
import java.util.Scanner;

public class Even_Odd_01 {
    public static void main(String[] args) {
        Scanner a = new Scanner (System.in);
        System.out.println("enter number");
        int  number = a.nextInt();
        System.out.println("enter number is"+ number);
        if(number%2==0) {
            System.out.println(number+" is even number");
        } else{
            System.out.println(number+" is odd number");
            }
        }
    }

