package Collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class PriorityQueue08 {
    public static void main(String[] args) {
        // part of the queue interface
        // orders elements based on their natural ordering (for primitives lowest first)
        // custom comparator for customized ordering
        // does not allow null elements

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        // internal working
        // Priority queue is implemented as a min heap (for natural ordering)
        // min heap => a binary tree whose value of parent node is smaller or equal to their child
        // that means the upper one is the smallest one
        // inset/ add => 0(log n)
        // peek => 0(1)

        pq.add(15);
        pq.add(20);
        pq.add(10);
        pq.add(5);
        System.out.println(pq); // prints in ascending order

        while (!pq.isEmpty()){
            System.out.println(pq.poll());
        }


        // Dequeue

        // Double-ended queue
        // Allows insertion and deletion o ele from both the ends
        // supports operation of stack and queue both


        /*
INSERTION METHOD
        addFirst()
        addLast()
        offerFirst(): inserts if possible
        offerLast(): inserts if possible

REMOVAL METHOD
        removeFirst()
        removeLast(): exception
        pollFirst(): retrieves and removes 1st ele, or returns null if empty
        pollLast():

EXAMINATION METHOD
        getFirst(): exception
        getLast():
        peekFirst(): returns null if empty
        peekLast():
        */


        //Deque<Integer> deque1 = new LinkedList<>(); // only use for insertion, deletion in middle
        Deque<Integer> deque1 = new ArrayDeque<>(); // faster iteration, low memory, no null allowed
        // no need to shift ele while inserting just shift head and tail
        deque1.addFirst(10);
        deque1.addLast(50);
        deque1.offerFirst(30);
        deque1.offerLast(20);

        System.out.println(deque1); // [30, 10, 50, 20]

        deque1.removeFirst();
        deque1.pollLast();
        System.out.println(deque1); // [10, 50]

        for(int num : deque1){
            System.out.println(num);
        }
    }
}
