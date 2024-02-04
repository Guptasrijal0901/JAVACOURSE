import java.util.Scanner;

public class pairs_array {
    public static void pairUp(int n []){
        int m = n.length;
        for(int i = 0 ; i < n.length ; i++){
           for(int j = i+1 ; j < n.length; j++ ){ 
// i ki jo bhi value h j ki usse ek zayada hona chahiye 
// taaki vo sirf apne aage wale se hi pair kare
            System.out.print("("+ n[i] + " , " + n[j]+ ")");
           }System.out.println();
        }
        int total_pairs = (m*(m-1))/2;
        System.out.println("Total number of pairs we get is :"+total_pairs);
    }
    public static void main (String arg[]){
    Scanner sc = new Scanner(System.in);
    int n []= {2, 4 , 6, 8, 10};
    pairUp(n);
    sc.close();
    }
}
