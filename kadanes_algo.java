import java.util.Scanner;

public class kadanes_algo {
    public static void kardane(int array[]){
        int current_sum = 0 ;
        int maximum_sum = Integer.MIN_VALUE;
        int minimum_Element = Integer.MIN_VALUE;
        for(int i = 0 ; i < array.length ; i++){
            current_sum = current_sum + array[i];
            if (current_sum < 0 ) {
                current_sum = 0 ;
            }
            maximum_sum = Math.max(maximum_sum, current_sum);
            minimum_Element = Math.max(minimum_Element, array[i]);
        }
        // System.out.println("Maximum sum is: " + maximum_sum);
            if (maximum_sum == 0 ) {
                System.out.println("All elements are negative. Minimum element is: " + minimum_Element);
            }else{
                System.out.println("Maximum sum is: " + maximum_sum);
            }
    }
    public static void main (String arg[]){
    Scanner sc = new Scanner(System.in);
    int array[] = {-2, -3, 4, -1, -2, 1, 5, -3} ;
    kardane(array);
    sc.close();
    }
}
// esme kya hota hai 
// big+ve added to small-ve we get positive 
// +ve added +ve is positive 
// big-ve added to small+ve we get negative 
// so here what we will not cosider that negative value 
// we consider as 0 that negative value  
// eska TC O(n) jo ki acha hai or best approach hai 
// single loop use hua hai 
// toh eska TC n hai jo acha hai 
// if all elements of array is -ve then we get the 0 
// for that we have to use special case to fing tha smallest -ve value 