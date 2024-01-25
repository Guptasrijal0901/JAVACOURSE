import java.util.Scanner;

public class binomial {
    public static int facto( int p  ){
        int f = 1 ;
        for ( int i = 1 ; i <= p ; i++) {
        f = f * i;
        }
        return f ;
    }
public static int biocoeff(int n , int r){
    int facto_n = facto(n);
    int facto_r = facto(r);
    int facto_nmr = facto(n-r);

    int biocoeff = facto_n / (facto_r * facto_nmr);
    return biocoeff ;
}
   
    public static void main (String arg[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter n :");
    int n = sc.nextInt();
    System.out.print("Enter r :");
    int r = sc.nextInt();
    int nCr = biocoeff(n, r);
    System.err.println("Binomial Coefficient " + " " + nCr);
    sc.close();
    }
}
