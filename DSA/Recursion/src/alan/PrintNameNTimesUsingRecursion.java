package alan;

import java.util.Scanner;

public class PrintNameNTimesUsingRecursion {


    public static void printName(int n, int c){
        if(c > n ){
            return;
        }
        System.out.println(c+". Alan Saji");

        printName(n,c+1);
    }

    public static void main(String[] args) {

        int c = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of times to print name");
        int n = sc.nextInt();
        printName(n,c);

    }
}
