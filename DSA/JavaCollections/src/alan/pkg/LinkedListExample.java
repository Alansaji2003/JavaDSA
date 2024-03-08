package alan.pkg;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        //the linked list internally uses a doubly linked list
        //[previous pointer - data - next pointer]
        // it implements deque therefore it can be used as queue deque or stack
        // insertion addition removal is faster in linked list
        // consumes more memory than array list

        //methods
        //add()
        //add(2, element)
        //addFirst()    // from deque
        //addLast()      // from deque

        LinkedList<String> list = new LinkedList<>();

        list.add("apple");
        list.add("mango");

        list.add(2, "watermelon");
        System.out.println(list);

        //add at beginning
        list.addFirst("strawberry");
        System.out.println(list);

        //add at end
        list.addLast("LastFruit");
        System.out.println(list);

        //how to get elements
        System.out.println(list.getFirst());    //getFirst()
        System.out.println(list.getLast());     // get last
        //at specific position
        System.out.println(list.get(1));

        //iterate
        for (String s:list) {
            System.out.println(s);
        }

        //remove
        //contains method
        // indexOf() method


    }
}
