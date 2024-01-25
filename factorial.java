import java.util.Scanner;

public class factorial {
    
public static int facto( int n  ){
   int f = 1 ;
   for ( int i = 1 ; i <= n ; i++) {
   f = f * i;
}
   return f;
}
    public static void main (String arg[]){
    Scanner sc = new Scanner(System.in);
    System.out.print( "Enter n = ");
    int n = sc.nextInt();
    int f = facto(n);
    System.out.println(n+"!" + " " +  "=" + " " + f );
    sc.close();
    }
}
