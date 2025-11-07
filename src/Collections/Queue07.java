package Collections;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Queue07 {
    public static void main(String[] args) {
        // an interface, based on FIFO
        // implementation classes => LinkedList and priority queue


        // LinkedList can also act as queue
        LinkedList<Integer> list = new LinkedList<>();

        list.addLast(23); // enqueue
        list.addLast(44);
        list.addLast(20);
        System.out.println(list);

        list.removeFirst(); // dequeue
        System.out.println(list);

        System.out.println(list.getFirst()); // peek 44


        //Queue
        Queue<Integer> queue1 = new LinkedList<>();

        queue1.add(5);
        queue1.add(7);
        queue1.add(10);

        System.out.println(queue1.size());

        System.out.println(queue1.remove());// 5 // throws an exception if empty
        System.out.println(queue1.poll());

        System.out.println(queue1.element()); // throws exception if empty
        System.out.println(queue1.peek());


        Queue<Integer> queue2 = new ArrayBlockingQueue<>(2); // A bounded, blocking queue backed by an array

        queue2.add(33); // throws an exception
        queue2.offer(55);
        queue2.add(7);
        System.out.println(queue2);
    }
}
