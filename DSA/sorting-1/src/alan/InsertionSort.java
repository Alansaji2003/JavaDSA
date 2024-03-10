package alan;

import java.util.Arrays;

public class InsertionSort {

    static void sort(int[] arr){
        for (int i = 0; i <= arr.length -1; i++) {
            int j = i;
            while (j > 0 && arr[j -1] > arr[j] ){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j -1] = temp;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {3,5,6,8,1,4,7,9,2,4,7,8,3,2,2,2,5,3,5,1,5,7,9,32,1,123,4,5,5,666,7774,3};
        //sorting
        sort(arr);
        //printing
        System.out.println(Arrays.toString(arr));
    }
}
