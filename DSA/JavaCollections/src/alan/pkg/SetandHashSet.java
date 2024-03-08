package alan.pkg;

import java.util.HashSet;
import java.util.Set;

public class SetandHashSet {
    public static void main(String[] args) {
        //hashset cannot contain duplicate values
        Set<String> new_set = new HashSet<>();
        new_set.add("hi");
        new_set.add("hi");
        System.out.println(new_set);
        //just overides and place a new one


        //it allows null value
        new_set.add(null);
        System.out.println(new_set);

        //hashset does not maintain order
        new_set.add("baldsin");
        new_set.add("lalalla");
        new_set.add("blahblah");
        System.out.println(new_set);

        //hashset uses hashmap internally to store its elements

        //hashset from another hashset using constructor

        Set<String> str = new HashSet<>(new_set);
        str.add("This is another hashset");
        System.out.println(str);
        //remove

        // remove() - index
        // removeAll()
        // clear()
        Set<Integer> numbers = new HashSet<>();
    }
}
