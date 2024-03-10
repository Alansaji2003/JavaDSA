package alan;

import java.util.Arrays;

public class SelectionSort {


    public static void sort(int[] arr){
        //swapping loop
        for (int i = 0; i <= arr.length-2; i++) {
            int min = i;
            //minimum finding loop
            for (int j = i; j <= arr.length - 1; j++) {
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;

        }

    }
    public static void main(String[] args) {
        //sort this array
        int[] arr = {3,5,6,8,1,4,7,9,2,4,7,8,3,2,2,2,5,3,5,1,5,7,9,32,1,123,4,5,5,666,7774,3};
        //sorting
        sort(arr);
        //printing
        System.out.println(Arrays.toString(arr));

    }
}
