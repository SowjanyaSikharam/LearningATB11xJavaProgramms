package TwoD_Matrix;

public class ThreeThreeMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        for(int i=0;i<matrix.length;i++){ //matrix.length -->r
            for(int j=0;j<matrix[i].length;j++){ //matrix[i].length -->c
                System.out.print(matrix[i][j]+"  ");
            }
            System.out.println();
        }
    }
}
