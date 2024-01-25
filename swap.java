import java.util.Scanner;

public class swap {
// swaping through function
    public static void swaping( int a , int b ){
    int temp = a ;
    a = b ;
    b = temp;
    System.err.println("a = " + a);
    System.err.println("b = " + b);
    // agar yaha pr print statemen call karte h toh toh value change hogi 
    //lekin agar main function mai print karenge toh vaha uss function wali value print hogi vaha koi change nhi hoga i.e. swap nhi hoga 
    // esse ko CALL BY VALUE bolte hai  
    }
    public static void main (String arg[]){
    Scanner sc = new Scanner(System.in);
    int a = 5 ;
    int b = 10 ;
    swaping(a, b);
    // yaha print statement likhne se jo valse yaha define hai vahi print hogi kyu ki vo  swapping dusre function mai ho raha hai 
    // //swap
    // int temp = a ;
    // a = b ;
    // b= temp;
    // System.err.println("a = " + a);
    // System.err.println("b = " + b);
    sc.close();
    }
}
// java always calls by value 
// hmesha copy value aati hai 