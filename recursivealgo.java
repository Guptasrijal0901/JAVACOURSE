public class recursivealgo {

}
// To understand recursive algorithms in Java for finding time complexity (TC)
// and space complexity (SC),
// let's break it down step by step with simple terms and examples.

// What is Recursion?

// Recursion in programming is when a function calls itself to solve smaller
// instances of the same problem until it reaches a base case.

// Example: Factorial Calculation

// Let's take a simple example of calculating the factorial of a number using
// recursion:

// java
// public class Factorial {
// public static int factorial(int n) {
// if (n == 0) {
// return 1; // base case
// }
// return n * factorial(n - 1); // recursive call
// }

// public static void main(String[] args) {
// int number = 5;
// System.out.println("Factorial of " + number + " is: " + factorial(number));
// }
// }

// ### Time Complexity (TC)

// Time Complexity measures the amount of time an algorithm takes to complete as
// a
// function of the input size.

// 1. Recursive Function Calls**: Each call to `factorial(n)` results in
// another
// call to `factorial(n - 1)`, until `n` reaches 0.
// 2. **Total Work Done**: For `factorial(n)`, there are `n` recursive calls.

// So, the time complexity is \(O(n)\).

// ### Space Complexity (SC)

// Space Complexity measures the amount of memory an algorithm uses as a
// function of the input size.

// 1. **Stack Space**: Each recursive call adds a new frame to the call stack.
// In the case of `factorial(n)`, there are `n` recursive calls before the base
// case is reached.
// 2. **Auxiliary Space**: In this example, there is no additional memory usage
// except for the stack.

// So, the space complexity is also \(O(n)\) due to the call stack.

// ### Total Work Done and Recurrence Relation

// #### Total Work Done

// In recursive algorithms, the total work done is the sum of the work done in
// each recursive call.

// #### Recurrence Relation

// A recurrence relation is an equation or inequality that describes a function
// in terms of its value at smaller inputs.

// For the `factorial` function, the recurrence relation is:

// \[ T(n) = T(n-1) + O(1) \]

// Where:
// - \( T(n) \) is the time complexity for input `n`.
// - \( T(n-1) \) is the time complexity for the next smaller input.
// - \( O(1) \) represents the constant time operation of multiplying `n`.

// ### Example: Fibonacci Sequence

// To understand more complex recurrence relations, let's consider the Fibonacci
// sequence:

// ```java
// public class Fibonacci {
// public static int fibonacci(int n) {
// if (n <= 1) {
// return n; // base case
// }
// return fibonacci(n - 1) + fibonacci(n - 2); // recursive calls
// }

// public static void main(String[] args) {
// int number = 5;
// System.out.println("Fibonacci of " + number + " is: " + fibonacci(number));
// }
// }
// ```

// ### Time Complexity (TC)

// 1. **Recursive Function Calls**: Each call to `fibonacci(n)` results in two
// more calls:
// `fibonacci(n - 1)` and `fibonacci(n - 2)`.
// 2. **Total Work Done**: The total number of calls grows exponentially.

// The recurrence relation for the Fibonacci sequence is:

// \[ T(n) = T(n-1) + T(n-2) + O(1) \]

// This results in an exponential time complexity:

// \[ T(n) = O(2^n) \]

// ### Space Complexity (SC)

// 1. **Stack Space**: Each call adds a new frame to the call stack.
// The maximum depth of the call stack is `n`.
// 2. **Auxiliary Space**: There is no additional memory usage except for the
// stack.

// So, the space complexity is \(O(n)\).

// ### Summary

// - **Factorial Example**:
// - Time Complexity: \(O(n)\)
// - Space Complexity: \(O(n)\)
// - Recurrence Relation: \(T(n) = T(n-1) + O(1)\)

// - **Fibonacci Example**:
// - Time Complexity: \(O(2^n)\)
// - Space Complexity: \(O(n)\)
// - Recurrence Relation: \(T(n) = T(n-1) + T(n-2) + O(1)\)

// Understanding recursive algorithms involves analyzing how the function calls
// itself,
// determining the base case, and then constructing the recurrence relation to
// find the time and space complexities.