package pl.vrajani.datastructures.queue;

import pl.vrajani.framework.Solution;

public class LinkedListQueueTest extends Solution {
    @Override
    protected void execute() {
        LinkedListQueue<Integer> linkedListQueue = new LinkedListQueue<>();
        System.out.println("Is Queue Empty? " + linkedListQueue.isEmpty());

        System.out.println("Queue Enqueue element - 3");
        linkedListQueue.enqueue(3);
        System.out.println("Queue Enqueue element - 4");
        linkedListQueue.enqueue(4);
        System.out.println("Queue Enqueue element - 5");
        linkedListQueue.enqueue(5);
        System.out.println("Is Queue Empty? " + linkedListQueue.isEmpty());

        System.out.println("Search Queue for element - '4', result - "+ linkedListQueue.search(4));
        System.out.println("Search Queue for element - '1', result - "+ linkedListQueue.search(1));

        System.out.println("Queue dequeue element - " + linkedListQueue.dequeue());
        System.out.println("Queue dequeue element - " + linkedListQueue.dequeue());
        System.out.println("Queue dequeue element - " + linkedListQueue.dequeue());

        System.out.println("Is Queue Empty? " + linkedListQueue.isEmpty());

    }
}
