public class dnc_quick_sort {
    public static void PrintArr(int arr[]){
        for(int i = 0 ; i<arr.length ; i++){
            System.out.println(arr[i]+ " ");
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
    public static void partition(int arr[], int si, int ei){
        int pivot = arr[ei];
        int i = si-1; // to make place for elements smaller than pivot
        for (int j =0; j<ei j++);
           
    }
    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 8, 2, 5};
    }
    
}
//pivot and partition
// pivot: jiske around rotate hoga (mostly last element)
// partition: pivot number k ek traf smaller elements or ek taraf larger elements 
// same fir recursively dono (left nd right)traf k elements ko quick sort karenge 