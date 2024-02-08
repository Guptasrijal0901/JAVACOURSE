import java.util.Scanner;

public class stock_array {
    public static int profit_loss(int price[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxprofit = 0;
        int n = price.length;
        for (int i = 0 ; i < n ; i++){
            if (buyPrice < price[i]) { // profit mill raha 
                int profit = price[i] - buyPrice; // today's profit 
                maxprofit = Math.max(maxprofit, profit);
                System.out.println(maxprofit + " This is maximum profit till now," + " on price "+ price[i]);
            }else{
                buyPrice = price[i]; 
                System.out.println("There is loss in " + price[i]);
// agar aaj profit nhi ho raha toh esko aaj buy kar lete hai mtlb ki aaj ka price kaam hai 
            }
        }
        return maxprofit;
    }
    public static void main (String arg[]){
    Scanner sc = new Scanner(System.in);
    int price[] = {7, 1, 5, 3, 6, 4};
    System.out.println("Our maximum profit is: "+profit_loss(price));
    sc.close();
    }
}
// TC of this loop is O(n)