// The Queue interface is present in java.util package and extends the Collection interface is used to hold the elements about to be processed in FIFO(First In First Out) order. It is an ordered list of objects with its use limited to inserting elements at the end of the list and deleting elements from the start of the list

// The ArrayDeque in Java provides a way to apply resizable-array in addition to the implementation of the Deque interface. It is also known as Array Double Ended Queue or Array Deck. This is a special kind of array that grows and allows users to add or remove an element from both sides of the queue.

/*
Few important features of ArrayDeque are as follows:  

1. Array deques have no capacity restrictions and they grow as necessary to support usage.
2. They are not thread-safe which means that in the absence of external synchronization, ArrayDeque does not support concurrent access by multiple threads.
3. Null elements are prohibited in the ArrayDeque.
4. ArrayDeque class is likely to be faster than Stack when used as a stack.
5. ArrayDeque class is likely to be faster than LinkedList when used as a queue.
*/

import java.util.ArrayDeque;

public class App_ArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> q1 = new ArrayDeque<>();
        q1.add(1);  // This method don't accept index of element as argument
        q1.add(2);
        q1.addFirst(3);
        q1.addLast(0);

        /*for (int element : q1) {
            System.out.println(element);
        }*/

        System.out.println(q1.getFirst());
        System.out.println(q1.getLast());
        // System.out.println(q1.get(1));  // Array Deque do not index its elements, thus they can't be accessed this way
    }
}
