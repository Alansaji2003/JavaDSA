package alan.dsa;

import java.util.Scanner;

public class First {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s;
        String largest = "";

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        int start = 0;
        int end = start + k;
        String sub = "";
        for (int i = start; i < end; i++) {

            sub = s.substring(i, end);
            if (sub.compareTo(largest)>0){
                largest = sub;
            }if(sub.compareTo(smallest) < 0){
                smallest = sub;
            }


            if (end < s.length()){
                end++;
            }else{
                break;
            }

        }

        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}