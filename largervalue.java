import java.util.Scanner;

public class largervalue {
    public static void main (String arg[]){
    Scanner sc = new Scanner(System.in);
    int A = 1 ;
    int B = 7 ;

    if (A >= B) {
        System.out.println("A is larger");
    }else {
        System.out.println("A is smaller than B");
    }
    sc.close();
    }
}
