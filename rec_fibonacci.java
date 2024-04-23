public class rec_fibonacci {
    public static int nFibonacci(int n){
    if (n == 0 || n == 1) {
        return n ;
    } // base case
    int fibon1 = nFibonacci(n-1); // yeh chooti problems solve karega 
    int fibon2 = nFibonacci(n-2); // yeh bhi chooti problems solve karega 
    int fibon = fibon1 + fibon2;
    return fibon;
    }
    public static void printFiboSeries(int count){
        for (int i = 0 ; i <= count ; i++){
            System.out.print( nFibonacci(i) + " ");
        }
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Fibonacci Series upto " + n + ": "+nFibonacci(n));
        printFiboSeries(n);
    }
}
// Fibonacci numbers are a sequence of numbers where each number is the sum of the two preceding ones, 
// usually starting with 0 and 1. So, the sequence goes like this: 
// 0, 1, 1, 2, 3, 5, 8, 13, 21, and so on.
// This means that each Fibonacci number is the sum of the two preceding Fibonacci numbers.
// Sure, let's perform a stack analysis for the provided recursive Fibonacci code:

// 1. **Main Method Invocation**: 
// - The `main` method is invoked with `n` set to 5.
// - It prints the nth Fibonacci number by calling `nFibonacci(n)`.
// - It also calls `printFiboSeries(n)` to print the Fibonacci series up to the nth term.

// 2. **nFibonacci Method Invocation** (for printing the nth Fibonacci number):
// - `nFibonacci(5)` is called from the `main` method.
// - Since `n` is not 0 or 1, it recursively calls `nFibonacci(4)` and `nFibonacci(3)`.

// 3. **Recursion Level 1**:
// - `nFibonacci(4)` is called.
// - Since `n` is not 0 or 1, it recursively calls `nFibonacci(3)` and `nFibonacci(2)`.

// 4. **Recursion Level 2**:
// - For `nFibonacci(3)`, it calls `nFibonacci(2)` and `nFibonacci(1)`.
// - For `nFibonacci(2)`, it calls `nFibonacci(1)` and `nFibonacci(0)`.

// 5. **Recursion Level 3**:
// - At this level, several calls to `nFibonacci` are made with `n` equal to 0 or 1.
// - These calls return 0 or 1 without further recursion.

// 6. **Backtracking and Calculation**:
// - Once the base cases (n = 0 or 1) are reached, the recursion starts to unwind.
// - `nFibonacci(2)` receives the results from `nFibonacci(1)` and `nFibonacci(0)`, calculates their sum (1), and returns it.
// - `nFibonacci(3)` receives the results from `nFibonacci(2)` and `nFibonacci(1)`, calculates their sum (2), and returns it.
// - Similarly, this process continues until `nFibonacci(5)` gets the results from `nFibonacci(4)` and `nFibonacci(3)`, calculates their sum (5), and returns it.

// 7. **Printing the Fibonacci Series**:
// - After printing the nth Fibonacci number (5), the `printFiboSeries` method is called from the `main` method with `count` set to 5.
// - It iterates from 0 to 5 and prints the Fibonacci number at each index.

// That's the stack analysis for the provided code. It illustrates how the recursion works and how the stack frames are managed during the execution.
// TC: O(2`n)
// in Dynamic programing we will reduse this to linner 
// SC: O(n)