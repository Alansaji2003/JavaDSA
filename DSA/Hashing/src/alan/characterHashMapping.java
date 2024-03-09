package alan;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class characterHashMapping {
    public static void main(String[] args) {

        Map<Character, Integer> hash = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();
        System.out.println("Enter no of characters to search");

        int n = sc.nextInt();
        sc.nextLine(); // Consume the newline character left by nextInt()
        //precomputing
        for (int i = 0; i < str.length(); i++) {
            if(hash.containsKey(str.charAt(i))){
                int current = hash.get(str.charAt(i));
                hash.put(str.charAt(i), current+1);
            }else{
                hash.put(str.charAt(i), 1);
            }

        }

        System.out.println("Hash is "+hash);

        while(n > 0){
            System.out.println("Enter the characters");
            String c = sc.nextLine();
            char ch = c.charAt(0);
            System.out.println(ch+" is present: "+hash.getOrDefault(ch,0)+" times in the string");
            n--;
        }

    }
}
