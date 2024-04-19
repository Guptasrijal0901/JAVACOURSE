public class rec_factorial {

    public static int printFactorial(int n ){
        if(n == 0){
            return 1;
        }
        int fnm1 = printFactorial(n-1);
        // asumming yeh hme fact of n-1 calulate kar de dega 
        int fn = fnm1 * n ;
        // fnm1 se n multiply kar k hm fn nikal lenge
        return fn;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(printFactorial(n));;
    }
}
// TC is O(n)
// SC is not constant because jab call stack call hoga toh duplicate memory banega 
// therefore SC is O(n)
