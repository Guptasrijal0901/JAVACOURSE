import java.util.Arrays;
import java.util.Scanner;

public class prefix_array {
    public static void prefixMethod(int array[]){
    int curSum = 0 ;
    int maxSum = Integer.MIN_VALUE;
    int minSum = Integer.MAX_VALUE;
        int prefixArray[]= new int [array.length];
        int prefixSum = 0 ;
        for (int i = 0 ; i < array.length ; i++){
        prefixSum = array[i] + prefixSum;
        prefixArray[i] = prefixSum;
        }
        System.out.println("Prefix of "+ Arrays.toString(array) + " is "+ Arrays.toString(prefixArray));
        // array ko print karwana ho toh 

        for (int i = 0 ; i < array.length ; i++){
            int start = i;
            for (int j = i+1 ; j < array.length; j++){
            int end = j ;
            curSum = start == 0 ? prefixArray[end] : prefixArray[i] - prefixArray[start - 1 ] ;
            // if (maxSum < curSum){
            //     maxSum = curSum;
            // }
            // if (minSum > curSum) {
            //     minSum = curSum;
            // }
            // ess if ki jagha hm aise bhi likh sakte hai 
            maxSum = Math.max(maxSum, curSum);
            minSum = Math.min(minSum, curSum);
            }
        }
    System.out.println("Maximum sum is : " + maxSum);
    System.out.println("Mininimum sum is " + minSum);
    }
     public static void main (String arg[]){
    Scanner sc = new Scanner(System.in);
    int array [] = {1, -2, 6, -1, 3};
    prefixMethod(array);
    sc.close();
    }
}
// prefix array se hme sub arrays ka sum nikalne zayda optimize ho jayega
// prefix[end] - prefix[start-1]
// prefix array is sum of array elements upto its index number 