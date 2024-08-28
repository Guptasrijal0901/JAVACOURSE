import java.util.*;
// JCF have optimized code to use 

public class javaCollectionFramework {
    public static void main(String[] args) {
        // create - object, int float, boolean -> Integer, Float, Character
        // we use classes not primitive datatype
        LinkedList<Integer> ll = new LinkedList<>();
        // add
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(0);
        System.out.println(ll);
        // remove
        ll.removeLast();
        ll.removeFirst();
        System.out.println(ll);
    }
}
