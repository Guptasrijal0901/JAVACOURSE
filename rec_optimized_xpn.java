public class rec_optimized_xpn {
    public static int optimizedPower(int x , int n){
        // base case 
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return x;
        }
        // for even 
        int halfPowerSq = optimizedPower(x, n/2) * optimizedPower(x, n/2);
        // for odd 
        if (n % 2 != 0) {
            halfPowerSq = x * halfPowerSq;
        }
        return halfPowerSq;
    }
    public static void main(String[] args) {
        int x = 2;
        int n = 10;
        System.out.println(optimizedPower(x, n));
    }
}
