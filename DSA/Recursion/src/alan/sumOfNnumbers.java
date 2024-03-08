package alan;

public class sumOfNnumbers {

    //two ways: parameterized and functional
    // parameterized
    public static void findSum(int i, int sum){
        if(i < 1){
            System.out.println("Using parameterized recursion :"+sum);
            return;
        }

        findSum(i-1,sum+i);
    }

    //fucntional
    public static int findSum(int n){
        if(n == 0){
            return 0;
        }
        return n + findSum(n-1);

    }
    public static void main(String[] args) {

        int n = 3;

        findSum(n, 0);
        System.out.println("From functional recursion :"+findSum(n));
    }
}
