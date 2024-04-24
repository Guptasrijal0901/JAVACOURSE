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
        // int halfPowerSq = optimizedPower(x, n/2) * optimizedPower(x, n/2);
        // abhi bhi O(n) hai TC 
        // esko kaam karne k liye hm function call ko ek variable mai store kar lete hai jisse easy ho jayega 
        // this is faster approach
        // yaha TC hmhara O(n) se O(logn) ho gya hai
        int optP = optimizedPower(x, n/2);
        int halfPowerSq = optP*optP;
        // do baar function call nhi ho raha hai hme value ka variable bana liya hai
        // for odd 
        if (n % 2 != 0) {
            halfPowerSq = x * halfPowerSq;
        }
        return halfPowerSq;
    }
    public static void main(String[] args) {
        int x = 2;
        int n = 10;
        System.out.println("Answer: "+optimizedPower(x, n));
    }
}
