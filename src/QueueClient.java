public class QueueClient {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue(4);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(9);
        queue.enqueue(500);
    }
}
