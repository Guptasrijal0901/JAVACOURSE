public class rec_check_array_sorting {
        public static boolean sortArray( int  arr[], int i ){
            if(i == arr.length-1){
                return true;
            }
        if (arr[i] > arr[i+1]) {
            return false;
        }
        return sortArray(arr, i+1);
    }
    public static void main(String[] args) {
        int arr[] = {1, 3, 9, 8}; 
        System.out.println(sortArray(arr, 0));
    }  
}

// 1. `public class rec_check_array_sorting {`: 
// This line declares a public class named `rec_check_array_sorting`. 
// Classes in Java are templates for creating objects, and the keyword `public` 
// makes this class accessible to other classes in the same package or other packages.

// 2. `public static boolean sortArray(int arr[], int i) {`: 
// This line defines a method named `sortArray` that takes two parameters: 
// an integer array `arr` and an integer `i`. The method returns a boolean value 
// (`true` if the array is sorted, `false` otherwise). 
// The keyword `static` means that the method belongs to the class itself rather 
// than to instances of the class.

//  3. `if(i == arr.length-1) {`: This line checks 
// if the index `i` is equal to the last index of the array `arr`. If `i` is pointing to the last element of the array, 
// it means that the array has been fully traversed, so the method returns `true`.

//  4. `return true;`: This line returns `true` if the array is sorted 
// (i.e., if `i` is pointing to the last element of the array).

//  5. `if (arr[i] > arr[i+1]) {`: This line checks 
//     if the current element (`arr[i]`) is greater than the next element (`arr[i+1]`). 
//     If this condition is true, it means that the array is not sorted, so the method returns `false`.

//  6. `return false;`: This line returns `false` if the array is not sorted 
// (i.e., if the current element is greater than the next element).

//  7. `return sortArray(arr, i+1);`: This line is a recursive call to the `sortArray` method with the same array `arr` and with the index incremented by 1 (`i+1`). This recursive call iterates over the array elements until it reaches the last element or finds a pair of elements that are not in sorted order.

//  8. `public static void main(String[] args) {`: This line defines the `main` method, 
//     which is the entry point of the Java program. The `args` parameter is an array of strings 
//     that can be passed as command-line arguments.

//  9. `int arr[] = {1, 3, 9, 8};`: This line declares and initializes an integer array 
// `arr` with the values `{1, 3, 9, 8}`.

// // 10. `System.out.println(sortArray(arr, 0));`: This line calls the `sortArray`
//  method with the array `arr` and starting index `0`. It prints the boolean result 
//  returned by the `sortArray` method, indicating whether the array is sorted or not.