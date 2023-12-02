//what is null , how it  works
//default object initialization
//dealing with null pointer exceptions


//in java everything is object , it is an object-oriented programming language
//variables : containers (reference to an object)
//null value indicates you have unset reference or empty reference

package alan.saji;

public class UnderstandingNull {

    //object is class
    static Object myObject = new Object();
    static Object myOtherObj;  //by default if we dont initialize object it will be null
    static int myInt = 0;

    static String x;

    public static void main(String[] args) {
        //local
        Object myLocalObj = new Object();
        Object myOtherObject = new Object();
        String name = "java";
        String another = null;

        System.out.println("myObject= "+myObject);
        System.out.println("myOtherObj= "+myOtherObj);
        System.out.println("myLocalObe= "+myLocalObj);
        System.out.println("myOtherObject= "+myOtherObject);
        System.out.println(name);
        System.out.println(another);

        //see output
        //the numbers after the @ are the address of our variable in the memory
        //nullPointer exception

        //this code gives null pointer exception because we are calling a method (toUpperCase) on a null string
        /*
        x.toUpperCase();
        System.out.println(x);
        */



    }
}
