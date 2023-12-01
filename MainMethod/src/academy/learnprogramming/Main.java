package academy.learnprogramming;

public class Main {

//below is javadoc comment
    /**
     *
     * @param args cammand line argummnets
     */
    public static void main(String[] args) {
        System.out.println("args size is "+args.length);
        sum(2,5);  // hover to see documentation
        /*
          *printing arguments
          * another line
         */
        for (int i = 0; i <= args.length; i++) {
            System.out.println( "hello");

        }
    }

    /**
     * calculates sum
     * @param a
     * @param b
     * @return
     */
    public static int sum(int a, int b) {
        return a + b;
    }
}
