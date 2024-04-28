public class rec_babbar {
    public static void countPrint(int n){
        if (n == 0) {
            return ;
        }
        System.out.print(n + " "); // decending order k liye
        countPrint(n-1);
        System.out.print(n + " "); // accending order k liye 
        return ;
    }
    public static int factorial(int n){
        if (n == 1) {
            return 1;
        }
        int fact1 = factorial(n-1);
        int totalFact = n*fact1;
        return totalFact;
    }
    public static int fibonacci(int n){
        if (n == 0 || n ==1) {
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
// yaha pe hm plus ker rahe hai last 2 number k 1 le nhi sakte value hi nhi milegi 
    }
    public static 
    public static void main(String[] args) {
        // countPrint(9);
        // System.out.println(factorial(5));
        // System.out.println(fibonacci(9));
    }
}
