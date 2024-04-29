public class dnc_merg_sort {
    public static void mergeSort(int arr[], int si, int ei){
        if (si >= ei ) {
            return;
        }
        // kaam
        int mid = si (ei-si)/2;
        mergeSort(arr, si, mid); // left part 
        mergeSort(arr, mid+1, ei); // right part 
        merge(arr, si, mid, ei);
    }
    public static void merge(int arr[], int si, int mid, int ei){
        int temp[] new int [ei - si + 1];
    }
    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 5, 2, 8};
        mergeSort(arr, 0, arr.length-1);
    }
}
