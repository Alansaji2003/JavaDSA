package alan;
//using backtracking to print from 1 to N

import java.util.Scanner;

public class OneToNUsingBacktracking {

    public static void print(int i , int n){    // i starting from N to 1
       if(i < 1){
           return;
       }

       print(i-1,n);
        System.out.println(i);      //print statement after function call
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n,n);
    }
}
