package alan;

public class sumOfNnumbers {

    public static void findSum(int i, int sum){
        if(i < 0){
            System.out.println(sum);
            return;
        }

        findSum(i-1,sum+i);
    }

    public static void main(String[] args) {

        int n = 3;
        int i = 1;
        findSum(n, 0);
    }
}
