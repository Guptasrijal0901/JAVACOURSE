import java.util.Scanner;

public class largest_in_matrix {
    public static void bigSmall(int matrix [][]){
        int big = Integer.MIN_VALUE;
        int small = Integer.MAX_VALUE;
        for (int i = 0 ; i < matrix.length ; i++){
            for (int j = 0 ; j < matrix[i].length ; j++){
            big = Math.max(matrix[i][j], big);
            small = Math.min(matrix[i][j], small);
            
            }
        }
        System.out.println("LARGEST: " + big + "at index");
        System.out.println("SMALLEST: " + small);

    }
    public static void main (String arg[]){
    Scanner sc = new Scanner(System.in);
    int matrix [][] = new int [3][3];
    int n = 3 ;
    int m = 3 ;
    for (int i = 0 ; i < n; i ++){
        for (int j = 0 ; j < m ; j++){
        System.out.print("Enter the value for index "+ i +" and " + j + ": ");
        matrix[i][j]= sc.nextInt();
        }
    } 
    bigSmall(matrix);
    sc.close();
    }
    
}
