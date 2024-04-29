public class dnc_merg_sort {

    public static void PrintArr(int arr[]){
        for(int i = 0 ; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void mergeSort(int arr[], int si, int ei){
        if (si >= ei ) {
            return;
        }
        // kaam
        int mid = si + (ei-si)/2; // (si+ei)/2 se bhi chal jayega 
        mergeSort(arr, si, mid); // left part 
        mergeSort(arr, mid+1, ei); // right part 
        merge(arr, si, mid, ei);
    }
    public static void merge(int arr[], int si, int mid, int ei){
        int temp[] = new int [ei - si + 1]; 
        // 0 bhi hai naa toh usko bhi include karna hai esliye plus karna padega
        int i = si; // iterator for left part
        int j = mid+1; // iterator for right part
        int k = 0 ; // iterator for tem array
        while(i <= mid && j <= ei){
            if (arr[i]<arr[j]) { 
                // aab hm elements ko compare kar rahe hai left array and right array
                temp[k] = arr[i];
                // agar kaam ho gya toh temp k andar store kar lena hai 
                i++;
                k++;
            }else{
                temp[k] = arr[j];
                j++ ;
                k++;
            }
        }
// first part k toh khtm ho gye aab 2nd part k array k bache elements ko conquer karna hai 
        // left part mai agar kuch bacha hai toh 
        while (i <= mid ) {
            temp[k++] = arr[i++];
        }
        // right part 
        while (j <= ei) {
            temp[k++] = arr[j++];
        }
        // copy temp to original arr
        for (k = 0, i = si; k <temp.length; k++, i++){
            arr[i] = temp[k];
        }
    }
    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 5, 2, 8, -2};
        mergeSort(arr, 0, arr.length-1);
        PrintArr(arr);
    }
}
// TC: O(nlogn)
// SC: O(n)
// this technique is depth 