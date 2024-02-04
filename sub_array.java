import java.util.Scanner;

public class sub_array {
    public static void subarray(int array[]){
            int total_subarray = 0 ;
            int sum = 0 ;
            for (int i = 0 ; i < array.length ; i++){
            int start = i;
            for (int j = i ; j < array.length; j++){
            int end = j ;
            for (int k = start ; k <= end; k++){ // esmesirf print karwa rahe h 
            System.out.print(array[k] + " ");
            sum = sum + array[k];
            }
            total_subarray++;
            System.out.println();
            }
            System.err.println();
        }
        System.out.println("Sum of sub array is : " + sum);
        System.err.println("Total number of sub Array: " + total_subarray);
    }
    public static void main (String arg[]){
    Scanner sc = new Scanner(System.in);
    int array [] = {2, 4, 6, 8, 10};
    subarray(array);
    sc.close();
    }
    // 
}
