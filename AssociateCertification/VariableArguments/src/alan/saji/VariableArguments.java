package alan.saji;

import java.util.Arrays;


public class VariableArguments {

//    public static void main(String[] args) {
//        System.out.println(args.length);
//        System.out.println(Arrays.toString(args));
//    }

    public static void main(String... args) {
        System.out.println(args.length);

        print(args);
        print("Java");
        print("this", "is", "my", "string", "array");
        print("variable", "arguments", "are", "nice", "and", "useful", "feature"); // you can add as many elements you want
        //no need to create a new array when working with variable arguments
    }

    private static void print(String... myArguments) {
        System.out.println(Arrays.toString(myArguments));
    }
}