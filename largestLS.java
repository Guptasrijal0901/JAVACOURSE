import java.util.Scanner;

public class largestLS {

    public static void large_value(int num[] ){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for (int i = 0 ; i < num.length ; i++ )
        if (largest < num[i]) {
        largest = num[i];
        if (smallest > num[i]){
            smallest = num[i];
        }}
        System.out.println("Largest = "+largest);
        System.out.println("Smallest = " + smallest );
    }
    public static void main (String arg[]){
    Scanner sc = new Scanner(System.in);
    int num[] = {1, 3, 8, 9, 6, 8, 5, 9} ;
    large_value(num);
    sc.close();
    }
}
// -infinity Integer.MIN_VALUE
// +infinity Integer.MAX_VALUE

