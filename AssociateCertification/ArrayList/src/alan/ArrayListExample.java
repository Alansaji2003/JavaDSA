package alan;

import java.util.List;
import java.util.ArrayList;
//Array List is part of Java Collections API
public class ArrayListExample {
    public static void main(String[] args) {
        java.util.ArrayList myList = new java.util.ArrayList();
        java.util.ArrayList<Object> myList2 = new java.util.ArrayList<Object>();

        java.util.ArrayList<String> list = new java.util.ArrayList<>();
        java.util.ArrayList<String> list2 = new java.util.ArrayList<>(); // diamond operator
        List<String> list3 = new java.util.ArrayList<>(); // using interface as type

//        ArrayList<String> list4 = new List<>(); // does not compile

        List<String> list5 = new java.util.ArrayList<>(20);
    }
}
