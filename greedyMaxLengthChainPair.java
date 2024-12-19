import java.util.Arrays;
import java.util.Comparator;

public class greedyMaxLengthChainPair {
    public static void main(String[] args) { // TC: O(nlogn)
        int pairs[][] = { { 5, 24 }, { 39, 60 }, { 5, 28 }, { 27, 40 }, { 50, 90 } };

        // Sort pairs by the second element (end of intervals)
        Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));

        int chainLength = 1; // Initial chain includes the first pair
        int chainEnd = pairs[0][1]; // End of the first selected pair
        for (int i = 1; i < pairs.length; i++) {
            // If the start of the current pair is greater than the last selected pair's end

            if (pairs[i][0] > chainEnd) {
                chainLength++; // Extend the chain
                chainEnd = pairs[i][1]; // Update the end to the current pair's end
            }
        }
        System.out.println("Max length of chioce = " + chainLength);
    }
}
// You are given n pairs of number. In every pair.
// The first number is always smaller than the second number.
// A pair (c,d) can come afetr pair (a, b) if b,c.
// Find the longest chain which can be formed from a given set of pairs.
// APPROACH
// SORT PAIRS(BASED ON 2ND NUMBER)
//