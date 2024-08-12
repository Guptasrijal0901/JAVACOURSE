import java.util.ArrayList;
import java.util.Collections;

public class arraylistpairsum {
    // Brute force
    // public static boolean pairSum(ArrayList<Integer> list, int target) {
    // for (int i = 0; i < list.size(); i++) {
    // for (int j = i + 1; j < list.size(); j++) {
    // if (list.get(i) + list.get(j) == target) {
    // System.out.println("Pair found: (" + list.get(i) + ", " + list.get(j) + ")");
    // return true;

    // }
    // }
    // }
    // return false;
    // }

    // optimized approach to get less TC by using sorted is 2 pointer approach
    // public static boolean pairSum(ArrayList<Integer> list, int target) {
    // Collections.sort(list);

    // int left = 0;
    // int right = list.size() - 1;

    // while (left < right) {
    // int sum = list.get(left) + list.get(right);

    // if (sum == target) {
    // System.out.println("Pair found: (" + list.get(left) + ", " + list.get(right)
    // + ")");
    // return true;
    // } else if (sum < target) {
    // left++; // Increase the left pointer to get a larger sum
    // } else {
    // right--; // Decrease the right pointer to get a smaller sum
    // }
    // }
    // return false;
    // }

    // if any pair in a sorted and rotated arraylist has a target sum

    public static boolean pairSum(ArrayList<Integer> list, int target) {
        // breaking point find karna
        // rotation mai travel karwana hai (modular arithmetic)
        int n = list.size();
        int bp = -1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > list.get(+1)) { // breaking point
                bp = i;
                break;
            }
        }

        int lp = bp + 1;
        int rp = bp;

        while (lp != rp) {
            // case 1
            if (list.get(lp) + list.get(rp) == target) {
                return true;
            }
            if (list.get(lp) + list.get(rp) < target) {
                lp = (lp + 1) % n;
            } else {
                rp = (n + rp + 1) % n;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(5);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        System.out.println(list);
        System.out.println(pairSum(list, 16));
    }
}
