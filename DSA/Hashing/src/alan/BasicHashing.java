package alan;

import java.util.Scanner;

public class BasicHashing {

    static int[] hash = new int[10000000];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Size of array:");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("enter each element");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        //precompute
        for (int i = 0; i < n; i++) {
            hash[arr[i]] += 1;
        }
        System.out.println("Enter number of queries");
        int q = sc.nextInt();
        System.out.println("Enter the queries");
        while (q > 0){
            int m = sc.nextInt();

            System.out.println(m+" is present in the array "+hash[m]+" times");
            q--;
        }


    }
}
