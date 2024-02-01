package alan;

public class recur2 {
    //print from 1 to 5
    static void print(int n){
        if(n == 6){
            return;
        }
        System.out.print(n+" ");
        print(n+1);
    }
    public static void main(String[] args) {
        int n = 1;
        print(n);
    }
}
