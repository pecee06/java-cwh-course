// Java LinkedList class uses a doubly linked list to store the elements. It provides a linked-list data structure.

/*
The important points about Java LinkedList are:

1. It can contain duplicate elements.
2. It maintains insertion order.
3. It is non synchronized.
4. In It, manipulation is fast because no shifting needs to occur.
5. It can be used as a list, stack or queue.
*/

// Both ArrayList and LinkedList have almost all methods in common, however their internal working is quite different

import java.util.LinkedList;
import java.util.List;

public class App_LinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        l1.add(7);
        l1.add(3);
        l1.add(3);
        l1.add(7);
        l1.add(6);
        l1.add(1);
        l1.add(1);
        l1.add(1);
        l1.add(6);
        l1.add(9);

        /*for (int element : l1) {
            System.out.print(element+" ");
        }
        System.out.println();*/

        l1.add(3,101);
        l1.add(8,102);
        l1.add(1,110);

        /*for (int element : l1) {
            System.out.print(element+" ");
        }*/

        l1.addFirst(20);    // LinkedList specific method
        l1.add(0,21);

        int last_index = l1.size();
        l1.addLast(40); // LinkedList specific method
        l1.add(last_index,41);

        
        /*for (int element : l1) {
            System.out.print(element+" ");
        }
        System.out.println();
        
        l1.removeFirst();
        l1.removeLast();

        for (int element : l1) {
            System.out.print(element+" ");
        }*/

        // Extracting subset of LinkedList
        List<Integer> l2 = new LinkedList<>();
        // LinkedList object is created with List reference as List object can't be instantiated
        l2 = l1.subList(3, 7);
                        // fromIndex,toIndex
        
        for (int element : l2) {
            System.out.print(element+" ");
        }
    }
}
