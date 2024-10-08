import java.util.*;

public class queueInterleave {
    public static void InterLeave(Queue<Integer> q) {
        Queue<Integer> firstHalf = new LinkedList<>();
        int size = q.size();

        for (int i = 0; i < size / 2; i++) {
            firstHalf.add(q.remove());
        }
        while (!firstHalf.isEmpty()) {
            q.add(firstHalf.remove());
            q.add(q.remove());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);
        q.add(11);
        q.add(12);
        InterLeave(q);
        // print q
        while (!q.isEmpty()) {
            System.out.print(q.remove() + " ");
        }
    }
}
// TC: O(n)
// SC: O(n) extra queue is used in this