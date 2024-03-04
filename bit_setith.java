import java.util.Scanner;

public class bit_setith {
    public static int setith (int num , int i ){
    int bitMask = 1 << i;
        return num | bitMask;
    }
    public static void main (String arg[]){
    Scanner sc = new Scanner(System.in);
    System.out.println(setith(10, 2));
    sc.close();
    }
}