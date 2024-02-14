import java.util.Scanner;

public class matrix_array {

    public static boolean search(int matrix[][] , int key){
    for (int i = 0 ; i < matrix.length; i++){
        for (int j = 0 ; j < matrix.length ; j++){
            if (matrix[i][j] == key ) {
                System.out.println("key at: "+ i + " , " + j);
                return true;
            }
        }
    }
    System.out.println("key not found");
    return false;
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
    for (int i = 0 ; i < n; i ++){
        for (int j = 0 ; j < m ; j++){
          System.out.print(matrix[i][j]+ " ");
           
        }
        System.out.println();
     }
    System.out.print("key: ");
    int key = sc.nextInt();
     search(matrix, key);
    sc.close();
    }
}
// 2D arrays is like matrix which has rows and columns 
// 1D linear 
// 2D rows and column 
// 3D length breath height 
// pictures k liye 2D form hi hota hai images mai pixels k form mai jitna zayda patterns utna zayda acha quality 
