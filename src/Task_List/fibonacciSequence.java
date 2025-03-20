package Task_List;

import java.util.Scanner;
public class fibonacciSequence {
    public static void main(String[] args) {
        Scanner fib = new Scanner(System.in);
        System.out.println("enter the value");
        int f1 = 0;
        int f2 = 1;
        int f3;
        System.out.println("fibonacci series:" +f1+" "+f2);
        var n= fib.nextInt();
        for(int i=2;i<n;i++){
            f3= f1 + f2;
            System.out.print(" "+f3);
            f1=f2;
            f2=f3;


        }
      // Scanner.close();

    }
}
