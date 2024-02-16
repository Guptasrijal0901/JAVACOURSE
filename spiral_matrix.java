import java.util.Scanner;

public class spiral_matrix {
    public static void printSpiral(int matrix[][]){
        int n = matrix.length;
        int startRow = 0 ;
        int startCol = 0 ;
        int endRow = n-1;
        int endCol = n-1; 
        while (startRow <= endRow && startCol <= endCol) {
        // print top part 
            for( int j = startCol; j <= endCol ; j++){
                System.out.print(matrix[startRow][j] + " ");
            }
        // print right part 
        for(int i = startRow + 1 ; i <= endRow ; i++ ){
                System.out.print(matrix[i][endCol] + " ");
        }
        // print bottom part 
        for(int j = endCol - 1 ; j >= startCol; j-- ){
            // agar hmhara row zayda hai toh jitna loop jitna col hia utne baar hi chalega 
            if (startRow == endRow) {
                // jab hmhara single element bach raha hai 
                // jo ki odd matrix mai hoga 
                // Only one element left in the center
                break; 
            }
            System.out.print(matrix[endRow][j]+" ");
        }
        // print left part 
        for (int i = endRow-1 ; i >= startRow+1 ; i-- ){
            if (startCol == endCol) {
                // Only one element left in the center
                break;
            }
            System.out.print(matrix[i][startCol] + " ");
        }
        startCol++;
        startRow++;
        endRow--;
        endCol--;
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
// startRow <= endRow && startCol <= endCol 
// esko esliye rakhte hai kyu ki jab odd nxn matrix hoga toh 
// boundary condition toh cover ho jayega but 
// beech wale elements mai dikkat aayegi vo print nhi hoga 
// agar = nhi lagate hai toh 
// && esliye kyu ki sirf nxn nhi nxm k liye use karna hai 
// row or col mai se jo minimum hota hai vo decide karega ki hmhara loop kitni baar chalega 

