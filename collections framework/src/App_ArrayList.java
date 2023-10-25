// The ArrayList class is a resizable array, which can be found in the java.util package.
// The difference between a built-in array and an ArrayList in Java, is that the size of an array cannot be modified (if you want to add or remove elements to/from an array, you have to create a new one). While elements can be added and removed from an ArrayList whenever you want.

import java.util.ArrayList;

public class App_ArrayList {
    public static void main(String[] args) {
        // Creating an ArrayList of integers
        ArrayList<Integer> arr1 = new ArrayList<>(5);   // Here, 5 is the initial capacity (optional) which is dynamic and can change accordingly

        // ArrayList is not a usual array of Java, thus elements can't be added or extracted by indexing. We have proper methods for it

        // arr1[0] = 10;    // Wrong syntax
        arr1.add(0,10);
        arr1.add(7);
        arr1.add(19);
        arr1.add(2,46);
        arr1.add(10);
        arr1.add(0);    // Added the 6th element, despite having the initial capacity of 5

        // If index is specified explicitely, then element is added at that index. Else, it follws top to bottom order of filling

        // Printing an ArrayList
        // one way
        // System.out.println(arr1);

        // other way
        /*for (int element : arr1) {
            System.out.println(element);
        }*/

        // another way
        /*for (int i=0; i<arr1.size(); i++){
            // System.out.println(arr1[i]); // Wrong syntax
            System.out.println(arr1.get(i));
        }*/

        // Adding an ArrayList to another
        ArrayList<Integer> arr2 = new ArrayList<>();
        for (int i=1; i<=5; i++){
            arr2.add((17*i)+19);
        }

        arr1.addAll(arr2);  // If index is absent, then elements from the other ArrayList are appended. If explicitely mentioned, elements are added from that index

        /*for (int element : arr1) {
            System.out.println(element);
        }*/

        // Removing every element from an ArrayList
        /*System.out.println(arr1.size());
        arr1.clear();
        System.out.println(arr1.size());*/

        // Removing an element from an ArrayList
        /*arr2.remove(1); // Removes 1-indexed element

        for (int element : arr2) {
            System.out.println(element);
        }*/

        // Checking the presence of an element in an ArrayList
        ArrayList<String> friends = new ArrayList<>();
        friends.add("Harshit");
        friends.add("Ansh");
        friends.add("Yoganshu");
        friends.add("Piyush");
        friends.add("Pradeep");
        friends.add("Ayush");
        friends.add("Abhay");
        friends.add("Sanchali");
        friends.add("Shreya");
        friends.add("Shrinidhi");

        friends.remove("Abhay");    // Removes specified element from the ArrayList

        /*for (String element : friends) {
            System.out.println(element);
        }*/

        /*String name = "Ansh";
        boolean isFriend = friends.contains(name);  // This method is case sensitive

        if (isFriend){
            System.out.println(name+" is your friend");
        }
        else{
            System.out.println(name+" is not your friend");
        }*/

        // Getting index of an element
        /*System.out.println(arr1.indexOf(19));
        System.out.println(arr1.indexOf(-40));  // If an element is not present in the ArrayList then this method returns -1
        System.out.println(arr1.indexOf(10));   // If the ArrayList contains duplicate elements, then this method returns the index of first encounter of the specified element from 0th index
        System.out.println(arr1.lastIndexOf(10));   // Works exactly like indexOf(), difference being, it looks for the specified element from last index*/

        // Updating an ArrayList
        ArrayList<Integer> arr3 = new ArrayList<>();
        for (int i=0; i<10; i++){
            arr3.add(i+1);
        }

        /*for (int element : arr3) {
            System.out.print(element+", ");
        }
        arr3.set(4, 264);
        System.out.println();
        for (int element : arr3) {
            System.out.print(element+", ");
        }
        System.out.println();*/

        // Checking whether an ArrayList is empty
        /*System.out.println(arr3.isEmpty());
        arr3.clear();
        System.out.println(arr3.isEmpty());*/

        // Equality of ArrayLists
        ArrayList<Float> arr4 = new ArrayList<>();
        ArrayList<Integer> arr5 = new ArrayList<>();
        ArrayList<Integer> arr6 = new ArrayList<>();
        ArrayList<Float> arr7 = new ArrayList<>();
        
        arr4.add(2f);
        arr4.add(4f);

        arr5.add(2);
        arr5.add(4);

        arr6.add(4);
        arr6.add(2);

        arr7.add(2f);
        arr7.add(4f);

        /*System.out.println(arr4.equals(arr5));  // Returns false
        System.out.println(arr6.equals(arr5));  // Returns false
        System.out.println(arr7.equals(arr4));  // Returns true*/

        // Converting ArrayList to array
        Object[] friendsArr = friends.toArray();
        System.out.println(friendsArr[7]);
    }
}
