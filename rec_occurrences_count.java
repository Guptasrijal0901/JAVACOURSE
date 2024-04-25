public class rec_occurrences_count {
    public static void occurrencesCount(int arr[], int key, int n){
        if (n == arr.length) {
            return;
        }
        if (arr[n] == key) {
            System.out.print(n + " ");
        }
        occurrencesCount(arr, key, n+1);
    }
    public static void main(String[] args) {
        int arr[] = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        int key = 2;
        occurrencesCount(arr, key, 0);
    }
}
