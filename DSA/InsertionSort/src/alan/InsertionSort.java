package alan;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int [] arr = {1,4,5,2,4,6,2,1,6,8,9};

        //insertion sort: here we consider a sorted part and an unsorted part
        //then we slowly add elements in the sorted part and making a complete sorted array

        for (int i = 1; i < arr.length; i++) {

            int current = arr[i];
            int j = i - 1;
            while(j>=0 && current < arr[j]){
                arr[j+ 1] = arr[j];
                j--;
            }
            //placement
            arr[j+1] = current;

        }
        System.out.println(Arrays.toString(arr));

    }
}
//time complexity n^2