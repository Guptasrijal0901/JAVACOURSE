public class rec_first_occurence {
    public static int firstOccurence(int arr[], int i, int key){
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return firstOccurence(arr, i+1, key);
    }
        public static void main(String[] args) {
        int arr[] = {1, 3, 6, 7, 8, 9};
        System.out.println(firstOccurence(arr, 0, 9));
    }
}
// TC: O(n)
// SC: O(n)