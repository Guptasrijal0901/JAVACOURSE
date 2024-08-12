import java.util.ArrayList;

public class arraylistpairsum {
    // Brute force
    public static boolean pairSum(ArrayList<Integer> list, int target) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) + list.get(j) == target) {
                    System.out.println("Pair found: (" + list.get(i) + ", " + list.get(j) + ")");
                    return true;

                }
            }
        }
        return false;
    }

    // optimized approach to get less TC by using
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println(list);
        System.out.println(pairSum(list, 5));
    }
}
