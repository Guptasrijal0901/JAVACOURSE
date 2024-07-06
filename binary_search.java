import java.util.Scanner;

public class binary_search {
    public static int BinarySearch(int number[], int key) {
        boolean found = false;
        int start = 0;
        int end = number.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;

            if (number[mid] == key) {
                return mid;
            }
            if (number[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        if (!found) {
            System.err.println("NOT FOUND ANY KEY");
        }
        return -1;
    }

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int number[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
        System.out.print("Enter key: ");
        int key = sc.nextInt();
        System.out.println("Your key is on index number: " + BinarySearch(number, key));
        sc.close();
    }
}
// its is for sorted arrays only
// array must be in acending or decending order
// it is like dictonary
// pseudo code
// start = 0 end n = 1
// while(start <= end )
// find mid
// compare mid and key
// mid == key (found)
// mid > key (left)
// mid < key (right)
// binary search code performs better than liner search because
// its time complexity is less than linear search
// TC of linear is O(n)
// TC of binary is O(logn)
// and we know logn is smaller than n

// Binary search is an efficient algorithm for finding a target value within a
// sorted array. It works by repeatedly dividing the search interval in half,
// comparing the target value to the middle element of the current interval.
// Here's a simple explanation of how binary search works in Java:

// ### Steps of Binary Search

// 1. **Start with the entire array**: Look at the middle element.
// 2. **Compare the target with the middle element**:
// - If the target is equal to the middle element, you've found the target.
// - If the target is less than the middle element, repeat the search on the
// left half of the array.
// - If the target is greater than the middle element, repeat the search on the
// right half of the array.
// 3. **Repeat the process**: Continue dividing the array in half until you find
// the target or the interval is empty.

// ### Example in Java

// Here's a simple implementation of binary search in Java:

// ```java
// public class BinarySearchExample {
// // Method to perform binary search
// public static int binarySearch(int[] array, int target) {
// int left = 0; // Left boundary
// int right = array.length - 1; // Right boundary

// while (left <= right) {
// int mid = left + (right - left) / 2; // Find the middle element

// // Check if the target is at mid
// if (array[mid] == target) {
// return mid; // Target found, return its index
// }

// // If target is smaller than mid, ignore the right half
// if (array[mid] > target) {
// right = mid - 1;
// }
// // If target is larger than mid, ignore the left half
// else {
// left = mid + 1;
// }
// }

// return -1; // Target not found
// }

// public static void main(String[] args) {
// int[] array = {2, 3, 4, 10, 40};
// int target = 10;
// int result = binarySearch(array, target);

// if (result == -1) {
// System.out.println("Element not present");
// } else {
// System.out.println("Element found at index " + result);
// }
// }
// }
// ```

// ### Explanation of the Code

// 1. **Method Definition**:
// - `public static int binarySearch(int[] array, int target)`: This method
// takes a sorted array and a target
// value as inputs and returns the index of the target if found, or -1 if not
// found.

// 2. **Initialization**:
// - `int left = 0`: The left boundary starts at the beginning of the array.
// - `int right = array.length - 1`: The right boundary starts at the end of the
// array.

// 3. **Loop**:
// - `while (left <= right)`: Continue the loop as long as the left boundary is
// less
// than or equal to the right boundary.

// 4. **Middle Calculation**:
// - `int mid = left + (right - left) / 2`: Find the middle index of the current
// search interval.

// 5. **Comparison**:
// - `if (array[mid] == target)`: If the middle element is the target, return
// its index.
// - `if (array[mid] > target)`: If the target is smaller than the middle
// element, move the right boundary to `mid - 1`.
// - `else`: If the target is larger than the middle element, move the left
// boundary to `mid + 1`.

// 6. **Termination**:
// - If the loop ends without finding the target, return -1 to indicate the
// target is not in the array.

// 7. **Main Method**:
// - Example array and target are defined.
// - The `binarySearch` method is called, and the result is printed.

// ### Key Points
// - Binary search only works on sorted arrays.
// - It has a time complexity of O(log n), making it much faster than a linear
// search (O(n)) for large arrays.
// - By dividing the search interval in half each time, it quickly narrows down
// the possible location of the target value.

// This approach ensures that you can efficiently find an element in a large
// sorted array with minimal comparisons.