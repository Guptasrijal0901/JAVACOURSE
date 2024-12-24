import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class greedyIndianCoins {
    public static void main(String[] args) {
        Integer coins[] = { 1, 2, 5, 10, 20, 50, 100, 500, 2000 };
        Arrays.sort(coins, Comparator.reverseOrder());
        int countOfCoins = 0;
        int ammout = 590;
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < coins.length; i++) {
            if (coins[i] <= ammout) {
                while (coins[i] <= ammout) {
                    countOfCoins++;
                    ans.add(coins[i]);
                    ammout = ammout - coins[i];
                }
            }
        }
        System.out.println("Total(min) coins used = " + countOfCoins);

        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
        System.out.println();
    }

}
// we are given an infinite supply of denominations[1, 2, 5, 20, 50, 100, 500,
// 2000]
// find minimum no. of coins to make change for a value V.
// this is only for this coins system
// APPROACH
// MAXIMUM POSSIBLE COIN DENGE
// SORT IN DESCENDING