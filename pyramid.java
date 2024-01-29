import java.util.Scanner;

public class pyramid {

    public static void lower_triangle(int n){
        // outer
        for(int i = 1 ; i <= n ; i++){
            // spacess
            for (int j = 1 ; j <= (n-i) ; j++){
            System.out.print(" ");
            }
            // stars
            for ( int j = 1 ; j <= i ; j++){
            System.out.print("*");
            }
            System.out.println();
    }
    }
        
    public static void main (String arg[]){
    Scanner sc = new Scanner(System.in);
    sc.close();
    lower_triangle(9);
    }
}
