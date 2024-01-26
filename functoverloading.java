import java.util.Scanner;

public class functoverloading {

    public static int sum (int a , int b ){
        return a+b;
    }

    public static float sum (float a , float b ){
        return a+b;
    }

    // public static int sum (int a , int b ){
    //     return a + b;
    // }
    // public static int sum (int a , int b , int c ){
    //     return a + b + c ;
    // }
        public static void main (String arg[]){
        Scanner sc = new Scanner(System.in);
        // System.out.println(sum(9, 8));
        // System.out.println(sum(9, 9, 9));
        System.out.println(sum(0.9f, 0.5f));
        System.out.println(sum(9, 5));
        sc.close();
        }
    }
//multiply(int a, int b ) multiply(double a b double b)...........
//multiply(int a, int b , int c )
// function overloading means that we have function doing some work 
// having same name but different type of datatypes in parameter 
// no. of parameters different hota hai yaa fir 
// function overloading sirf parameters pe depend karti hai 