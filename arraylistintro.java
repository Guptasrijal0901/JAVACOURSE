import java.util.*;

public class arraylistintro {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();
        // add operation
        list1.add(1);
        list1.add(6);
        list1.add(8);
        list1.add(15);
        list1.add(17);
        list1.add(13);
        list1.add(1, 5); // add element at index i TC: O(n) for this
        // tc: O(1)
        System.out.println("add " + list1);
        // get operation
        int element = list1.get(3);
        System.out.println("get " + element);
        // TC: O(1)
        // remove element
        list1.remove(3);
        System.out.println("after delete " + list1);
        // TC: O(n)

        // set element at index
        list1.set(2, 10);
        System.out.println("set new value " + list1);
        // TC: O(n)

        // contains element
        System.out.println("contains " + list1.contains(9));
        System.out.println("contains " + list1.contains(17));
        // TC: O(n)

        // size of AL
        System.out.println("size of " + list1.size());

        // print AL
        for (int i = 0; i < list1.size(); i++) {
            System.out.print(list1.get(i) + " ");
        }
        System.out.println();
    }
}
