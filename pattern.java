import java.util.Scanner;

public class pattern {
    public static void main (String arg[]){
    Scanner sc = new Scanner(System.in);
    // System.out.print("Enter n : ");
    // int n = sc.nextInt() ;
    // for (int line = 1 ; line <= n ; line++){
    //     for ( int star = 1 ; star <= line ; star++){
    //         System.out.print(" * ");
    //     }
    //     System.out.println();
    // }
    // System.out.print("Enter n : ");
    // int n = sc.nextInt() ;
    // for (int line = 1 ; line <= n ; line++){
    //         for ( int star = 1 ; star <= (n-line+1) ; star++){
    //             System.out.print(" * ");
    //         }
    //         System.out.println();
    //     }
    // System.out.print("Enter n : ");
    // int n = sc.nextInt() ;
    // for ( int i = 1 ; i <= n ; i++){
    //     for ( int j = 1 ; j <= (n-i+1) ; j++){
    //         System.out.print(i);
    //     }
    //     System.out.println();
    // }
    // System.out.print("Enter n : ");
    // int n = sc.nextInt() ;
    // for ( int i = 1 ; i <= n ; i++){
    //     for ( int j = 1 ; j <= i ; j++){
    //         System.out.print(i);
    //     }
    //     System.out.println();
    // }
    System.out.print("Enter n : ");
    int n = sc.nextInt() ;
    char ch = 'A' ;
    for (int i = 1 ; i <= n ; i++){
        for (int j = 1 ; j <= i ; j++){
            System.out.print( ch + " " );
            ch++;
        }
        System.out.println();
    }
    sc.close();
    }
}
// phele code row k liye fir col k liye 