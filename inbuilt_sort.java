import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class inbuilt_sort {
    public static void printarray(Integer[] array){
        int m = array.length;
        for ( int i = 0 ; i < m ; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public static void main (String[] arg){
    Scanner sc = new Scanner(System.in);
    Integer[] array  = { 5, 2, 4, 1, 3, 0 };
    // Arrays.sort(array);
    // Arrays.sort(array, 2 , 4 );
    Arrays.sort(array, Collections.reverseOrder());
    printarray(array);
    sc.close();
    }
} 
// Arrays.sort ( ) ka TC O(nlogn) hota hai jo ki O(n2) se acha hota hai
// agar sorting hme ek partivular index tk karni hai toh 
// Arrays.sor(array, staring_index, ending_index)
// ending index non inclusive hota hai 
// yeh sab acending order mai hogi 
// yahi agar decending mai karna hai toh 
// Arrays.sort ( array,from , to ,collections.reverseOrder()) 
// also import : import java.util.collections;
// jab reverse sorting k liye lagate hai toh uske liye hme int nhi integer likhna padhta hai 
// reverse wala object pe kaam karta hai primitive pe nhi 
