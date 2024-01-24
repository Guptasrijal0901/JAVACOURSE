import java.util.Scanner;

public class pattern {
    public static void main (String arg[]){
    Scanner sc = new Scanner(System.in);
    for (int line = 1 ; line <= 4 ; line++){
        for ( int star = 1 ; star <= line ; star++){
            System.out.print(" * ");
        }
        System.out.println();
    }
    sc.close();
    }
}