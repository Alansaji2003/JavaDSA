package alan;

public class recursion {


    static void printNum(int n){
        //base case
        if(n==0){
            return;
        }
        //print statement
        System.out.print(n+" ");
        printNum(n-1);
    }

    public static void main(String[] args) {
        // print the numbers from 5 to 1 using recursion
        int n = 5;
        printNum(n);


    }
}
