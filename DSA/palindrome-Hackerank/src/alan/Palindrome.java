package alan;
import java.io.*;
import java.util.*;
public class Palindrome {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int length = A.replaceAll("[^a-zA-Z0-9]", "").toLowerCase().length();
        for (int i = 0; i < length/2; i++) {
            if (A.charAt(i) != A.charAt(length - 1 - i)){
                System.out.println("No");
                System.exit(0);
            }

        }
        System.out.println("Yes");


    }
}
