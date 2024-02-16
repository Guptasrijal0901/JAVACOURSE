import java.util.Scanner;

public class matrix_transpose {
    public static int[][] transpose(int matrix[][]){
    int row = matrix.length;
    int col = matrix[0].length;
    int[][] transposeMatrix = new int[col][row];
    for(int i = 0 ; i < row ; i++ ){
        for (int j = 0 ; j < col ; j++){
            // swapping code
            // int temp = row ;
            // row = col ;
            // col = temp ;
            transposeMatrix[j][i] = matrix[i][j];
        }
    }
    return transposeMatrix;
    }
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); 
            // Move to the next line after printing each row
        }
    }
    public static void main (String arg[]){
    Scanner sc = new Scanner(System.in);
    int matrix[][] = {{11, 12, 13, 14},{21, 22, 23, 24}};
    System.out.println("\nOriginal Matrix:");
    printMatrix(matrix);
    int[][] transposedMatrix = transpose(matrix);
    System.out.println("\nTransposed Matrix:");
    printMatrix(transposedMatrix);
    sc.close();
    }
}
