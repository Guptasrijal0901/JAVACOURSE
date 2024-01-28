import java.util.Scanner;

public class binaryTOdecimal {

    public static int BtoD (int n ){
    int D = 0 ;
    int P = 0 ;
    int LD ;
    while (n > 0 ) {
        LD = n % 10  ;
        D = D + (LD * (int)Math.pow(2, P));
        n = n / 10 ;
        P++;
    }
    return D;
    }
    public static void main (String arg[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter n: ");
    int n = sc.nextInt();
    System.out.println("Decimal of binary number " + n + " is"  + " "+ BtoD(n));
    sc.close();
    }
}
// 