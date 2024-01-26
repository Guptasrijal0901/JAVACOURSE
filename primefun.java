import java.util.Scanner;

public class primefun {

    public static boolean isPrime(int n ){
        // for 2 
        if ( n == 2){
            return true;
        }
        boolean isPrime = true;
        for( int i = 2 ; i <= (n-1) ; i++){
        if (n % i == 0) {
            isPrime = (false);
            break;
        }
        }
        return isPrime;
    }
    public static void main (String arg[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number n : ");
    int n = sc.nextInt();
    System.out.println("Is " + n + " prime" + " : " + " "+ isPrime(n));
    sc.close();
    }
}
