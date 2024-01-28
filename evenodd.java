import java.util.Scanner;

public class evenodd {
    public static boolean isEven(int n){
        if (n % 2 == 0) {
            return true;
        }else {
            return false;
        }
    }
    public static void main (String arg[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter n : ");
    int n = sc.nextInt();
    System.out.println(isEven(n));
    sc.close();
    }
    
}
