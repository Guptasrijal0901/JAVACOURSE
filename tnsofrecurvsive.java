public class tnsofrecurvsive {

}
// Calculating the time complexity (TC) and space complexity (SC) of recursive
// algorithms can be a bit tricky,
// but with a step-by-step approach, it becomes manageable. Here’s a simplified
// explanation:

// ### Time Complexity (TC)

// 1. **Identify the Base Case**:
// - Look at the base case of the recursion.
// - Determine the time complexity for the base case. Usually,
// it’s O(1) because it often involves a simple return statement.

// 2. **Identify the Recursive Case**:
// - Look at how the function calls itself.
// - Determine how many times the function calls itself and how the input size
// decreases with each call.

// 3. **Set Up a Recurrence Relation**:
// - Write a recurrence relation that describes the time complexity of the
// recursive calls.
// - For example, if a function calls itself twice on half of the input,
// the relation might look like \( T(n) = 2T(n/2) + O(1) \).

// 4. **Solve the Recurrence Relation**:
// - Solve the recurrence relation using methods like the Master Theorem,
// recursion trees, or substitution.
// - The solution will give you the time complexity of the algorithm.

// #### Example: Fibonacci Sequence

// Here’s a simple recursive function to calculate the nth Fibonacci number:

// ```java
// public int fib(int n) {
// if (n <= 1) {
// return n;
// }
// return fib(n - 1) + fib(n - 2);
// }
// ```

// - **Base Case**: \( O(1) \) for \( n \leq 1 \).
// - **Recursive Case**: \( T(n) = T(n-1) + T(n-2) + O(1) \).

// To solve this, you recognize it grows exponentially because each call
// generates
// two more calls. This leads to a time complexity of \( O(2^n) \).

// ### Space Complexity (SC)

// 1. **Identify the Maximum Depth of the Recursion Tree**:
// - Determine how many recursive calls can be on the stack at the same time.
// - This is often equal to the depth of the recursion tree.

// 2. **Calculate Space for Each Call**:
// - Determine the amount of space each call uses. Usually, this is O(1) for the
// parameters,
// local variables, and return address.

// 3. **Combine the Two**:
// - Multiply the space used per call by the maximum depth of the recursion
// tree.

// #### Example: Fibonacci Sequence

// Using the same Fibonacci function:

// - **Maximum Depth**: The maximum depth of the recursion tree is \( n \),
// because the function calls itself with \( n-1 \) and \( n-2 \), and each call
// goes one level deeper.
// - **Space per Call**: Each call uses O(1) space.

// So, the space complexity is \( O(n) \).

// ### General Tips

// - **Linear Recursion**: If the function makes a single call, the depth is
// usually \( O(n) \).
// - **Divide and Conquer**: For algorithms that divide the problem into smaller
// parts (like merge sort),
// the depth is \( O(\log n) \) if the input size is halved each time.
// - **Multiple Recursive Calls**: If a function calls itself multiple times
// (like the Fibonacci example),
// analyze how the calls branch out to understand the depth and branching
// factor.

// ### Summary

// - **Time Complexity (TC)**: Analyze the base and recursive cases, set up a
// recurrence relation, and solve it.
// - **Space Complexity (SC)**: Determine the maximum recursion depth and
// multiply by the space used per call.

// By following these steps, you can systematically analyze and understand the
// time and space complexity of recursive algorithms.