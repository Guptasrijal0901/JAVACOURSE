public class rec_num_to_string {
    static String digits[] = 
{"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    public static void numTOstring(int n){
        if (n == 0) {
            return;
        }
        int lastDigit = n%10;
        numTOstring(n/10);
        System.out.print(digits[lastDigit]+ " ");
    }
    public static void main(String[] args) {
          numTOstring(2002);
    }
}
// n % 10 (modulo operation) returns the remainder when n is divided by 10,
// effectively extracting the last digit of n.
// n / 10 (integer division) returns the quotient when n is divided by 10, 
// effectively removing the last digit from n.
// For example:

// If n is 1234, then n % 10 would be 4 because the remainder of 1234 divided by 10 is 4.
// If n is 1234, then n / 10 would be 123 because 1234 divided by 10 (integer division) is 123, 
// effectively removing the last digit 4.
// So, when you want to extract the last digit of a number, you use n % 10. 
// When you want to remove the last digit from a number, you use n / 10.