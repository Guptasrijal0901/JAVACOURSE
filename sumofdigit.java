import java.util.Scanner;

public class sumofdigit {

    public static int sumOFall(int n ){
        int sum = 0;
        while (n > 0) {
        int remainder = n % 10;
        sum = sum + remainder;
        n = n / 10 ;
        }
        return sum;
    }
    public static void main (String arg[]){
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter n : ");
    int n = sc.nextInt();
    int result = sumOFall(n);
    System.out.println("Sum of all digits of n is: " + result);
    sc.close();
    }
}