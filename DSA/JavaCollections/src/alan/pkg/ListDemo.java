package alan.pkg;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        // List allows us to add duplicate elements
        list.add("alan");
        list.add("alan");
        System.out.println(list);


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