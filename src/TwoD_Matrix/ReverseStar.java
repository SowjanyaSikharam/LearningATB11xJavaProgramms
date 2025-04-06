package TwoD_Matrix;
import java.util.Scanner;
public class ReverseStar {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("enter number");
        int number = a.nextInt();
        for(int i = number ; i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
