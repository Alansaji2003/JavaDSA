//what are wrapper Types?
//boxing unboxing and autoboxing

package alan.saji;

public class PrimitiveWrapperClass {
    public static void main(String[] args) {
        //primitive int
        int intiger = 5;
        //wrapper class start with capital letter
        //Integer class just wraps the primitive int
        //each wrapper class has some useful static methods

        //when you are boxing you're putting int inside the wrapper
        Integer myIntiger = new Integer(10);  //this is unnecessary boxing, we can remove boxing like below line
        Integer myIntiger2 = 20;
        Integer myIntiger3 = Integer.valueOf(10);
        Integer myIntiger4 = Integer.parseInt("3");
        Integer myNewInt  = null;
        //int a = null; won't compile

        System.out.println("myIntiger= "+myIntiger);
        System.out.println("myIntiger2= "+myIntiger2);
        System.out.println("myIntiger3= "+myIntiger3);
        System.out.println("myIntiger4= "+myIntiger4);
        System.out.println("myNewInt= "+myNewInt);

        //when you convert int to Integer, it is called boxing
        //when you convert Integer to int, it is called unboxing
        int myint3 = myIntiger3; //converting wrapper to primitive -> unboxing
        //boxing
        Integer myInteger6 = new Integer(10);

        //autoboxing -> automatic conversion by compiler
        Integer myIntiger7 = 20;

        //we cant convert a null wrapper to integer
        //int x = myNewInt; //null pointer exception

        printSum(1, 5); // autoboxing

        printSum(myIntiger, myIntiger2);

    }
    private static void printSum (Integer first, Integer second) {
        Integer sum = first + second;
        System.out.println("sum= " + sum);


    }
}
