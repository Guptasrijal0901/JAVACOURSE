import java.util.Scanner;

public class incometax {
    public static void main (String arg[]){
    Scanner sc = new Scanner(System.in);
    int income = sc.nextInt();
    int tax ;
    if (income < 500000) {
        System.out.println("0% tax");
        tax = 0;
    } else if ( income >= 500000 && income < 1000000) {
        System.out.println("20% tax");
        tax = (int) (income*0.2);
        System.out.println(tax);
    }else if ( income >= 1000000){
        System.out.println("30% tax");
        tax = (int) (income*0.3);
        System.out.println(tax);
    }
    }
}
