import java.util.Arrays;

public class TCSpractice {
    // public static int nSum(int m, int n) {
    // if (m > n) {
    // return 0;
    // }
    // int sum = 0;
    // for (int i = m; i <= n; i++) {
    // sum = sum + i;
    // }
    // return sum;
    // }
    public static int unique(int arr[]) {

        if (arr.length == 0) {
            return 0;
        }
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                return arr[i];
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        // System.out.println(nSum(0, 3));
        int arr[] = { 1, 2, 6, 8, 7, 3, 2, 5, 2, 8, 5 };
        System.out.println(unique(arr));
    }

}
