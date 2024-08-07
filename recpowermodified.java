public class recpowermodified {
    public static int power2(int a, int n) {
        if (n == 0) {
            return 1;
        }
        int halfpower = power2(a, n / 2) + power2(a, n / 2);

        if (n % 2 != 0) {
            return a * halfpower;
        }
        return halfpower;
    }

    public static void main(String[] args) {
        int n = 10;
        int a = 2;
        System.out.println(power2(a, n));
    }
}
// TC = O(2*logn) = O(n)