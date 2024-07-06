public class modifiedbubblesort {

    public static void bubbleSort(int[] array) {
        int n = array.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap array[j] and array[j + 1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no two elements were swapped by inner loop, then break
            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = { 64, 34, 25, 12, 22, 11, 90 };

        System.out.println("Unsorted array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        // int num: Declares a new integer variable num that will hold the value of each
        // element in the array during each iteration.
        // : array: Indicates that num will take each value from the array one by one.
        bubbleSort(array);

        System.out.println("\nSorted array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}

// ### Explanation

// 1. **Initialization**:
// - `n` is the length of the array.
// - `swapped` is a boolean flag used to detect if any swaps were made in the
// current pass.

// 2. **Outer Loop**:
// - Runs `n-1` times, representing each pass through the array.
// - `swapped` is set to `false` at the beginning of each pass.

// 3. **Inner Loop**:
// - Compares each pair of adjacent elements and swaps them if they are in the
// wrong order.
// - If any swap is made, `swapped` is set to `true`.

// 4. **Early Termination**:
// - After each pass, the algorithm checks if any swaps were made.
// - If no swaps were made (`swapped` is `false`), the array is already sorted,
// and the algorithm terminates early.

// ### Benefits of Modified Bubble Sort
// - **Efficiency**: The modified version can terminate early if the array is
// already sorted,
// reducing the number of unnecessary passes.
// - **Simplicity**: It retains the simplicity and ease of implementation of the
// original Bubble Sort
// while being more efficient in many cases.

// This optimization makes Bubble Sort more practical for cases where the array
// is partially
// sorted or small, though for larger datasets, more efficient algorithms like
// Merge Sort or Quick Sort are still preferable.