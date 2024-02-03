import java.util.Scanner;

public class reverse_an_array {
    public static void reverse(int n []){
        // int m = n.length;
        // for (int i = 0 ; i <= m/2 ; i++){
        //     int temp = n[i];
        //     n[i]= n[m-i-1];
        //     n[m-i-1] = temp;
        // }
        // System.out.print("Reverse of the array is : " );
        // for (int i = 0 ; i < m ; i++){
        //     System.out.print( n[i]+ " ");
        // }
        // next method 
        int first = 0 ;
        int last = n.length-1;
        while (first < last ) {
            int temp = n[last];
            n[last]= n[first];
            n[first]= temp;
            first++;
            last--;
        }
    }
 public static void main (String arg[]){
    Scanner sc = new Scanner(System.in);
    int n []= {9, 8, 7, 6, 5, 4, 3, 2, 1};
    reverse(n);
    for (int i = 0 ; i < n.length; i++ ){
        System.out.print(n[i]+ " ");
    }
    sc.close();
    } 
}