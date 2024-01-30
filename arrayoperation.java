import java.util.Scanner;

public class arrayoperation {
    public static void main (String arg[]){

    int marks[] = new int [10];
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your marks: ");
    // marks[0] = sc.nextInt();
    // marks[1] = sc.nextInt();
    // marks[2] = sc.nextInt();
    // marks[3] = sc.nextInt();
    // marks[4] = sc.nextInt();
    // System.out.println(Arrays.toString(marks));
    // System.out.println("phy: " + marks[0]);
    // System.out.println("chem: " + marks[1]);
    // System.out.println("maths: " + marks[2]);
    // System.out.println("english: " + marks[3]);
    // System.out.println("hindi: " + marks[4]);

    // to update value 
    // marks[2] = 100;
    // also we can add operation to 
    // marks[2] = marks[2] + 1;
    
    // System.out.println("maths: " + marks[2]);

    // int percentage = (marks[0]+marks[1]+marks[3]+marks[4])/5;
    // System.out.println("The average of " + percentage);
    // To print the length of an array 
    System.out.println("length of array = " + marks.length);
    sc.close();
    }
}