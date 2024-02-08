import java.util.Scanner;

public class trapping_rain_water {
public static int trappedwater(int height[]){
            // calculate left max boundar - array 
            int leftmax [] = new int [height.length];
            leftmax[0] = height[0];
            for (int i = 1 ;i < height.length ; i++){
                leftmax[i] = Math.max(height[i], leftmax[i-1]);
            }
            // calculate right max boundary - array 
            int rightmax [] = new int [height.length];
            rightmax[height.length - 1 ] = height[height.length - 1];
            for (int i = height.length-2; i >= 0 ; i-- ){
                rightmax [i] = Math.max(height[i], rightmax[i+1]);
            }
            // loop
            int trappedwater = 0 ;
            for (int i = 0 ; i < height.length ; i++){
            // waterlevel = min (leftmax bondary , rightmax bound)
            int waterLevel = Math.min(leftmax[i], rightmax[i]);
            // trapped water = waterlevel - height[i] 
            trappedwater = trappedwater + (waterLevel-height[i]);
            }
            return trappedwater;
        }
    public static void main (String arg[]){
        
    Scanner sc = new Scanner(System.in);
    int height[] = {4, 2, 0, 6, 3, 2, 5};
    System.out.println("Total trapped water is : "+ trappedwater(height));
    sc.close();
    }
}
// ek auxillary array banta hai jisme ek left max boundary or right max boundary 
// TC of this code is O(n) which is liner time to complete and this is more efficient 
