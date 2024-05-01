public class dnc_quick_sort {
    public static void PrintArr(int arr[]){ // This line starts the definition of a Java class named dnc_quick_sort
        for(int i = 0 ; i<arr.length ; i++){ //This line declares a method named PrintArr that takes an array of integers (arr) as input and doesn't return anything (void). 
// This method is responsible for printing out the elements of the array.
            System.out.print(arr[i]+ " "); //This line starts a loop that goes through each element of the array arr.
        }
        System.out.println(); // This line prints out the current element of the array followed by a space.
    }

    public static void quicksort(int arr[], int si, int ei){ // This line declares a method named quicksort that takes three arguments: an array of integers (arr), a starting index (si), 
        // and an ending index (ei). This method is responsible for sorting the array using the quicksort algorithm.
        if (si >= ei) { // This line checks if the starting index (si) is greater than or equal to the ending index (ei). If it is, the method returns, as there are no elements to sort.
            return;
        }
    //pivot: last element
    int pIdx = partition(arr, si, ei); // This line calls the partition method to find the pivot index (pIdx) and partition the array accordingly.
    quicksort(arr, si, pIdx-1); //left // This line recursively calls the quicksort method for the left partition of the array.
    quicksort(arr, pIdx, ei); // This line recursively calls the quicksort method for the right partition of the array.
    }
    public static int partition(int arr[], int si, int ei){ //  This line declares a method named partition that takes three arguments: an array of integers (arr), 
        // a starting index (si), and an ending index (ei). This method is responsible for partitioning the array around a pivot element.
        int pivot = arr[ei]; // This line selects the pivot element, which is the last element of the array.
        int i = si-1; // to make place for elements smaller than pivot // This line initializes a variable i to one less than the starting index (si). 
        // This variable will keep track of the index where elements less than the pivot will be placed.
        for (int j = si; j<ei ; j++){ // This line starts a loop that goes through each element of the array from the starting index (si) to the ending index (ei).
           if (arr[j] <= pivot) { // This line checks if the current element is less than or equal to the pivot.
            i++; // This line increments the variable i to make space for the current element.
            // swap 
        // This line swaps the current element with the element at index i.
            int temp = arr[j]; 
            arr[j] = arr[i];
            arr[i] = temp;
        }
        }
        i++; // This line increments i again after the loop to move to the next position.
        // This line swaps the pivot element with the element at index i, placing the pivot at its correct position in the sorted array.
        int temp = pivot; 
        arr[ei] = arr[i];
        arr[i] = temp;
        return i; // This line returns the index of the pivot element.
    }
    public static void main(String[] args) { // This line declares the main method, the entry point of the program.
        int arr[] = {6, 3, 9, 8, 2, 5, -6}; // This line initializes an array named arr with some integers.
        quicksort(arr, 0, arr.length-1); // This line calls the quicksort method to sort the array.
        PrintArr(arr);// This line calls the PrintArr method to print the sorted array.
    }
}
//pivot and partition
// pivot: jiske around rotate hoga (mostly last element)
// partition: pivot number k ek traf smaller elements or ek taraf larger elements 
// same fir recursively dono (left nd right)traf k elements ko quick sort karenge 