package alan;

public class NToOneUsingBacktracking {

    public static void print(int i, int n){
        if(i > n){
            return;
        }

        print(i+1,n);
        System.out.println(i);
    }

    public static void main(String[] args) {
        int n = 8;
        int i ;
        print(i = 1, n);
    }
}
