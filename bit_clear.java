import java.util.Scanner;

public class bit_clear {
    public static int clearith(int num , int i ){
        int bitMask = 1<<i;
        return (~(bitMask) & num);
    }
    public static void main (String arg[]){
    Scanner sc = new Scanner(System.in);
    System.out.println(clearith(10, 1));
    sc.close();
    }
}
