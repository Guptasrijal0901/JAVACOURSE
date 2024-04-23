public class rec_last_occurence {
    public static int lastOccurence(int arr[], int key, int i){
        if (i == arr.length) {
            return -1;
        }
        int isFound = lastOccurence(arr, key, i+1);
        if(isFound != -1){
            return isFound;
        }
        // check with self
        if (arr[i] == key) {
            return i ;
        }
        return isFound;
    }
    public static void main(String[] args) {
       int arr[] = {1, 3, 4, 6, 1, 4, 5, 7, 8, 9}; 
       System.out.println(lastOccurence(arr, 4, 0));
    }
}
