import java.util.Scanner;

public class switchbtn {
    public static void main (String arg[]){
    Scanner sc = new Scanner(System.in);
    //SYNTAX
    // SWITCH(VARIABLE){
    //     CASE1:
    //     CASE2:
    //     CASE3:
    //     DEFAULT:
    // }
    int number = 9;
    switch(number){
    case 1 : System.out.println("SAMOSA");
    break;
    case 2 : System.out.println("BURGER");
    break;
    case 3 : System.out.println("MOMOS");
    break;
    default : System.out.println("STOP DREAMING");
    }
    sc.close();
    }
}
// SWITCH STATEMENT MAI AGAR EK BAAR CONDITION TRUE HO JATA JAI
// TOH USKE BAAD K SARE CODE CHALNE LAAG JATE HAI 
// ESSE ROKNE K LIYE HM BREAK STATEMENT USE KARTE HAI 
