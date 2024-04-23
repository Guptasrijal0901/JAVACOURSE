public class rec_n_sum {
    public static int nSum(int n ){
        if (n == 1) {
            return 1;
        }
        int sum1 = nSum(n-1);
        int sum = sum1 + n;
        return sum ; 
    }
    public static void main(String[] args) {
        int n = 8;
        System.out.println( nSum(n) );
    }
}

// To perform a stack analysis of the recursion in the given Java code 
// for calculating the sum of the first n natural numbers, 
// let's walk through the execution step by step:

// 1. **Initial Call:**
// - The `main` method is called with `n = 8`.
// - Inside `main`, `nSum(8)` is called.

// 2. **nSum(8):**
// - The function receives `n = 8`.
// - It checks if `n == 1`, which is false.
// - It calls `nSum(7)` and stores the result in `sum1`.

// 3. **nSum(7):**
// - The function receives `n = 7`.
// - It checks if `n == 1`, which is false.
// - It calls `nSum(6)` and stores the result in `sum1`.

// 4. **nSum(6):**
// - Similar to above steps, `nSum(6)` calls `nSum(5)`.

// 5. **nSum(5):**
// - Similar to above steps, `nSum(5)` calls `nSum(4)`.

// 6. **nSum(4):**
// - Similar to above steps, `nSum(4)` calls `nSum(3)`.

// 7. **nSum(3):**
// - Similar to above steps, `nSum(3)` calls `nSum(2)`.

// 8. **nSum(2):**
// - Similar to above steps, `nSum(2)` calls `nSum(1)`.

// 9. **nSum(1):**
// - `n` is now equal to 1, so it returns 1.

// 10. **Backtracking:**
// - Now, each recursive call starts to return.
// - `nSum(2)` receives the return value (1) and calculates `sum = 1 + 2 = 3`.
// - `nSum(3)` receives the return value (3) and calculates `sum = 3 + 3 = 6`.
// - `nSum(4)` receives the return value (6) and calculates `sum = 6 + 4 = 10`.
// - `nSum(5)` receives the return value (10) and calculates `sum = 10 + 5 = 15`.
// - `nSum(6)` receives the return value (15) and calculates `sum = 15 + 6 = 21`.
// - `nSum(7)` receives the return value (21) and calculates `sum = 21 + 7 = 28`.
// - `nSum(8)` receives the return value (28) and calculates `sum = 28 + 8 = 36`.

// 11. **Final Output:**
//  - The `main` method prints `36`.

// This analysis demonstrates how the function builds up the sum recursively, 
// descending to the base case (n == 1) 
// and then adding the values back up as the recursion unwinds.


// TC is O(n)
// SC is O(n)