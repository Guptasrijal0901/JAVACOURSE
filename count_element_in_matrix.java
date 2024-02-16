import java.util.Scanner;

public class count_element_in_matrix {
    public static void countElement(int matrix [][]){
        int count = 0 ;
        int row = matrix.length;
        int col = matrix[0].length;
        // matrix[0].length returns the length (no. of col) of the first row of matrix
        // Since all rows in a matrix must have the same number of columns (in a properly formed matrix), 
        // matrix[0].length effectively gives you the number of columns in the matrix.
        // matrix is the two-dimensional array.
        // matrix[0] is the first row of the matrix.
        // matrix[0].length is the number of columns in the first row of the matrix, which is also the number of columns in the entire matrix.
        for (int i = 0; i < row ; i++){
        for (int j = 0 ; j < col ; j++){
        if (matrix[i][j] == 7) {
            count++;
        }
        }
        }
        System.out.println(count);
    }
    //  if the number of rows is not equal to the number of col then
    // for (int i = 0; i < rows; i++) {
    //   int cols = matrix[i].length; // Length of each row (number of columns)
    //   for (int j = 0; j < cols; j++) {
    //       if (matrix[i][j] == 7) {
    //           count++;
    //      }
    // }
    // }
    public static void main (String arg[]){
    Scanner sc = new Scanner(System.in);
    int matrix [][] = {{1, 2, 3, 7},
                       {7, 6, 7, 9}};
    countElement(matrix);
    sc.close();
    }
}
