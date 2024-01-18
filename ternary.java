import java.util.Scanner;

public class ternary {
    public static void main (String arg[]){
    Scanner sc = new Scanner(System.in);
    // int number = 4 ;
    // String type =((number%2) == 0) ? "even" : "odd";
    // System.out.println(type);
    int marks = sc.nextInt();
    String result = (marks>=33) ? "PASS" : "FAIL";
    System.out.println(result);
    }
// TERNARY OPERTATOR 
// SYNTAX :VARIABLE =  CONDITION?STATEMENT1:STATEMENT2
}
