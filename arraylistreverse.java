import java.util.*;

public class arraylistreverse {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // add elements
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(9);
        System.out.println("Forward order: " + list);
        System.out.print("Reverse order: ");
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
    }

}
// TC: O(n)