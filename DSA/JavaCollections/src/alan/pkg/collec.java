package alan.pkg;

import java.util.ArrayList;
import java.util.Collection;

public class collec {
    public static void main(String[] args) {
        int [] a = new int[1000];
        // limitations of array
        //1. Arrays are fixed in size
        //2. Only homogenous data elements
        //3. Does not provide any methods or APIs
        Object [] obj = new Object[20];
        Collection<String> collection = new ArrayList<>();
        //add
        collection.add("banana");
        collection.add("apple");
        collection.add("Orange");
        System.out.println(collection);
        //remove
        collection.remove("banana");
        System.out.println(collection);

        //contains
        System.out.println(collection.contains("apple"));
        //for each
        collection.forEach(System.out::println);
        //or
        collection.forEach((element)->{
            System.out.println(element);
        });

    }
}

// collection - root interface extends iterable
// list, queue, set - sub-interfaces which extends the collection interface
// ............IMPLEMENTATIONS..............
// List implementations     Set implementations             Queue implementations
// Array List                 HashSet                         Priority Queue
// Linked-List                LinkedHashSet                   Deque (extends Queue)
// Vector                     SortedSet                       ArrayDeque (Implements Deque)
// Stack (extends vector)     TreeSet (implements Sortedset)


// Map
// HashMap (implements map)
// LinkedHashMap (implements map)
// HashTable (implements map)
// Sorted map (extends Map)
// TreeMap (implements Sorted Map)
