package alan;

import java.util.Scanner;

public class FullASCII {
    static int [] hash = new int[256]; //just change to 256 will allow special characters and uppercase letters
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();
        System.out.println("Enter no of characters to search");

        int n = sc.nextInt();
        sc.nextLine(); // Consume the newline character left by nextInt()
        //precomputing
        for (int i = 0; i < str.length(); i++) {
            hash[str.charAt(i)] += 1;
        }


        while(n > 0){
            System.out.println("Enter the characters");
            String c = sc.nextLine();
            char ch = c.charAt(0);
            System.out.println(ch+" is present: "+hash[ch]+" times in the string");
            n--;
        }

    }
}
