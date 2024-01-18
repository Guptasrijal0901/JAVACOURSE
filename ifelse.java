import java.util.Scanner;

public class ifelse {
    public static void main (String arg[]){
    Scanner sc = new Scanner(System.in);
    int age = 16 ;
    if (age>=18) {
        System.out.println("Adult");
    }
    else if(age > 13 && age < 18) {
        System.out.println("Teenager");
    }else{
        System.out.println("Not adult");
    }

    }
}
