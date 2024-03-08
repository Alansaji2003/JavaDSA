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
        // List allows you to add null values
        list.add(null);
        list.add(null);
        System.out.println(list);

        // insertion order
        // list is ordered , same way we inserted
        // access elements from the list
        System.out.println(list.get(0));



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