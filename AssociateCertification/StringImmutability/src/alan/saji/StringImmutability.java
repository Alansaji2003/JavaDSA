package alan.saji;

public class StringImmutability {
    public static void main(String[] args) {
        //Or in other words you can't make things smaller or larger.
        //
        //You can't change characters inside the string.
        //
        //You can only create another string, mutable is another word for changeable.
        //
        //So immutable is just the opposite of it.
        String hello = "hello";
        String hi = hello + "world"; // hi="helloworld"

        hi = hello; // hi="hello"

        System.out.println(hi + hello); // hellohello

        hello = hello.toUpperCase(); //immutable!

        System.out.println(hello);

        // concat
        String s1 = "1";
        String s2 = s1.concat("2"); // 12
        s2.concat("3"); //no change with this statement coz immutable

        System.out.println(s1); //1
        System.out.println(s2); //12
    }
}
