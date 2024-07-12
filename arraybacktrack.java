public class arraybacktrack {
    // The class arraybacktrack contains the main method and other helper methods
    // for manipulating the array.
    public static void changeArr(int arr[], int i, int val) {
        // This method modifies the array arr recursively. It takes three parameters:
        // the array arr, an index i, and a value val.
        // base case
        if (i == arr.length) {
            printArr(arr);
            return;
        }
        // The base case of the recursion checks if the index i has reached the length
        // of the array.
        // If it has, the array is printed using the printArr method, and the method
        // returns, ending this recursive branch.
        // recursion
        arr[i] = val;
        changeArr(arr, i + 1, val + 1); // function call
        arr[i] = arr[i] - 2; // backtracking step
    }
    // In the recursive case:

    // The current element at index i is set to val.
    // The method changeArr is called recursively with the next index i + 1 and the
    // next value val + 1.
    // After the recursive call returns, the current element at index i is decreased
    // by 2 (arr[i] = arr[i] - 2). This is the backtracking step.

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // This method prints the elements of the array in a single line, separated by
    // spaces.
    public static void main(String[] args) {
        int arr[] = new int[5];
        changeArr(arr, 0, 1);
        printArr(arr);
    }
}
// In the main method:

// An array arr of length 5 is created and initialized with zeros.
// The changeArr method is called with the array, starting index 0, and initial
// value 1.
// After the recursive method completes, the final state of the array is
// printed.

// Explanation of the Execution Flow
// Initially, arr is [0, 0, 0, 0, 0].
// The changeArr method is called with i = 0 and val = 1.
// In the first call, arr[0] is set to 1. The method calls itself with i = 1 and
// val = 2.
// In the second call, arr[1] is set to 2. The method calls itself with i = 2
// and val = 3.
// This continues until i = 5, where the base case is met, and the array [1, 2,
// 3, 4, 5] is printed.
// After reaching the base case, the method backtracks, decrementing each
// element by 2 as it returns:
// arr[4] becomes 3
// arr[3] becomes 2
// arr[2] becomes 1
// arr[1] becomes 0
// arr[0] becomes -1
// Finally, the modified array [-1, 0, 1, 2, 3] is printed in the main method.
// The backtracking step (arr[i] = arr[i] - 2) ensures that each element is
// modified as the recursion unwinds, leading to the final output array.