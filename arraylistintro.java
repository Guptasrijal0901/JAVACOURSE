import java.util.*;

public class arraylistintro {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();

        list1.add(1);
        list1.add(6);
        list1.add(8);
        // tc: O(1)
        System.out.println(list1);
    }
}
