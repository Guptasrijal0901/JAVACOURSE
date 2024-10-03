import java.util.*;

public class queueQ2 {
    static class Queue {
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public static boolean isEmpty() {
            return s1.isEmpty();
        }

        // add
        public static void add(int data) {
            // 1. s1 k sare elements ko s2 mai push kar dena
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
            // 2. s1 mai data ko push kar dena
            s1.push(data);
            // 3. wapas se s2 se elements ko s1 mai daal dena
            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }

        // remove

        
        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return s1.pop();
        }

        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return s1.peek();
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
// 2 stack se queue
// 2 LIFO se 1 FIFO banana hai
//