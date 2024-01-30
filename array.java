import java.util.Arrays;
import java.util.Scanner;

public class array {
     public static void main (String arg[]){
    Scanner sc = new Scanner(System.in);

    int marks [] = new int[5];
    System.out.println(Arrays.toString(marks));

    int number [] = { 1, 2, 3, 4, 5};
    System.out.println(Arrays.toString(number));

    String names[] = { "srijal", "arya", "priya", "shreya", "deepti" };
    System.out.println(Arrays.toString(names));
    sc.close();
    }
    
}
// list of elements of the same type placed in a contiguous memory location 
//operation in array 
//create
//input 
//output
//update
//syntax
//datatype arrayname[] = new datatype[size]