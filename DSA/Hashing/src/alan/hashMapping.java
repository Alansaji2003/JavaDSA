package alan;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class hashMapping {

    public static void main(String[] args) {

        Map<Integer,Integer> hash = new HashMap<>();    //using a hashmap

        Scanner sc = new Scanner(System.in);
        System.out.println("Size of array:");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("enter each element");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Count the frequency of numbers
        for (int i = 0; i < n; i++) {
            if(hash.containsKey(arr[i])) {
                // Increment the value associated with the current number key
                int current = hash.get(arr[i]);
                hash.put(arr[i], current + 1);
            } else {
                // If the key is not present, put it with value 1
                hash.put(arr[i], 1);
            }
        }

        //iterate in the map
        // stores in an unordered manner
        for(Map.Entry<Integer, Integer> entry : hash.entrySet()){
            System.out.println("key: "+entry.getKey() + "Value: "+entry.getValue());
        }

        System.out.println(hash);
        System.out.println("Enter number of queries");
        int q = sc.nextInt();
        System.out.println("Enter the queries");
        while (q > 0){
            int m = sc.nextInt();

            System.out.println(m + " is present in the array " + hash.getOrDefault(m, 0) + " times");
            q--;
        }
    }
}
