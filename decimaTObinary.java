import java.util.Scanner;
public class decimaTObinary {

public static void decTObin (int n){
    int myNum  = n ;
    int remainder ;
    int pow = 0 ;
    int binNum = 0 ;
    while (n > 0 ) {
        remainder = n % 2 ;
        binNum = binNum + ( remainder * (int)Math.pow(10, pow));
        pow++;
        n = n/2;
    }
    System.out.println("binary form of " + myNum + " " + " is " + binNum);
}
    public static void main (String arg[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter you number: ");
    int n = sc.nextInt();
    decTObin(n);
    sc.close();
    }
}