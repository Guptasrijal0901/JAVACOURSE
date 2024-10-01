import java.util.*;

public class queueJCF {
    public static void main(String[] args) {
        // Queue<Integer> q = new LinkedList<>();
        Queue<Integer> q = new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
// we make queue from linkedlist and ArrayDequeue
// queue is not class it is a interface
// we cannot make object of interface
// esliye queue ko implement karne wale classes ki hm object banate hai
