import java.util.Scanner;

public class matrix_sum {
    public static void sum(int matrix[][]){
    // int row = matrix.length;
    int col = matrix.length;
    int sumOf2 = 0;
    // for (int i = 0; i < row ; i++) {
    // row nhi chalaenge kyu ki row toh fix hai naa bas col chala k element le k sum kar denge 
        for(int j = 0 ; j < col ; j++){
            sumOf2 = sumOf2 + matrix[1][j];
        // }
    }
    System.out.println(sumOf2);
    }
    public static void main (String arg[]){
    Scanner sc = new Scanner(System.in);
    int matrix[][] = {{1, 4, 9},{11, 4, 3}, {2, 2, 3}};
    sum(matrix);
    sc.close();
    }
}
