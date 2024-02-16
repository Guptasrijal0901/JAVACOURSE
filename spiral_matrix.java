import java.util.Scanner;

public class spiral_matrix {
    public static void printSpiral(int matrix[][]){
        int n = matrix.length;
        int startRow = 0 ;
        int startCol = 0 ;
        int endRow = n-1;
        int endcol = n-1; 
        while (startRow <= endRow && startCol <= endcol) {
        // print top part 
            for( int j = startCol; j <= endcol ; j++){
                System.out.print(matrix[startRow][j] + " ");
            }
        // print right part 
        for(int i = startRow + 1 ; i <= endRow ; i++ ){
                System.out.print(matrix[i][endcol] + " ");
        }
        // print bottom part 
        for(int j = endcol - 1 ; j >= startCol; j-- ){
            System.out.print(matrix[endRow][j]+" ");
        }
        // print left part 
        for (int i = endRow-1 ; i >= startRow+1 ; i-- ){
            System.out.print(matrix[i][startCol] + " ");
        }
        startCol++;
        startRow++;
        endRow--;
        endcol--;
        }
        System.out.println();
    }
    public static void main (String arg[]){
    Scanner sc = new Scanner(System.in);
    int matrix[][]= {{1, 2, 3, 4,},
                    {5, 6, 7, 8},
                    {9, 10, 11, 12},
                    {13, 14, 15, 16}};
    printSpiral(matrix);
    sc.close();
    }   
}
