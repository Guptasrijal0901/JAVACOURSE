import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class arraylistsort {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(5);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(0);
        System.out.println("Before sorting: " + list);
        Collections.sort(list); // ascending order sort hota hai
        System.out.println("Ascending order: " + list);
        // desending order

        Collections.sort(list, Collections.reverseOrder());
        // comparators - fnx logic kiss trag se sorting honi chahiye
        System.out.println("Desending order: " + list);
    }
}
