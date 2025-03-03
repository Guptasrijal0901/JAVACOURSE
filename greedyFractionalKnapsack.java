import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class greedyFractionalKnapsack {
    public static void main(String[] args) {
        int val[] = { 60, 100, 120 };
        int weight[] = { 10, 20, 30 };
        int w = 50;

        double ratio[][] = new double[val.length][2];
        // 0th col => idx; 1st col => ratio

        for (int i = 0; i < val.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = val[i] / (double) weight[i];
        }
        // assending oredr sorting
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));
        // we need in desending order

        int capacity = w;
        int finalVal = 0;
        for (int i = ratio.length - 1; i >= 0; i--) {
            int idx = (int) ratio[i][0];
            if (capacity >= weight[idx]) {
                finalVal += val[idx];
                capacity -= weight[idx];
            } else {
                // include fractional item
                finalVal += (ratio[i][1] * capacity);
                capacity = 0;
                break;
            }
        }
        System.out.println("Final value: " + finalVal);
    }

}
// given the weight and values of N items, put these in a knapsack of capacity W
// to get the maximum total value in the knapsack
// value = [60, 100, 120]
// weight = [10, 20, 30]
// W = 240
// Approach: weight kam hona chaiye or value zayada -> ratio: value/weight
