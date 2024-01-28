package alan;

import java.util.Arrays;

public class BubbleSort {
// the highest or the lowest number gets bubbled up on one side of the array

    static void bubblesort(int[] arr){
        //outer loop goes till the end of array
        for (int i = 0; i < arr.length-1; i++) {
            //inner loop goes till the point where its not already sorted
            for (int j = 0; j < arr.length -i - 1; j++) {
                //ascending
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int [] arr = {7,8,4,6,1,2,7,6,6,8,3,34,554,5,6,65,5,57,7,5,746,7,65,7,567,56,7,567,56,7,567,43,64,63};
        bubblesort(arr);
    }
}
