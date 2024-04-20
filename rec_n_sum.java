public class rec_n_sum {
    public static int nSum(int n ){
        if (n == 1) {
            return 1;
        }
        int sum1 = nSum(n-1);
        int sum = sum1 + n;
        return sum ; 
    }
    public static void main(String[] args) {
        int n = 2;
        System.out.println( nSum(n));;
    }
}
