import java.util.HashSet;

public class practicee {
    // public static int find(int[] nums) {
    // int result = 0;
    // for (int num : nums) {
    // result ^= num;
    // }
    // return result;
    // }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 4, 5, 9 };
        // int findDup = find(arr);
        // System.out.println("Unique: " + findDup);
        // for (int i = 0; i < arr.length; i++) {
        // for (int j = i + 1; j < arr.length; j++) {
        // if (arr[i] == arr[j]) {
        // System.out.println("Duplicate: " + arr[i]);
        // return;
        // }
        // }
        // }
        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            if (set.contains(num)) {
                System.out.println("Duplicate: " + num);
                break;
            } else {
                set.add(num);
            }
        }

    }

}
