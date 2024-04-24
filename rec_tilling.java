public class rec_tilling {
    public static int countTilingWays(int n){
        // base case 
        // There's only one way to tile a 2x0 board (no tiles) and
        // Only one way to tile a 2x1 board (vertically)
        if (n == 0 || n == 1) {
            return 1;
        }
        // Recursive step
        // The number of ways to tile a 2xn board is equal to the sum of the number of ways
        // to tile a 2x(n-1) board and a 2x(n-2) board
        // vertical choice
        int countnm1 = countTilingWays(n-1);
        // horizontal choice
        int countnm2 = countTilingWays(n-2);
        // total choice 
        int totalCount = countnm1 + countnm2;
        // We can place the next tile vertically, 
        // reducing the width of the board by 1. 
        // So, we call countTilingWays(n-1) to find the number of ways to tile the board 
        // with a width of n-1.
        // We can place the next tile horizontally, 
        // reducing the width of the board by 2. 
        // So, we call countTilingWays(n-2) to find the number of ways to tile the board with a width of n-2.
        return totalCount;
    }
    public static void main(String[] args) {
        int n = 9 ;
        System.out.println("Number of ways to tile the board for N = " + n + " is: " + countTilingWays(n));
    }
}
// Given a "2Xn" board and tiles of size "2x1", count the number of ways to tile the given 
// board using the 2x1 tiles. 
// (A tile can either be placed horizontally or vertically).

// To solve this problem without writing code, 
// let's first understand the problem statement. 
// We have a 2xN board, and we need to tile it using 2x1 tiles. 
// These tiles can be placed either horizontally or vertically.

// For simplicity, let's start with a small value of N, say N=3. 
// We want to find the number of ways to tile the 2x3 board.

// Now, let's break down the problem into smaller steps:

// 1. **Base Cases**: First, let's identify the base cases. 
// For N=1, there's only one way to tile the board (placing one tile vertically). 
// For N=2, there are two ways: either place both tiles horizontally, 
// or place them vertically.

// 2. **Recurrence Relation**: To find the solution for N=3, 
// we can think about the ways to extend the tiling from N=2. 
// We can either:
//    - Place the third tile vertically on the left side of the existing tiling for N=2 
//    (forming a vertical column of three tiles).
//    - Place the third tile horizontally to the right of the existing tiling for N=2 
//    (forming a horizontal row of three tiles).

// 3. **Generalization**: We can extend this idea for larger values of N. 
// For each value of N, we can either place the next tile vertically or horizontally.

// 4. **Recursive Solution**: We can utilize recursion to solve this problem. 
// The number of ways to tile a 2xN board is equal to the sum of the number of
// ways to tile a 2x(N-1) board (if we place the next tile vertically) and
// the number of ways to tile a 2x(N-2) board (if we place the next tile horizontally).

// 5. **Base Cases Handling**: Ensure proper handling of base cases 
// (N=1 and N=2) in the recursive function.

// 6. **Memoization or Dynamic Programming**: To optimize the solution,
// we can use memoization or dynamic programming techniques to avoid redundant calculations.

// 7. **Final Answer**: The final answer for N=3 will be the sum of the number of 
// ways to tile a 2x2 board and the number of ways to tile a 2x1 board, which is 3.

// This approach can be implemented in Java using recursion with memoization or 
// dynamic programming to efficiently solve the problem for larger values of N.

// Time complexity: O(N) or O(N) with dynamic programming
// Space complexity: O(1) without memoization, O(N) with memoization