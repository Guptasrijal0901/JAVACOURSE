import java.util.Scanner;
public class product {

public static int multiply( int a , int b ){
    int c = a * b ;
    return c ;
}
    public static void main (String arg[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a = ");
    int a = sc.nextInt();
    System.out.print("Enter b = ");
    int b = sc.nextInt();
    int c = multiply( a , b);
    System.out.println("Product of a and b is " + c );
    sc.close();
    }
}
