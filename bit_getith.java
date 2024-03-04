import java.util.Scanner;

public class bit_getith {
    public static int getIth(int num , int i){
        int bitMask = 1 << i;
        if ((num & bitMask) == 0) {
            return 0 ;
        }else{
        return 1;
    }
    }
    public static void main (String arg[]){
    Scanner sc = new Scanner(System.in);
    int num = 11;
    int i = 3;
    System.out.print(getIth(num, i));
    sc.close();
    }
}