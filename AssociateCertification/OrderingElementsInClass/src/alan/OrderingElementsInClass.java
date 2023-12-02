//in this file
//valid and invalid element order
//dealing with common compile time errors
//check order.jpg

package alan;

import java.util.*;

//package alan  // : this won't compile because it is declared after import - unexpected token

//int alan = x;   //won't compile because it is outside class , same for methods


class myOtherClass{
    //this works
    //only one public class is allowed in one file
}

public class OrderingElementsInClass {
    int a = 5; // class field

    public static void main(String[] args) {
        int b = 7; //local variable
//        there can't be method inside another method
//        void myMethod(){
//
//        }
    }

    void myMethod(){
        //this works
    }
    //PIC (package, import, class)

}
