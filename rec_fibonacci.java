public class rec_fibonacci {
    public static int nFibonacci(int n){
    if (n == 0) {
        return 0 ;
    }
    if (n == 1) {
        return 1;
    } // base case
    int fibon1 = nFibonacci(n-1); // yeh chooti problems solve karega 
    int fibon2 = nFibonacci(n-2); // yeh bhi chooti problems solve karega 
    int fibon = fibon1 + fibon2;
    return fibon;
    }
    public static void main(String[] args) {
        int n = 3;
        System.out.println(nFibonacci(n));
    }
}
// Fibonacci numbers are a sequence of numbers where each number is the sum of the two preceding ones, 
// usually starting with 0 and 1. So, the sequence goes like this: 
// 0, 1, 1, 2, 3, 5, 8, 13, 21, and so on.
// This means that each Fibonacci number is the sum of the two preceding Fibonacci numbers.