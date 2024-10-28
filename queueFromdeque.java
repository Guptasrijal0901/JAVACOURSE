import java.util.Deque;
import java.util.LinkedList;

public class queueFromdeque {
    static class stack {
        Deque<Integer> deque = new LinkedList<>();

        public void push(int data) {
            dequeue.addLast(data);
        }

        public int pop() {
            return deque.removeLast();
        }

        public int peek() {
            return deque.getLast();
        }
    }

    public static void main(String[] args) {

    }
}
