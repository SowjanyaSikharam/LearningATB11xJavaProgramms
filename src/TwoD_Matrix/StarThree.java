package TwoD_Matrix;
import java.util.Scanner;
public class StarThree {
    public static void main(String[] args) {
       Scanner matrix = new Scanner(System.in) ;
        System.out.println("enter number");
       int starMatrix = matrix.nextInt();
        for(int i = 0; i< starMatrix; i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
