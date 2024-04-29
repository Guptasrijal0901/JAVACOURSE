public class dnc_merg_sort {

    public static void PrintArr(int arr[]){
        for(int i = 0 ; i < arr.length; i++){
            System.out.println(arr[i] " ");
        }
        System.out.println();
    }
    public static void mergeSort(int arr[], int si, int ei){
        if (si >= ei ) {
            return;
        }
        // kaam
        int mid = si + (ei-si)/2;
        mergeSort(arr, si, mid); // left part 
        mergeSort(arr, mid+1, ei); // right part 
        merge(arr, si, mid, ei);
    }
    public static void merge(int arr[], int si, int mid, int ei){
        int temp[] = new int [ei - si + 1];
        int i = si; // iterator for left part
        int j = mid+1; // iterator for right part
        int k = 0 ; // iterator for tem arr
        while(i <= mid && j <= ei){
            if (arr[i]<arr[j]) {
                temp[k] = arr[i];
                i++;
                j++;
            }else{
                temp[k] = arr[j];
                j++ ;
                k++;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 5, 2, 8};
        System.out.println(mergeSort(arr, 0, arr.length-1));
    }
}
