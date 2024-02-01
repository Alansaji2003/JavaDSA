package alan;

public class recur3 {
    static  int sum = 0;
    public static void print(int n){

        if (n == 0) {
            return;
        }
        sum = sum + n;
        print(n-1);

    }
    public static void anotherMethod(int i , int n , int sum){
        if(i == n){
            sum += i;
            System.out.println(sum);
            return;
        }

        sum+=i;
        anotherMethod(i+1,n,sum );
    }


    public static void main(String[] args) {
        // print sum of first n natural numbers

        int n = 10;
        print(n);
        anotherMethod(0, 10, 0);
        System.out.println(sum);


    }
}
