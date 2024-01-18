import java.util.Scanner;

public class calculator {
    public static void main (String arg[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter A : ");
    int A = sc.nextInt();
    System.out.println("Enter B : ");
    int B  = sc.nextInt();
    System.out.println("Enter operator : ");
    char operator = sc.next().charAt(0);
    System.out.println("Result:");
    switch (operator) {
        case '+': System.out.println(A + B);
            break;
        case '-' : System.out.println(A - B);
        break;
        case '%' : System.out.println(A % B);
        break;
        case '*' : System.out.println(A * B);
        break;
        default: System.out.println("Somthing wwent wrong");
        break;
    }
    System.out.println("Thank You");
    }
}
