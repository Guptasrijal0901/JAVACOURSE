import java.util.Scanner;

public class bit_evenodd {
    public static void oddEven(int n){
        int bitMask = 1;
        if ((n & bitMask) == 0 ) {
            // even number 
            System.out.println("EVEN");
        }else{
            // odd number
            System.out.println("ODD");
        }
    }
    public static void main (String arg[]){
    Scanner sc = new Scanner(System.in);
    int n = 98 ;
    oddEven(n);
    sc.close();
    }
    
}
// if LSB of the binary number is 1 it is odd number 
// if it is 0 it is even number 
// LSB is least significant bit 
// 1 & 1 is 1 
// 1 & 0 is 0 