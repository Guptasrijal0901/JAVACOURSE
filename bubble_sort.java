import java.util.Scanner;

public class bubble_sort {
    public static void bubbleSort(int array[]){
        int n = array.length;
        for ( int turn = 0 ; turn < n-1 ; turn++){ // n times baar chala hai 
            for ( int j = 0 ; j < n-1-turn ; j++){  // n-1-turn times baar chala hai 
            if ( array[j] > array[j+1] ){
            // swapping 
            int temp = array[j];
            array[j] = array[j+1];
            array[j+1] = temp;
            }
            }
        }
    }
    public static void printarray(int array[]){
        int m = array.length;
        for ( int i = 0 ; i < m ; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public static void main (String arg[]){
    Scanner sc = new Scanner(System.in);
    int array [] = {5, 4, 1, 3, 2};
    bubbleSort(array);
    printarray(array);
    sc.close();
    }
}
// BUBBLE SORT :
// LARGE ELEMENTS COME TO THE END OF ARRAY BY SWAPPING WITH ADJACENT ELEMENTS 
// TC is O(n2) which is not that good 