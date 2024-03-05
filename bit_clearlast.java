import java.util.Scanner;

public class bit_clearlast {
    public static int clearIthBits(int num, int i ){
        int bitMask = (-1)<<i;
        return num & bitMask;
    }
    public static void main (String arg[]){
    Scanner sc = new Scanner(System.in);
    System.out.println(clearIthBits(15, 2));
    sc.close();
    }
}
// In Java, "clearing the last ith bits" means setting the last i bits of a binary number to 0. 
// Let me break it down:

//- "Bits" refer to the individual binary digits (0 or 1) that make up a number.
//- "Last ith bits" means the i rightmost bits in the binary representation of the number.
//- "Clearing" means setting those i bits to 0.

//For example, let's say we have the binary number 11010110 and we want to clear the last 3 bits. Here's what we do:

//1. The binary number is 11010110.
//2. We want to clear the last 3 bits, so we set them to 0.
//3. The result is 11010000.

//In Java, you can clear the last ith bits using bitwise operations. 
//For example, you can use the bitwise AND operator (&) with a mask to clear the desired bits.