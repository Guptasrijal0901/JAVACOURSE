public class rec_xpn {
    public static int xPOWERn(int x, int n){
        if (n == 0) {
            return 1; // Any number raised to the power of 0 is 1
        }
        if (n == 1) { // Any number raised to the power of 1 is the number itself
            return x;
        }
        // Recursive call to calculate x^n
        int x1 = xPOWERn(x, n-1);
        int xn = x1 * x;
        return xn;
    }
    public static void main(String[] args) {
        int x = 2;
        int n = 10;
        System.out.println(xPOWERn(x, n));
    }
}
//
// The xPOWERn method takes two parameters, x and n, 
// representing the base and the exponent, respectively.
// The base cases are defined for when n is 0 and 1. 
// If n is 0, any number raised to the power of 0 is 1, 
// so it returns 1. If n is 1, any number raised to the power of 1 is the number itself, 
// so it returns x.
// The recursive case calculates x raised to the power of n by multiplying x 
// with the result of xPOWERn(x, n - 1) (i.e., x^(n-1)). This process continues until 
// the base case is reached.
// In the main method, x is set to 2 and n to 10, 
// and then the xPOWERn method is called with these values. 
// The result is printed to the console.

// TC: O(n)
// SC: 

