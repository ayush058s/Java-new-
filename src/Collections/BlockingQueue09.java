package Collections;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueue09 {
    public static void main(String[] args) {
        // Thread safe queue
        // wait for queue to become non-empty / wait for space
        // simplify concurrency problems like producer consumer

        // standard queue => immediately runs
             // if empty --> remove(no waiting)
             // if full --> add(no waiting)

        //Blocking Queue
             // put --> blocks if the queue is full until space becomes available
             // take --> blocks if the queue is empty until an element becomes available
             // offer --> Waits for space to becomes available, up to the specified timeout

        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(5);
        // A bounded, blocking queue backed by an array
    }
}
