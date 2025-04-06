package TwoD_Matrix;
import java.util.Scanner;
public class Table_Multiplication {
    public static void main(String[] args) {
        Scanner a  = new Scanner(System.in);
        System.out.println("Enter the size of matrix");
        int size_of_Table = a.nextInt();
        for(int i=0;i<size_of_Table;i++){
            for(int j=0;j<size_of_Table;j++){
                System.out.print((i*j)+"\t");
            }
            System.out.println();
        }
    }
}
