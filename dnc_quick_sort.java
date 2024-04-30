public class dnc_quick_sort {
    public static void PrintArr(int arr[]){
        for(int i = 0 ; i<arr.length ; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    public static void quicksort(int arr[], int si, int ei){
        if (si >= ei) {
            return;
        }
    //pivot: last element
    int pIdx = partition(arr, si, ei);
    quicksort(arr, si, pIdx-1); //left
    quicksort(arr, pIdx, ei);
    }
    public static int partition(int arr[], int si, int ei){
        int pivot = arr[ei];
        int i = si-1; // to make place for elements smaller than pivot
        for (int j = si; j<ei ; j++){
           if (arr[j] <= pivot) {
            i++;
            // swap 
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
        }
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }
    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 8, 2, 5};
        quicksort(arr, 0, arr.length-1);
        PrintArr(arr);
    }
    
}
//pivot and partition
// pivot: jiske around rotate hoga (mostly last element)
// partition: pivot number k ek traf smaller elements or ek taraf larger elements 
// same fir recursively dono (left nd right)traf k elements ko quick sort karenge 