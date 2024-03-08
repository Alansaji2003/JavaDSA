package alan;

public class printNnumbers {
    static int c = 0;
    public static void printN(){
        if(c == 5){
            return;
        }
        System.out.println(c);
        c++;
        printN();
    }


    public static void main(String[] args) {
        printN();
    }
}
