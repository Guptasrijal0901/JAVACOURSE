import java.util.Scanner;

public class diagonal_sum {
    public static int primarySum(int matrix[][]){
        int sum1 = 0 ;
        int n = matrix.length;
        for (int i = 0 ; i < n ; i++ ){
            for (int j = 0 ; j < n ; j++){
                if (i == j ) {
                    sum1 = sum1 + matrix[i][j];  
                }
            }
        }
        // System.out.println(sum1);
        return sum1;
    }
    public static int secondarySum(int matrix[][]){
        int sum2 = 0 ;
        int n = matrix.length;
        for (int i = 0 ; i < n ; i++ ){
            for (int j = (n-1-i) ; j < n ; j++){
                if ( i + j == (n-1) ) {
                    sum2 = sum2 + matrix[i][j];  
                    // System.out.println(sum2);
                }
            }
        }
        // System.out.println(sum2);
        return sum2;
    }
    public static void main (String arg[]){
    Scanner sc = new Scanner(System.in);
    int matrix[][]= {{1, 2, 3, 4,},
                    {5, 6, 7, 8},
                    {9, 10, 11, 12},
                    {13, 14, 15, 16}};
    // primarySum(matrix);
    // secondarySum(matrix);
    int sum1 = primarySum(matrix);
    int sum2 = secondarySum(matrix);
    int totalSum = sum1 + sum2;
    System.out.println("Sum of primary diagonal: " + sum1);
    System.out.println("Sum of secondary diagonal: " + sum2);
    System.out.println("Total sum of both diagonals: " + totalSum);
    sc.close();
    }
}
// this problem is for only square matrix 