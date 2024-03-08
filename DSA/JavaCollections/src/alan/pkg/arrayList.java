package alan.pkg;

import java.util.*;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        List<String> veg = new ArrayList<>();

       // ArrayList<String> fruits = new ArrayList<>();: Here, you are explicitly stating that
        // fruits is an ArrayList that can hold String objects. This means you can use methods
        // specific to ArrayList on fruits.

//         List<String> veg = new ArrayList<>();: Here, you're using the interface List
//        as the type for veg, while still initializing it with an ArrayList. This is a more
//        flexible approach because you're programming to an interface rather than an implementation.
//        It allows you to easily switch between different implementations of the List interface
//        (e.g., LinkedList, Vector, etc.) without changing much of your code. However,
//                note that since List is an interface, you can only use methods
//        defined in the List interface on veg, not methods specific to ArrayList.


        fruits.add("APPLE");
        fruits.add("ORANGE");
        fruits.add("GRAPE");

        System.out.println(fruits);
        //how to create an ArrayList from another collection using the
        //ArrayList(collection c) constructor


        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);


        List<Integer> new_numbers = new ArrayList<>(numbers);

        //by using add all methods to put another collection datatype

        new_numbers.addAll(numbers);
        System.out.println(new_numbers);
        // 1 2 3 4 1 2 3 4

        // methods of array list
        // isEmpty() to check if array list is empty or not
        // size() returns the size
        // get() returns elements at particular index
        // set() sets elements at particular index eg: set(4, "c#")
        // remove() - to remove at index   (both index and element itself)
        // removeAll() to remove some elements eg: fruits.removeAll(another list which has the same elements)
        // clear() - remove all elements


        //iteration
        List<String> new_list = Arrays.asList("Ex1", "eX2", "eX3");

        for (String s : new_list) {
            System.out.println(s);
        }

        //loop with iterator
        for(Iterator<String> iterator = new_list.iterator(); iterator.hasNext();){
            String str = (String) iterator.next();
            System.out.println(str);
        }

        //sorting
        Collections.sort(new_list);
        System.out.println(new_list);

        //sort in descending order -> reverse() method of collections interface
    }
}
