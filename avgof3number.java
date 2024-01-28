import java.util.Scanner;

public class avgof3number {

    public static int avgof3( int a , int b , int c){
        int avg3 = (a + b + c)/3; 
        return avg3;
    }
    public static void main (String arg[]){
    Scanner sc = new Scanner(System.in);
    System.out.print( "Enter a : ");
    int a = sc.nextInt();
    System.out.print( "Enter b : ");
    int b = sc.nextInt();
    System.out.print( "Enter c : ");
    int c = sc.nextInt();
    System.err.println( "Average of" + " " + a + ", " + b + " " + "and " + c + " " + "is : "  +avgof3(a, b, c));
    sc.close();
    }
    
}
