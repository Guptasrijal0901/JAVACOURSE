import java.util.Scanner;

public class numhalfpyramid {

    public static void inv_half_pyra( int n){
    // outer loop 
    for( int i = 1 ; i <= n ; i++){
    // number 
    for( int j = 1 ; j <= (n-i+1) ; j++){
        System.out.print(j);
    }
    // space 
    for ( int j = 1 ; j <= (n) ; j++){
        System.out.print(" ");
    }
    System.out.println();
    }
    }
     public static void main (String arg[]){
    Scanner sc = new Scanner(System.in);
    sc.close();
    inv_half_pyra(5);
    }
}