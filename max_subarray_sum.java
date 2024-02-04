import java.util.Scanner;

public class max_subarray_sum {
    public static void maxSubArraySum(int array[]){
    int Total_sub = 0 ;
    int curSum = 0 ;
    int maxSum = Integer.MIN_VALUE;
    int mimSum = Integer.MAX_VALUE;
    int m = array.length;
    for(int i = 0 ; i < m ; i++){
        int start = i ;
        for (int j = i ; j < m ; j++){
            int end = j ;
            curSum = 0 ;
            for (int k = start ; k <= end; k++){
                // System.out.print(array[k]+ " ");
                curSum = curSum + array[k];
            }
            System.out.println(curSum);
            if (maxSum < curSum) {
                maxSum = curSum;
            }
            if (mimSum > curSum) {
                mimSum = curSum;
            }
        }
    }
    System.out.println("Total subarray: " + Total_sub);
    System.out.println("Maximum sum is : " + maxSum);
    System.out.println("Mininimum sum is " + mimSum);
    }
    public static void main (String arg[]){
    Scanner sc = new Scanner(System.in);
    int array [] = {2, 4, 6, 8, 10};
    maxSubArraySum(array);
    sc.close();
    }
    
}
