import java.util.Scanner;

public class hollowrectangle {

    public static void hollow_rectangle(int row , int col){
        // outer loop
     for(int i = 1 ; i <= row ; i++){
        // inner columns
        for( int j = 1 ; j <= col ; j++){
        if (i == 1 || i == row || j == 1 || j == col) {
             System.out.print("*");
        }else{
            System.out.print(" "); // print s space for hollow parts 
        }
     }
     System.out.println();
    }
    }
     public static void main (String arg[]){
    Scanner sc = new Scanner(System.in);
    sc.close();
    hollow_rectangle(5, 4);
    }
}
