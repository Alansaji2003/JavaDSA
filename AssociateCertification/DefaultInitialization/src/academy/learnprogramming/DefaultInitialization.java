package academy.learnprogramming;




public class DefaultInitialization {

    //variables outside main method should be static in order to be used inside main method
    static boolean mybool;
    static int myint;
    static float myfloat;
    static byte mybyte;
    static long mylong;
    static double mydouble;
    static char mychar;
    static short myshort;


    public static void main(String[] args) {
        //variables declared inside a method is called local variables
        int localInt;
        //System.out.println("localInt= "+localInt); wont compile coz not initialized

        // by default all numeric primitives are initialized to zero
        //float and double are initialized to 0.0

        System.out.println(mybool);
        System.out.println(myshort);
        System.out.println(mybyte);
        System.out.println(myfloat);
        System.out.println(mydouble);
        System.out.println(myint);
        System.out.println(mylong);
        System.out.println(mychar);

    }
}





