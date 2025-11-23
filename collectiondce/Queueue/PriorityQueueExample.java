package collectiondce.Queueue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(1);
        queue.add(10);
        queue.add(120);
        queue.add(130);
        System.out.println("peek ="+queue.peek());
        System.out.println(queue);

        System.out.println("poll ="+queue.poll());
        System.out.println(queue);

    }
}
