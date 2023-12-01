package academy.learnprogramming;

import static java.lang.Math.*;   //static import
import static academy.learnprogramming.Config.*;
public class StaticImportExample {
    // in static import we dont have to mention the class name
    public static void main(String[] args) {
        int min = java.lang.Math.min(6,10);
        System.out.println(min);

        int max = max(5,10);
        System.out.println(max);

        System.out.println(PI);
        // we can also use that sopln  : import static java.lang.System.out


        //normally without static import we import static method like this
        Config.printConfig();

        // with static import we dont need config
        printConfig();

    }
}
