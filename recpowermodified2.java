public class recpowermodified2 {
    public static int power2(int a, int n) {
        if (n == 0) {
            return 1;
        }
        int halfpower = power2(a, n / 2);
        int halfpowersq = halfpower * halfpower;

        if (n % 2 != 0) {
            return a * halfpowersq;
        }
        return halfpowersq;
    }

    public static void main(String[] args) {
        int n = 10;
        int a = 2;
        System.out.println(power2(a, n));
    }
}
// TC = o(n)
// SC =