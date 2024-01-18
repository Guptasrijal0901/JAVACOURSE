import java.util.Scanner;

public class typepromotion {
    public static void main (String arg[]){
    Scanner sc = new Scanner(System.in);
    // BYTE, SHORT,CHART OPERAND TO INT
    // char a = 'a';
    // char b = 'b';
    // int c = a + b ;
    // System.out.println((int)(a));
    // System.out.println((int)(b));
    // System.out.println(c);
    // short a = 5 ;
    // byte b = 25;
    // char c = 'c';
    // byte d = (byte) (a + b + c);
    // System.out.println(d);
    int a = 29;
    float b = 67.99f;
    long c = 67;
    double d = 79;
    double ans = a + b + c + d ;
    System.out.println(ans);
    // JO SABSE BADA TYPE KA DATA HOTA HAI USSI MAI FINAL ANSWER CONVERT HOTA HAI TAKI KOI DATA LOSS NAA HO 
    }
}
