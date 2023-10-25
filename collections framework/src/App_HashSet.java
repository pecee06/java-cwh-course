// The set is an interface available in the java.util package. The set interface extends the Collection interface. An unordered collection or list in which duplicates are not allowed is referred to as a collection interface. The set interface is used to create the mathematical set.

// In hashing there is a hash function that maps keys to some values. But these hashing function may lead to collision that is two or more keys are mapped to same value. Chain hashing avoids collision. The idea is to make each cell of hash table point to a linked list of records that have same hash function value.
// Example of a hash function : f(x) = x%(number of cells)

// Java HashSet class is used to create a collection that uses a hash table for storage.

/*
The important points about Java HashSet class are:

1. HashSet stores the elements by using a mechanism called hashing.

2. HashSet contains unique elements only.

3. HashSet allows null value.

4. HashSet class is non synchronized.

5. HashSet doesn't maintain the insertion order. Here, elements are inserted on the basis of their hashcode.

6. HashSet is the best approach for search operations.

7. The initial default capacity of HashSet is 16, and the load factor is 0.75 (which implies, when 75% of the table is filled, its capacity should be increased).
// The Load factor is a measure that decides when to increase the HashTable capacity to maintain the search and insert operation complexity of O(1) (constant).
*/

import java.util.HashSet;

public class App_HashSet{
    public static void main(String[] args) {
        HashSet<Integer> s1 = new HashSet<>(10,0.5f);   // Initial capacity and load factor are optional parameters

        // Adding elements to HashSet
        s1.add(13);
        s1.add(116);
        s1.add(-87);
        s1.add(13); // Adding duplicate element (which won't be added though)
        s1.add(47);

        System.out.println(s1);

        int num = 116;
        boolean val = s1.contains(num);
        if (val){
            System.out.println(num+" is present");
        }
        else{
            System.out.println(num+" is not present");
        }

        s1.remove(47);
        
        for (int element : s1) {
            System.out.println(element);
        }
    }
}