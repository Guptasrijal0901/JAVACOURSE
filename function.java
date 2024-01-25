import java.util.*;

public class function {
    // public static int print (){
    //     System.out.println("Hello World");
    //     return 1;  // jab function ka type void nhi hota toh hme return+num likhna hota hai  likhna hota hai 
    // }
    // public static void calculateSum (){
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter a = ");
    //     int a = sc.nextInt();
    //     System.out.print("Enter b = ");
    //     int b = sc.nextInt();
    //     int sum = a + b ;
    //     System.out.println("Sum a + b = " + sum);
    //     sc.close();
    // }
    public static int calculateSum ( int a , int b ){ // parameters or formal parameters 
        int sum = a + b ;
        return sum ;
    }
    public static void main (String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a = ");
        int a = sc.nextInt();
        System.out.print("Enter b = ");
        int b = sc.nextInt();
        int sum = calculateSum( a , b ); // there are arguments 
        System.out.println("Sum a + b = " + sum);   
        sc.close();
    }
}
// SYNTAX  
// RETURNTYPE NAME (){
//     BODY STATEMENT; 
// }
// function jo class k anadar likha jata hai usee methods kehte hai 
// SYNTAX WITH PARAMETERS
// RETURNTYPE NAME ( TYPE PARAM1 , TYPE PARAM2){
//     BODY 
//     RETURN ;
// }
// there are two type of parameters 
// 1. formal parameters/ parameters : during the definition of function 
// 2. actual parameters/ arguments : during call of function 
// function li memory call stack mai save hoti h 