import java.util.Scanner;

public class function_array {

    public static void update(int marks[]){
        // this i act as index of an array 
        for (int i = 0 ; i < marks.length ; i++){
        marks[i] = marks[i] + 3 ;
        }
    }
    public static void main (String arg[]){
    Scanner sc = new Scanner(System.in);
    int marks[] = { 9, 8, 7, 6, 5, 4, 3, 2, 1};
    update(marks);
    // to print our marks 
    for ( int i = 0 ; i < marks.length ; i++){
        System.out.print(marks[i] + " ");
    }
    System.out.println();
    sc.close();
    }
}
