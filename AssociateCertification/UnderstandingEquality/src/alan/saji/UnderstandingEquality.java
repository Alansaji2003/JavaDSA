package alan.saji;

public class UnderstandingEquality {
    public static void main(String[] args) {
        StringBuilder one = new StringBuilder();
        StringBuilder two = new StringBuilder();
        StringBuilder three = one.append("Java");

        System.out.println(one == two); // false
        System.out.println(one == three); // true

        String x = "Java";
        String y = "Java";

        System.out.println(x == y);

        String a = "Java";
        String b = " Java".trim();

        System.out.println(a == b); // false

        String c = "Java";
        String d = " Ja".trim() + "va";

        System.out.println(c == d); // false

//        System.out.println(three == y); does not compile
    //    System.out.println(c.charAt(4));   //out of bounds exception at run time!! if its the last statement ,
        //    the code above will work
//        System.out.println(c.substring(0)); //word is java, this meth works for 0 1 2 3 4 and nothing else
        System.out.println(c.substring(2,0));


    }
}
