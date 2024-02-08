import java.util.Scanner;

public class arrayrepeat {
    public static boolean repeat (int nums[]){
        int n = nums.length;
        for(int i = 0 ; i < n ; i++){
            for(int j = i+1 ; j < n ; j++ ){
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main (String arg[]){
    Scanner sc = new Scanner(System.in);
    int numbs[] = {1, 2, 3, 4, 9, 4};
    if (repeat(numbs)) {
        System.out.println("Array contain repeated elements");
    }else{
        System.out.println("Array does not contain repeated elements");
    }
    sc.close();
    }
}
