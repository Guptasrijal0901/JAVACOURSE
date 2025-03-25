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
    public static int prime(int n) {
        if (n <= 0  || n = 1) {
            return 0;
        }
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                return 1;
                // System.out.println("number is no prime");
                // int sum = 0;
                // sum = sum + i;
                // return sum;
            }
        }
    }

    public static void main(String[] args) {
        // System.out.println(nSum(0, 3));
        // int arr[] = { 1, 2, 6, 8, 7, 3, 2, 5, 2, 8, 5 };
        // System.out.println(unique(arr));
        int n = 12;
        System.out.println(prime(n));

    }
}