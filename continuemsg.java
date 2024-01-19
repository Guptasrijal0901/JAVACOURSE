import java.util.Scanner;

public class continuemsg {
    public static void main (String arg[]){
    Scanner sc = new Scanner(System.in);
    // for ( int i = 1 ; i <= 9 ; i++){
    //     if (i == 6){
    //     continue;
    //     }
    //     System.out.println(i);
    // }
    // check if a number is prime or not 
    System.out.print("Enter a number : ");
    int n = sc.nextInt();
    boolean isPrime = true ;
    for ( int i = 2 ; i <= n-1 ; i++){
        if (n % i == 0) {
            isPrime = false;
            break;
        }
    }
    if (isPrime){
        System.out.println(n + " " + " is PRIME number.");
    }else{
        System.out.println(n + " " + "is NOT a PRIME number.");
    }
    sc.close();
    } 
}
// IT IS USE TO SKIP AN ITERATION