import java.util.Scanner;

public class printprime {

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

    public static void primerange(int n){
        for ( int i =2 ; i <= n ; i++ ){
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    public static void main (String arg[]){
    Scanner sc = new Scanner(System.in);
    primerange(20);
    sc.close();
    }
}
