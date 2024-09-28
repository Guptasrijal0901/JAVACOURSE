public class queueIntro {
    static class Queue {
        static int arr[];
        static int size;
        static int rear;

        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
        }

        public static boolean isEmpty() {
            return rear == -1;
        }

        // add O(1)
        public static void add(int data) {
            if (rear == size - 1) {
                System.out.println("queue is full");
                return;
            }
            rear = rear + 1;
            arr[rear] = data;
        }

        // remove O(n)
        public static int remove() {
            if (isEmpty()) {
                System.out.println("empty queue");
                return -1;
            }
            int front = arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear = rear - 1;
            return front;

        }

        public static int peek() {
            if (isEmpty()) {
                System.out.println("empty queue");
                return -1;
            }
            return arr[0];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
// A Queue in Java is a data structure that follows the First In, First Out
// (FIFO) principle.
// This means that the first element added to the queue will be the first one to
// be removed.

// You can think of a queue like a line of people waiting for something—like in
// a bank or at a movie theater.
// The person who gets in line first is the first one to be served, and the last
// person in line has to wait until everyone before them is served.
// add O(n)- Enque
// remove O(1)- Dequeue
// peek O(1)- Front