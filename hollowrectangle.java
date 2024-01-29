import java.util.Scanner;

public class hollowrectangle {

    public static void hollow_rectangle(int row , int col){
        // outer loop
     for(int i = 1 ; i <= row ; i++){
        // inner columns
        for( int j = 1 ; j <= col ; j++){
        // this is boundary condition 
        if (i == 1 || i == row || j == 1 || j == col) { // || this is or statement ek bhi true hue tha print kar dega 
             System.out.print("o");
        }else{
            System.out.print(" "); // print s space for hollow parts 
        }
     }
     System.out.println();
    }
    }
    public static void main (String arg[]){
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter row: ");
    int row = sc.nextInt();
    System.out.print("Enter col: ");
    int col = sc.nextInt();
    hollow_rectangle(row, col);
    sc.close();
    }
}
