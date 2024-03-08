package alan;
//when a function calls itself until a specific condition is met
// the error occurred is called stack overflow error
public class infiniteRecursion {

    public static void print(){
        System.out.println(1);
        print();
    }
    public static void main(String[] args) {
        print();
    }
}
