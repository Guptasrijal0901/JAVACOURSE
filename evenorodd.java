import java.util.Scanner;

public class evenorodd {
    public static void main (String arg[]){
    Scanner sc = new Scanner(System.in);

int A = sc.nextInt();
if ( A % 2 == 0){
    System.out.println( "A is even number");
}else {
    System.err.println("A is odd number");
}
    }
}

// if , if baar baar likhne se sab check hoga or if fir else if se agar if sahi hai toh vo sidhe terminate kar jayega 
