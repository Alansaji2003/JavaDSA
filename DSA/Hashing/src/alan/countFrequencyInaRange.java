package alan;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//Problem statement
//        You are given an array 'arr' of length 'n' containing integers within the range '1' to 'x'.
//
//
//
//        Your task is to count the frequency of all elements from 1 to n.
//
//        Note:
//        You do not need to print anything. Return a frequency array as an array in the function such that index 0 represents the frequency of 1, index 1 represents the frequency of 2, and so on.
//        Example:
//        Input: ‘n’ = 6 ‘x’ = 9 ‘arr’ = [1, 3, 1, 9, 2, 7]
//        Output: [2, 1, 1, 0, 0, 0]
//        Explanation: Below Table shows the number and their counts, respectively, in the array
//        Number         Count
//        1                2
//        2                1
//        3                1
//        4                0
//        5                0
//        6                0
public class countFrequencyInaRange {
    public static int[] countFrequency(int n, int x, int []nums){
        // Write your code here.
        Map<Integer,Integer> map = new HashMap<>();
        //precompute
        for (int i = 0; i < n; i++) {
            if(map.containsKey(nums[i])){
                int curr = map.get(nums[i]);
                map.put(nums[i],curr+1 );
            }else{
                map.put(nums[i], 1);
            }
        }
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = map.getOrDefault(i+1,0);
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,4,4,1};
        System.out.println(Arrays.toString(countFrequency(5, 5, arr)));

    }
}
